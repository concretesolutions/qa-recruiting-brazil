package souza.aline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class CheckoutTest {

    @Test
    public void hasPriceWithUnregisteredItem() {
        Checkout checkout = new Checkout(Collections.emptyList());
        Assertions.assertFalse(checkout.hasPrice(new Item("A", BigDecimal.ZERO)));
    }

    @Test
    public void hasPriceWithRegisteredItem() {
        Item item = new Item("A", BigDecimal.ZERO);

        PriceRule rule = Mockito.mock(PriceRule.class);
        Mockito.when(rule.getItem()).thenReturn(item);

        Checkout checkout = new Checkout(List.of(rule));

        Assertions.assertTrue(checkout.hasPrice(item));
    }

    @Test
    public void scanWithUnregisteredItem() {
        Checkout checkout = new Checkout(Collections.emptyList());
        Assertions.assertThrows(PriceNotFoundException.class, () -> {
            checkout.scan(new Item("A", BigDecimal.ZERO));
        });
    }

    @Test
    public void scanWithRegisteredItems() throws PriceNotFoundException {
        Item itemA = new Item("A", BigDecimal.ZERO);
        Item itemB = new Item("B", BigDecimal.ZERO);

        PriceRule ruleA = Mockito.mock(PriceRule.class);
        Mockito.when(ruleA.getItem()).thenReturn(itemA);

        PriceRule ruleB = Mockito.mock(PriceRule.class);
        Mockito.when(ruleB.getItem()).thenReturn(itemB);

        Checkout checkout = new Checkout(List.of(ruleA, ruleB));

        checkout.scan(itemA);
        checkout.scan(itemA);
        checkout.scan(itemB);

        Assertions.assertEquals(3, checkout.getNumberOfItems());
    }

    @Test
    public void getTotalWithNoItems() {
        Checkout checkout = new Checkout(Collections.emptySet());
        Assertions.assertEquals(BigDecimal.ZERO, checkout.getTotal());
    }

    @Test
    public void getTotalWithMultipleItems() throws PriceNotFoundException {
        BigDecimal priceA = BigDecimal.valueOf(25);
        Item itemA = new Item("A", priceA);

        PriceRule ruleA = Mockito.mock(PriceRule.class);
        Mockito.when(ruleA.getPrice(3)).thenReturn(priceA);
        Mockito.when(ruleA.getItem()).thenReturn(itemA);

        BigDecimal priceB = BigDecimal.valueOf(50);
        Item itemB = new Item("B", priceB);

        PriceRule ruleB = Mockito.mock(PriceRule.class);
        Mockito.when(ruleB.getPrice(2)).thenReturn(priceB);
        Mockito.when(ruleB.getItem()).thenReturn(itemB);

        Checkout checkout = new Checkout(List.of(ruleA, ruleB));

        checkout.scan(itemA);
        checkout.scan(itemA);
        checkout.scan(itemA);
        checkout.scan(itemB);
        checkout.scan(itemB);

        Assertions.assertEquals(priceA.add(priceB), checkout.getTotal());
    }
}
