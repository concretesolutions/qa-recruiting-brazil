package testes;

import static org.junit.Assert.*;
import org.junit.Test;

import checkout.CheckOut;

public class CheckOutTest {

	@Test
	public void test_incremental() {
		CheckOut co = new CheckOut();
		
		co.scan("A"); assertEquals(50, co.total());
		co.scan("B"); assertEquals(80, co.total());
		co.scan("A"); assertEquals(130, co.total());
        co.scan("A"); assertEquals(160, co.total());
        co.scan("B"); assertEquals(175, co.total());
		
	}
	
	
	@Test
	public void test_totals() {
		
		assertEquals(0, price(""));
		assertEquals(50, price("A"));
        assertEquals(80, price("AB"));
        assertEquals(115, price("CDBA"));

        assertEquals(100, price("AA"));
        assertEquals(130, price("AAA"));
        assertEquals(180, price("AAAA"));
        assertEquals(230, price("AAAAA"));
        assertEquals(260, price("AAAAAA"));

        assertEquals(160, price("AAAB"));
        assertEquals(175, price("AAABB"));
        assertEquals(190, price("AAABBD"));
        assertEquals(190, price("DABABA"));
      
	}

	
	public static int price(String conjunto){
		
		CheckOut ck = new CheckOut();
		ck.reset();
		
		for (int i = 0; i < conjunto.length(); i++){
			String item = Character.toString(conjunto.charAt(i));
			ck.scan(item);
		}
		return ck.total();
		
	} 
}
