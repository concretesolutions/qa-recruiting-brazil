package com.codekata.kata09.pricing;

import com.codekata.kata09.item.Item;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("The unit price pricing rule")
class UnitPricePricingRuleTest extends AbstractPricingRuleTest {

    private static final Item ITEM = new Item("A", 20);

    @BeforeAll
    public static void beforeAll() {
        pricingRule = new UnitPricePricingRule();
    }

    @Test
    @DisplayName("Should produce a single pricing when the provided quantity is 1")
    public void testSingleApplication() {
        assertThat(pricingRule.apply(ITEM, 1))
                .haveExactly(1,
                        pricingWithSubtotalAndAffectedQuantity(ITEM.getUnitPrice(), 1));
    }

    @Test
    @DisplayName("Should produce n pricings for a provided quantity of n")
    public void testMultipleApplications() {
        assertThat(pricingRule.apply(ITEM, 5))
                .haveExactly(5,
                        pricingWithSubtotalAndAffectedQuantity(ITEM.getUnitPrice(), 1));
    }
}