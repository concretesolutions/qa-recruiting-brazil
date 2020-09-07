package com.codekata.kata09.pricing;

import com.codekata.kata09.item.Item;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Collections.emptyList;

public final class SpecialPricePricingRule implements PricingRule {

    private final String sku;
    private final int requiredQuantity;
    private final int discount;

    public SpecialPricePricingRule(final String sku, final int requiredQuantity, final int discount) {
        this.sku = sku;
        this.requiredQuantity = requiredQuantity;
        this.discount = discount;
    }

    @Override
    public List<Pricing> apply(final Item item, final Integer quantity) {
        if (item == null || quantity == null || quantity <= 0 || !sku.equals(item.getSku())) {
            return emptyList();
        }
        final int applicationCount = quantity / requiredQuantity;
        return IntStream
                .range(0, applicationCount)
                .mapToObj(dontCare -> {
                    final int standardPrice = requiredQuantity * item.getUnitPrice();
                    return new Pricing(standardPrice - discount, requiredQuantity);
                }).collect(Collectors.toList());
    }
}