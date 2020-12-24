package tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import control.Checkout;
import entity.PriceRules;

public class BackToCheckoutTest {

	public Checkout co;
	private PriceRules rules;
	String scenarioName;

	@Before
	public void setUp() throws Exception {

		rules = new PriceRules();

		rules.newPriceRule("A", 50, 3, 130);
		rules.newPriceRule("B", 30, 2, 45);
		rules.newPriceRule("C", 20, 0, 0);
		rules.newPriceRule("D", 15, 0, 0);

		rules.printTable();
		System.out.println("----------------------------");
		System.out.print("\nStarting Scenario: ");

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\nEnd of scenario\n");
		System.out.println("----------------------------");

	}

	@Test
	public void testTotalSameItems() throws InterruptedException {
		System.out.println("Same Items\n");
		co = new Checkout(rules);

		int price0 = co.priceList("");co.printItemList(); co.printTotal();
		int priceA = co.priceList("A"); co.printItemList(); co.printTotal();
		int priceAA = co.priceList("AA"); co.printItemList(); co.printTotal();
		int priceAAA = co.priceList("AAA"); co.printItemList(); co.printTotal();
		int priceAAAA = co.priceList("AAAA"); co.printItemList(); co.printTotal();
		int priceAAAAA = co.priceList("AAAAA"); co.printItemList(); co.printTotal();
		int priceAAAAAA = co.priceList("AAAAAA"); co.printItemList(); co.printTotal();
		int priceB = co.priceList("B"); co.printItemList(); co.printTotal();
		int priceBB = co.priceList("BB"); co.printItemList(); co.printTotal();
		int priceBBB = co.priceList("BBB"); co.printItemList(); co.printTotal();
		int priceBBBB = co.priceList("BBBB"); co.printItemList(); co.printTotal();
		int priceBBBBB = co.priceList("BBBBB"); co.printItemList(); co.printTotal();
		int priceBBBBBB = co.priceList("BBBBBB"); co.printItemList(); co.printTotal();
		int priceC = co.priceList("C"); co.printItemList(); co.printTotal();
		int priceCC = co.priceList("CC"); co.printItemList(); co.printTotal();
		int priceCCC = co.priceList("CCC"); co.printItemList(); co.printTotal();
		int priceCCCC = co.priceList("CCCC"); co.printItemList(); co.printTotal();
		int priceCCCCC = co.priceList("CCCCC"); co.printItemList(); co.printTotal();
		int priceCCCCCC = co.priceList("CCCCCC"); co.printItemList(); co.printTotal();

		assertAll(
				() -> assertEquals(0, price0),
				() -> assertEquals(50, priceA),
				() -> assertEquals(100, priceAA),
				() -> assertEquals(130, priceAAA),
				() -> assertEquals(180, priceAAAA),
				() -> assertEquals(230, priceAAAAA),
				() -> assertEquals(260, priceAAAAAA),
				() -> assertEquals(30, priceB),
				() -> assertEquals(45, priceBB),
				() -> assertEquals(75, priceBBB),
				() -> assertEquals(90, priceBBBB),
				() -> assertEquals(120, priceBBBBB),
				() -> assertEquals(135, priceBBBBBB),
				() -> assertEquals(20, priceC),
				() -> assertEquals(40, priceCC),
				() -> assertEquals(60, priceCCC),
				() -> assertEquals(80, priceCCCC),
				() -> assertEquals(100, priceCCCCC),
				() -> assertEquals(120, priceCCCCCC)
				);
	}


	@Test
	public void testTotalDifferentItems() throws InterruptedException {
		System.out.println("Different Items\n");
		co = new Checkout(rules);

		int priceAB = co.priceList("AB"); co.printItemList(); co.printTotal();
		int priceABC = co.priceList("ABC"); co.printItemList(); co.printTotal();
		int priceABCD =co.priceList("ABCD"); co.printItemList(); co.printTotal();
		int priceDBCA =co.priceList("DBCA"); co.printItemList(); co.printTotal();

		assertAll(
				() -> assertEquals(80, priceAB),
				() -> assertEquals(100, priceABC),
				() -> assertEquals(115, priceABCD),
				() -> assertEquals(115, priceDBCA)
				);
	}





	@Test
	public void testTotalRepeatedItemsNoOrder() throws InterruptedException {
		System.out.println("Repeated Items And No Order\n");
		co = new Checkout(rules);

		int priceABB = co.priceList("ABB"); co.printItemList(); co.printTotal();
		int priceBAB = co.priceList("BAB"); co.printItemList(); co.printTotal();
		int priceAAAB = co.priceList("AAAB"); co.printItemList(); co.printTotal();
		int priceAAABB = co.priceList("AAABB"); co.printItemList(); co.printTotal();
		int priceABABA = co.priceList("ABABA"); co.printItemList(); co.printTotal();
		int priceCBCAB = co.priceList("CBCAB"); co.printItemList(); co.printTotal();
		int priceBABABABC = co.priceList("BABABABC"); co.printItemList(); co.printTotal();
		int priceADADACBDDB = co.priceList("ADADACBDDB"); co.printItemList(); co.printTotal();

		assertAll(
				() -> assertEquals(95, priceABB),
				() -> assertEquals(95, priceBAB),
				() -> assertEquals(160, priceAAAB),
				() -> assertEquals(175, priceAAABB),
				() -> assertEquals(175, priceABABA),
				() -> assertEquals(135, priceCBCAB),
				() -> assertEquals(240, priceBABABABC),
				() -> assertEquals(255, priceADADACBDDB)
				);
	}




	@Test
	public void testIncremental() throws InterruptedException {
		System.out.println("Incremental\n");
		co = new Checkout(rules);

		co.scan(""); int partial = co.getTotal();
		co.scan("A"); int partialA = co.getTotal();
		co.scan("B"); int partialAB = co.getTotal();
		co.scan("C"); int partialABC = co.getTotal();
		co.scan("B"); int partialABCB = co.getTotal();
		co.scan("D"); int partialABCBD = co.getTotal();
		co.scan("A"); int partialABCBDA = co.getTotal();
		co.scan("B"); int partialABCBDAB = co.getTotal();
		co.scan("A"); int partialABCBDABA = co.getTotal();
		co.scan("B"); int partialABCBDABAB = co.getTotal();

		co.printItemList();
		co.printTotal();


		assertAll(
				() -> assertEquals(0, partial),
				() ->  assertEquals(50, partialA),
				() ->  assertEquals(80, partialAB),
				() ->  assertEquals(100, partialABC),
				() ->  assertEquals(115, partialABCB),
				() ->  assertEquals(130, partialABCBD),
				() ->  assertEquals(180, partialABCBDA),
				() ->  assertEquals(210, partialABCBDAB),
				() ->  assertEquals(240, partialABCBDABA),
				() ->  assertEquals(255, partialABCBDABAB)
				);
	}
}
