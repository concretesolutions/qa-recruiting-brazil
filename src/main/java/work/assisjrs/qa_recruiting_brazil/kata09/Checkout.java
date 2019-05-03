package work.assisjrs.qa_recruiting_brazil.kata09;

import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

@Data
public class Checkout {
    @Getter
    private Rules rules;

    private List<Product> products = new ArrayList<>();

    public Checkout(final Rules rules) {
        this.rules = rules;
    }

    public BigDecimal getTotal() {

        final List<BigDecimal> amounts = new ArrayList<>(products.size());

        final Map<Product, Long> items = products.stream()
                                                 .collect(groupingBy(identity(), counting()));

        items.forEach((product, size) -> amounts.add(rules.getPrice(product.getSku(), size)));

        return amounts.stream()
                      .reduce(BigDecimal::add).get();
    }

    public void scan(final Product product) {
        products.add(product);
    }
}
