package work.assisjrs.qa_recruiting_brazil.kata09;

import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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

        products.forEach(p -> amounts.add(rules.getPrice(p.getSku(), 1)));

        return amounts.stream().reduce(BigDecimal::add).get();
    }

    public void scan(final Product product) {
        products.add(product);
    }
}
