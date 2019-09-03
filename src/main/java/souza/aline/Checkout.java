package souza.aline;

import java.math.BigDecimal;
import java.util.*;

public class Checkout {
    private Set<PriceRule> rules;
    private Map<Item, Integer> items;

    public Checkout(Collection<PriceRule> rules) {
        this.rules = new HashSet<>(rules);
        this.items = new HashMap<>();
    }

    public void scan(Item item) throws PriceNotFoundException {
        if (!this.hasPrice(item)) {
            throw new PriceNotFoundException();
        }

        this.items.merge(item, 1, Integer::sum);
    }

    public BigDecimal getTotal() {
        return this.items
                .entrySet()
                .stream()
                .map(e -> {
                    var rule = this.getRuleByItem(e.getKey()).get();
                    return rule.getPrice(e.getValue());
                }).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public boolean hasPrice(Item item) {
        return this.getRuleByItem(item).isPresent();
    }

    public int getNumberOfItems() {
        return this.items.values().stream().reduce(0, Integer::sum);
    }

    public Optional<PriceRule> getRuleByItem(Item item) {
        return this.rules.stream().filter(r -> r.getItem().equals(item)).findAny();
    }
}
