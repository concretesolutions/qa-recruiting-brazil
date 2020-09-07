package com.codekata.kata09.pricing;

import com.codekata.kata09.item.Item;
import org.assertj.core.api.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

abstract class AbstractPricingRuleTest {

    private static final Item TEST_ITEM = new Item("X", 1);

    static PricingRule pricingRule;

    @Test
    @DisplayName("Should return an empty list when the provided Item is null")
    public void testWithNullItem() {
        assertThat(pricingRule.apply(null, 1)).isEmpty();
    }

    @Test
    @DisplayName("Should return an empty list when the provided quantity is null")
    public void testWithNullQuantity() {
        assertThat(pricingRule.apply(TEST_ITEM, null)).isEmpty();
    }

    @Test
    @DisplayName("Should return an empty list when the provided quantity is zero")
    public void testWithZeroQuantity() {
        assertThat(pricingRule.apply(TEST_ITEM, 0)).isEmpty();
    }

    @Test
    @DisplayName("Should return an empty list when the provided quantity is negative")
    public void testWithNegativeQuantity() {
        assertThat(pricingRule.apply(TEST_ITEM, -1)).isEmpty();
    }

    public static Condition<Pricing> pricingWithSubtotalAndAffectedQuantity(final int subTotal,
                                                                            final int affectedQuantity) {
        return new Condition<>(pricing ->
                pricing.getSubTotal() == subTotal && pricing.getAffectedQuantity() == affectedQuantity,
                "Pricing with subTotal %d and affectedQuantity %d", subTotal, affectedQuantity);
    }
}