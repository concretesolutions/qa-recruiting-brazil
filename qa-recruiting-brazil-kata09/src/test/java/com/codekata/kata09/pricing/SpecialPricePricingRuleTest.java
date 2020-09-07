package com.codekata.kata09.pricing;

import com.codekata.kata09.item.Item;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("The special price pricing rule")
class SpecialPricePricingRuleTest extends AbstractPricingRuleTest {

    private static final Item ITEM = new Item("A", 40);

    @BeforeAll
    public static void beforeAll() {
        pricingRule = new SpecialPricePricingRule("A", 2, 20);
    }

    @Test
    @DisplayName("Should return an empty list when the provided quantity is not high enough")
    public void testWithTooLittleQuantity() {
        assertThat(pricingRule.apply(ITEM, 1)).isEmpty();
    }

    @Test
    @DisplayName("Should produce one pricing when the provided quantity is sufficient for one application")
    public void testSingleApplication() {
        assertThat(pricingRule.apply(ITEM, 2))
                .haveExactly(1, pricingWithSubtotalAndAffectedQuantity(60, 2));
    }

    @Test
    @DisplayName("Should only produce one pricing when the provided quantity is sufficient for just one application")
    public void testSingleApplicationWithRest() {
        assertThat(pricingRule.apply(ITEM, 3))
                .haveExactly(1, pricingWithSubtotalAndAffectedQuantity(60, 2));
    }

    @Test
    @DisplayName("Should produce multiple pricings when the provided quantity is a multiple of the required one")
    public void testMultipleApplications() {
        assertThat(pricingRule.apply(ITEM, 6))
                .haveExactly(3, pricingWithSubtotalAndAffectedQuantity(60, 2));
    }
}