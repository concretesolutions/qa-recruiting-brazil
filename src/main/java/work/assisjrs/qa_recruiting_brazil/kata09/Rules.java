package work.assisjrs.qa_recruiting_brazil.kata09;

import java.math.BigDecimal;

public class Rules {
    public BigDecimal getPrice(final String sku, final Long amount) {
        switch (sku) {
            case "A": {
                final long specials = amount / 3;
                final BigDecimal totalSpecialPrice = new BigDecimal(130f)
                        .multiply(new BigDecimal(specials));

                final long nonSpecials = amount % 3;
                final BigDecimal totalNonSpecialPrice = new BigDecimal(50f)
                        .multiply(new BigDecimal(nonSpecials));

                return totalNonSpecialPrice.add(totalSpecialPrice);
            }
            case "B": {
                final long specials = amount / 2;
                final BigDecimal totalSpecialPrice = new BigDecimal(45f)
                        .multiply(new BigDecimal(specials));

                final long nonSpecials = amount % 2;
                final BigDecimal totalNonSpecialPrice = new BigDecimal(30f)
                        .multiply(new BigDecimal(nonSpecials));

                return totalNonSpecialPrice.add(totalSpecialPrice);
            }
            case "C":
                return new BigDecimal(20f).multiply(new BigDecimal(amount));
            case "D":
                return new BigDecimal(15f).multiply(new BigDecimal(amount));

            default:
                return BigDecimal.ZERO;
        }
    }
}
