package com.codekata.kata09.pricing;

import com.codekata.kata09.item.Item;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Collections.emptyList;

public final class UnitPricePricingRule implements PricingRule {
    @Override
    public List<Pricing> apply(final Item item, final Integer quantity) {
        if (item == null || quantity == null || quantity <= 0) {
            return emptyList();
        }
        return IntStream.range(0, quantity)
                .mapToObj(dontCare -> new Pricing(item.getUnitPrice(), 1))
                .collect(Collectors.toList());
    }
}
