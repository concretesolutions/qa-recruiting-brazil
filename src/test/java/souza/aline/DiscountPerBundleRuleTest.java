package souza.aline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class DiscountPerBundleRuleTest {

    @Test
    public void unitPriceWithNullItem() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new DiscountPerBundleRule(null, 3, 30)
        );
    }

    @Test
    public void getPriceWithoutBundle() {
        var item = new Item("A", BigDecimal.valueOf(50));
        var rule = new DiscountPerBundleRule(item, 3, 13.33);

        Assertions.assertEquals(rule.getPrice(1).doubleValue(), 50, 0.1);
        Assertions.assertEquals(rule.getPrice(2).doubleValue(), 100, 0.1);
    }

    @Test
    public void getPriceWithBundle() {
        var item = new Item("A", BigDecimal.valueOf(50));
        var rule = new DiscountPerBundleRule(item, 3, 13.33);

        Assertions.assertEquals(rule.getPrice(3).doubleValue(), 130, 0.1);
    }

    @Test
    public void getPriceWithBundleAndRemainder() {
        var item = new Item("A", BigDecimal.valueOf(50));
        var rule = new DiscountPerBundleRule(item, 3, 13.33);

        Assertions.assertEquals(rule.getPrice(5).doubleValue(), 230, 0.1);
    }

    @Test
    public void getPriceWithMultipleBundles() {
        var item = new Item("A", BigDecimal.valueOf(50));
        var rule = new DiscountPerBundleRule(item, 3, 13.33);

        Assertions.assertEquals(rule.getPrice(9).doubleValue(), 390, 0.1);
    }



}
