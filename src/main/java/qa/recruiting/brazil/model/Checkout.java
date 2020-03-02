package qa.recruiting.brazil.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@Setter
public class Checkout {

    private List<Rule> rules;
    List<String> items = new ArrayList<>();


    public Checkout(List<Rule> rules) {
        this.rules = rules;
    }

    public int getTotal() {
        int total = 0;
        Map<String, Long> itemsQuantity = items.stream()
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()));

        if (itemsQuantity.size() > 0) {
            for (Rule rule : rules) {
                if (hasGoods(itemsQuantity, rule)) {
                    total = setTotalPrice(itemsQuantity, rule, total);
                }
            }
        }
        return total;
    }

    private int setTotalPrice(Map<String, Long> itemsQuantity, Rule rule, int total) {
        return hasSameQtd(itemsQuantity, rule) ? setTotalDiscountPrice(total, rule) : setTotalRegularPrice(itemsQuantity, rule, total);
    }

    private int setTotalRegularPrice(Map<String, Long> itemsQuantity, Rule rule, int total) {
        return total += getRuleUnitPrice(rule) * getItemQtd(itemsQuantity, rule);
    }

    private int setTotalDiscountPrice(int total, Rule rule) {
        return total += rule.getPrice();
    }

    private int getItemQtd(Map<String, Long> itemsQuantity, Rule rule) {
        return itemsQuantity.get(rule.getGoods().getSku()).intValue();
    }

    private int getRuleUnitPrice(Rule rule) {
        return rule.getGoods().getUnitPrice();
    }

    private boolean hasSameQtd(Map<String, Long> itemsQuantity, Rule rule) {
        return rule.getGoodsQtd() == getItemQtd(itemsQuantity, rule);
    }

    private boolean hasGoods(Map<String, Long> itemsQuantity, Rule rule) {
        return itemsQuantity.containsKey(rule.getGoods().getSku());
    }

    public void scan(String goods) {
        items.add(goods);
    }
}
