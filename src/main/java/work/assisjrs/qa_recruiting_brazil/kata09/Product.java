package work.assisjrs.qa_recruiting_brazil.kata09;

import lombok.Data;
import lombok.Getter;

@Data
public class Product {
    @Getter
    private String sku;

    public Product(final String sku) {
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }
}
