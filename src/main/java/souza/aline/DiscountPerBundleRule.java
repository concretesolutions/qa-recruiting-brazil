package souza.aline;

import java.math.BigDecimal;

public class DiscountPerBundleRule extends AbstractRule {

    private int bundleSize;
    private double discount;

    public DiscountPerBundleRule(Item item, int bundleSize, double discount) {
        super(item);

        if (bundleSize < 1 || discount < 0 || discount > 100) {
            throw new IllegalArgumentException();
        }

        this.bundleSize = bundleSize;
        this.discount = discount;
    }

    @Override
    public Item getItem() {
        return this.item;
    }

    @Override
    public BigDecimal getPrice(int amount) {
        var discountPercentage = BigDecimal.valueOf(this.discount / 100);
        var price = this.item.getPrice();
        var discountedPrice = price.subtract(price.multiply(discountPercentage));

        var bundles = amount / bundleSize;
        var remainder = amount % bundleSize;

        var remainderPrice = price.multiply(BigDecimal.valueOf(remainder));
        var bundlesPrice = discountedPrice.multiply(
                BigDecimal.valueOf(bundles * bundleSize)
        );

        return remainderPrice.add(bundlesPrice);
    }
}
