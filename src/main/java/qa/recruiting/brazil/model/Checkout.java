package qa.recruiting.brazil.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Getter
@Setter
public class Checkout {

    private List<Rule> rules;
    List<String> items = new ArrayList<>();

    public Checkout(List<Rule> rules) {
        this.rules = rules;
    }

    public void scan(String goods) {
        items.add(goods);
    }

    public int getTotal() {
        AtomicInteger total = new AtomicInteger();
        Map<String, Long> itemsQuantity = items.stream()
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()));

        if (itemsQuantity.size() > 0) {
            itemsQuantity.forEach((item, quantity) ->
            {
                Rule currentRule = rules.stream()
                        .filter(rule -> isTheSameRule(item, rule))
                        .findFirst()
                        .get();
                total.set(setTotalPrice(quantity.intValue(), currentRule, total.get()));
            });
        }
        return total.get();
    }

    private boolean isTheSameRule(String item, Rule rule) {
        return rule.getGoods().getSku().equals(item);
    }

    private int setTotalPrice(int quantity, Rule rule, int total) {
        if (quantity == 1) {
            total = setTotalRegularPrice(quantity, rule, total);
        } else {
            total = setTotalDiscountPrice(quantity, rule, total);
        }
        return total;
    }

    private int setTotalRegularPrice(int quantity, Rule rule, int total) {
        return total + getRuleUnitPrice(rule) * quantity;
    }

    private int setTotalDiscountPrice(int quantity, Rule rule, int total) {
        int multiplicandFactor = 0;
        int mode = rule.getGoodsQtd() % quantity;
        int rest = quantity % rule.getGoodsQtd();

        if(mode == 0) {
            multiplicandFactor = rule.getGoodsQtd() / quantity;
        } else if (mode == rule.getGoodsQtd()) {
            multiplicandFactor = quantity / rule.getGoodsQtd();
        }

        return total + (rule.getPrice() * multiplicandFactor) + (getRuleUnitPrice(rule) * rest);
    }

    private int getRuleUnitPrice(Rule rule) {
        return rule.getGoods().getUnitPrice();
    }
}
