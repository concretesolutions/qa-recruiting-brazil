package com.codekata.kata09.item;

import java.util.Objects;

public final class Item {

    private final String sku;
    private final int unitPrice;

    public Item(final String sku, final int unitPrice) {
        this.sku = sku;
        this.unitPrice = unitPrice;
    }

    public String getSku() {
        return sku;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(sku);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) {
            return false;
        } else if (this == other) {
            return true;
        } else if (!(other instanceof Item)) {
            return false;
        }
        return Objects.equals(this.sku, ((Item) other).getSku());
    }
}
