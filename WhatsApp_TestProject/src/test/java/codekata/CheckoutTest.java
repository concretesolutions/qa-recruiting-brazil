package codekata;


import org.junit.Assert;
import org.junit.Test;

public class CheckoutTest {

	@Test
	public void runner() {
		Assert.assertTrue(getCheckout().price("").compareTo(0d) == 0);
		Assert.assertTrue(getCheckout().price("A").compareTo(50d) == 0);
		Assert.assertTrue(getCheckout().price("AB").compareTo(80d) == 0);
		Assert.assertTrue(getCheckout().price("CDBA").compareTo(115d) == 0);

		Assert.assertTrue(getCheckout().price("AA").compareTo(100d) == 0);
		Assert.assertTrue(getCheckout().price("AAA").compareTo(130d) == 0);
		Assert.assertTrue(getCheckout().price("AAAA").compareTo(180d) == 0);
		Assert.assertTrue(getCheckout().price("AAAAA").compareTo(230d) == 0);
		Assert.assertTrue(getCheckout().price("AAAAAA").compareTo(260d) == 0);

		Assert.assertTrue(getCheckout().price("AAAB").compareTo(160d) == 0);
		Assert.assertTrue(getCheckout().price("AAABB").compareTo(175d) == 0);
		Assert.assertTrue(getCheckout().price("AAABBD").compareTo(190d) == 0);
		Assert.assertTrue(getCheckout().price("DABABA").compareTo(190d) == 0);
	}

	private Checkout getCheckout() {
		return new Checkout();
	}
}
