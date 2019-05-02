package work.assisjrs.qa_recruiting_brazil.kata09;

import java.math.BigDecimal;

public class Rules {
    public BigDecimal getPrice(final String sku, final int amount) {
        switch (sku)
        {
            case "A":
                return new BigDecimal(50f);
            case "B":
                return new BigDecimal(30f);
            case "C":
                return new BigDecimal(20f);
            case "D":
                return new BigDecimal(15f);

            default: return BigDecimal.ZERO;
        }
    }
}
