import kata09.Checkout;
import kata09.Rules;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrice {

    Rules rules = new Rules(50, 30, 20, 15);

    public int price(String goods){
        Checkout co = new Checkout(rules);
        goods.chars().forEachOrdered(i -> co.scan(String.valueOf((char) i)));
        return co.total();
    }

    @Test
    public void testTotals() {

        assertEquals(0, price(""));

        assertEquals(50, price("A"));
        assertEquals(100, price("AA"));
        assertEquals(130, price("AAA"));
        assertEquals(180, price("AAAA"));
        assertEquals(230, price("AAAAA"));
        assertEquals(260, price("AAAAAA"));
        assertEquals(310, price("AAAAAAA"));

        assertEquals(30, price("B"));
        assertEquals(45, price("BB"));
        assertEquals(75, price("BBB"));
        assertEquals(90, price("BBBB"));
        assertEquals(120, price("BBBBB"));
        assertEquals(135, price("BBBBBB"));
        assertEquals(165, price("BBBBBBB"));

        assertEquals(20, price("C"));
        assertEquals(40, price("CC"));
        assertEquals(60, price("CCC"));
        assertEquals(80, price("CCCC"));
        assertEquals(100, price("CCCCC"));
        assertEquals(120, price("CCCCCC"));
        assertEquals(140, price("CCCCCCC"));

        assertEquals(15, price("D"));
        assertEquals(30, price("DD"));
        assertEquals(45, price("DDD"));
        assertEquals(60, price("DDDD"));
        assertEquals(75, price("DDDDD"));
        assertEquals(90, price("DDDDDD"));
        assertEquals(105, price("DDDDDDD"));

        assertEquals(80, price("AB"));
        assertEquals(115, price("CDBA"));
        assertEquals(160, price("AAAB"));
        assertEquals(175, price("AAABB"));
        assertEquals(190, price("AAABBD"));
        assertEquals(190, price("DABABA"));

    }

    @Test
    public void testIncremental(){
        Checkout co = new Checkout(rules);
        co.scan("A");
        assertEquals(50, co.total());
        co.scan("B");
        assertEquals(80, co.total());
        co.scan("A");
        assertEquals(130, co.total());
        co.scan("A");
        assertEquals(160, co.total());
        co.scan("B");
        assertEquals(175, co.total());
    }
}

