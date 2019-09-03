package souza.aline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

public class CheckoutIntegrationTest {

    private Checkout checkout;

    private Item itemA;
    private Item itemB;
    private Item itemC;
    private Item itemD;

    @BeforeEach
    public void beforeEach() {

        this.itemA = new Item("A", BigDecimal.valueOf(50));
        this.itemB = new Item("B", BigDecimal.valueOf(30));
        this.itemC = new Item("C", BigDecimal.valueOf(20));
        this.itemD = new Item("D", BigDecimal.valueOf(15));

        var ruleA = new DiscountPerBundleRule(this.itemA, 3, 13.33);
        var ruleB = new DiscountPerBundleRule(this.itemB, 2, 25);
        var ruleC = new DiscountPerBundleRule(this.itemC, 3, 13.33);
        var ruleD = new DiscountPerBundleRule(this.itemD, 1, 0);

        this.checkout = new Checkout(List.of(ruleA, ruleB, ruleC, ruleD));

    }

    @Test
    public void checkoutA() throws PriceNotFoundException {
        checkout.scan(this.itemA);
        Assertions.assertEquals(50, checkout.getTotal().doubleValue(), 0.1);
    }

    @Test
    public void checkoutAAAC() throws PriceNotFoundException {
        checkout.scan(this.itemA);
        checkout.scan(this.itemA);
        checkout.scan(this.itemA);
        checkout.scan(this.itemC);
        Assertions.assertEquals(150, checkout.getTotal().doubleValue(), 0.1);
    }

    @Test
    public void checkoutAAABBBC() throws PriceNotFoundException {
        checkout.scan(this.itemA);
        checkout.scan(this.itemA);
        checkout.scan(this.itemA);
        checkout.scan(this.itemB);
        checkout.scan(this.itemB);
        checkout.scan(this.itemB);
        checkout.scan(this.itemC);
        Assertions.assertEquals(225, checkout.getTotal().doubleValue(), 0.1);
    }
}
