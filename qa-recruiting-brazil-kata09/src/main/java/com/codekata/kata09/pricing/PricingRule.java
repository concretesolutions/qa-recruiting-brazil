package com.codekata.kata09.pricing;

import com.codekata.kata09.item.Item;

import java.util.List;
import java.util.function.BiFunction;

@FunctionalInterface
public interface PricingRule extends BiFunction<Item, Integer, List<Pricing>> {
}
