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
//        Predicate<Rule> hasGoods = rule -> itemsQuantity.containsKey(rule.getGoods().getSku());
//        rules.stream()
//                .filter(rule -> hasGoods.and(quantityIsSame) ? total = total + rule.getPrice() : true)
//                .map(rule -> hasGoods ? total = total + (rule.getGoods().getUnitPrice() * itemsQuantity.get(rule.getGoods().getSku()).intValue()) : true);
        int total = 0;
        Map<String, Long> itemsQuantity = items.stream()
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()));
        if (itemsQuantity.size() > 0) {
            for (Rule rule : rules) {
                if (itemsQuantity.containsKey(rule.getGoods().getSku()) && rule.getGoodsQtd() == itemsQuantity.get(rule.getGoods().getSku()).intValue()) {
                    total = total + rule.getPrice();
                } else if (itemsQuantity.containsKey(rule.getGoods().getSku())) {
                    total = total + (rule.getGoods().getUnitPrice() * itemsQuantity.get(rule.getGoods().getSku()).intValue()) ;
                }
            }
        }
        return total;
    }

    public void scan(String goods) {
        items.add(goods);
    }
}
