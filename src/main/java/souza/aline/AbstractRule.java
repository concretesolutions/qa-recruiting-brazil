package souza.aline;

public abstract class AbstractRule implements  PriceRule {

    protected Item item;

    public AbstractRule(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }

        this.item = item;
    }

    @Override
    public Item getItem() {
        return this.item;
    }

}
