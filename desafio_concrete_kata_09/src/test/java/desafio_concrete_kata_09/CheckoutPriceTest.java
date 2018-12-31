package desafio_concrete_kata_09;

import desafio_concrete_kata_09.Checkout;

import org.junit.Assert;
import org.junit.Test;

public class CheckoutPriceTest {
	
	/**
	 * Method responsible for performing the test that
	 * calculates the prices according to the rules of price.
	 */

	@Test
	public void testCalcPrice() {

		Checkout checkout = new Checkout();
		Assert.assertEquals(0, checkout.getTotalProducts(""));
		Assert.assertEquals(50, checkout.getTotalProducts("A"));
		Assert.assertEquals(80, checkout.getTotalProducts("AB"));
		Assert.assertEquals(115, checkout.getTotalProducts("CDBA"));
		Assert.assertEquals(100, checkout.getTotalProducts("AA"));
		Assert.assertEquals(130, checkout.getTotalProducts("AAA"));
		Assert.assertEquals(180, checkout.getTotalProducts("AAAA"));
		Assert.assertEquals(230, checkout.getTotalProducts("AAAAA"));
		Assert.assertEquals(260, checkout.getTotalProducts("AAAAAA"));
		Assert.assertEquals(160, checkout.getTotalProducts("AAAB"));
		Assert.assertEquals(175, checkout.getTotalProducts("AAABB"));
		Assert.assertEquals(190, checkout.getTotalProducts("AAABBD"));
		Assert.assertEquals(190, checkout.getTotalProducts("DABABA"));

	}

	/**
	 * Test responsible for calculating the individual and
	 * incremental value of the products.
	 */
	@Test
	public void testCalIncremental() {

		Checkout checkout = new Checkout();

		Assert.assertEquals(0, checkout.getPriceIndividual());
		checkout.setProductItem("A");
		Assert.assertEquals(50, checkout.getPriceIndividual());
		checkout.setProductItem("B");
		Assert.assertEquals(80, checkout.getPriceIndividual());
		checkout.setProductItem("A");
		Assert.assertEquals(130, checkout.getPriceIndividual());
		checkout.setProductItem("A");
		Assert.assertEquals(160, checkout.getPriceIndividual());
		checkout.setProductItem("B");
		Assert.assertEquals(175, checkout.getPriceIndividual());
	}

}
