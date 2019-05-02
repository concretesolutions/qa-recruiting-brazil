package work.assisjrs.qa_recruiting_brazil.kata09;

import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Data
public class Checkout {
    @Getter
    private Rules rules;

    private Product product;

    public Checkout(final Rules rules){
        this.rules = rules;
    }

    public BigDecimal getTotal(){
        return rules.getPrice(product.getSku(), 1);
    }

    public void scan(final Product product) {
        this.product = product;
    }
}
