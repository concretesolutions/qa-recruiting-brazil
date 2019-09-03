package souza.aline;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {

    private String code;
    private BigDecimal price;

    public Item (String code, BigDecimal price) {
        if (code == null || code.isEmpty() || price == null) {
            throw new IllegalArgumentException();
        }
        this.price = price;
        this.code = code;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Item item = (Item) obj;

        return Objects.equals(this.code, item.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.code);
    }

    public String getCode() {
        return this.code;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
}
