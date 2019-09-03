package souza.aline;

import java.math.BigDecimal;

public interface PriceRule {
    Item getItem();
    BigDecimal getPrice(int amount);
}
