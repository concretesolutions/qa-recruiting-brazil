import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.alexandre.codekata.Checkout;
import br.com.alexandre.codekata.CheckoutRuleBuilder;
import br.com.alexandre.codekata.ICheckoutRules;

public class CheckOutTest {
	public ICheckoutRules checkoutRules;

	@Before
	public void initTest() {
		this.checkoutRules = new CheckoutRuleBuilder()
				.addSpecialPrice("A", 50.0, 3, 130.0)
				.addSpecialPrice("B", 30.0, 2, 45.0)
				.addPrice("C", 20.0)
				.addPrice("D", 15.0)
				.build();
	}
	
	@Test
	public void testaTotais() {
		assertEquals(0.0, calculaItem(""), 0);
		assertEquals(50.0, calculaItem("A"), 0);
		assertEquals(80.0, calculaItem("AB"), 0);
		assertEquals(115.0, calculaItem("CDBA"), 0);
	
		assertEquals(100.0, calculaItem("AA"), 0);
		assertEquals(130.0, calculaItem("AAA"), 0);
		assertEquals(180.0, calculaItem("AAAA"), 0);
		assertEquals(230.0, calculaItem("AAAAA"), 0);
		assertEquals(260, calculaItem("AAAAAA"), 0);
	
		assertEquals(160.0, calculaItem("AAAB"), 0);
		assertEquals(175.0, calculaItem("AAABB"), 0);
		assertEquals(190.0, calculaItem("AAABBD"), 0);
		assertEquals(190.0, calculaItem("DABABA"), 0);
	}


	
	private Double calculaItem(String skus) {
		Checkout checkout = new Checkout(checkoutRules);
		
		for (String sku : skus.split("")) {
			checkout.scan(sku);
		}	
		
		return checkout.total();
	}

}