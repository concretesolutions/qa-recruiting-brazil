package com.codekata.kata09.pricing;

public final class Pricing {

    private final int subTotal;
    private final int affectedQuantity;

    public Pricing(final int subTotal, final int affectedQuantity) {
        this.subTotal = subTotal;
        this.affectedQuantity = affectedQuantity;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public int getAffectedQuantity() {
        return affectedQuantity;
    }
}
