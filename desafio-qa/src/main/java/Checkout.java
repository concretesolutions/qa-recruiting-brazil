import Utils.MathUtils;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;




public class Checkout{

    CheckoutRules rules;
    List<String> items = new ArrayList<>();

    public Checkout(CheckoutRules rules){
        this.rules = rules;
    }

    public Long getTotalPrice(){
        LinkedHashMap<String, Long> skus = (LinkedHashMap)items.stream().collect(groupingBy(identity(), counting()));
        List<Long> itemTotals = new ArrayList<>();

        for(Map.Entry<String, Long> entry: skus.entrySet()) {
            String product = entry.getKey();
            Long quantity = entry.getValue();
            itemTotals.add(rules.applyPricingRules(product,quantity));
        }

        Long totalPrice = MathUtils.sum(itemTotals);

        return totalPrice;
    }

    public void scan(final String sku) {
        items.add(sku);
    }

}
