package com.codekata.kata09.item;

import java.util.Optional;

public interface ItemRepository {
    Optional<Item> findBySku(final String sku);
}