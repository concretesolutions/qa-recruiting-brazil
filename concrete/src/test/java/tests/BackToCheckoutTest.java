package tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import control.Checkout;
import entity.PriceRules;

public class BackToCheckoutTest {

	public Checkout co;
	private PriceRules rules;

	@Before
	public void setUp() throws Exception {

		rules = new PriceRules();
		
		rules.newPriceRule("A", 50, 3, 130);
		rules.newPriceRule("B", 30, 2, 45);
		rules.newPriceRule("C", 20, 0, 0);
		rules.newPriceRule("D", 15, 0, 0);

		rules.printTable();
		System.out.println("----------------------------");
		System.out.println("\nStarting Scenario\n");

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\nEnd of scenario\n");
		System.out.println("----------------------------");

	}

	@Test
	public void testTotalSameItems() throws InterruptedException {
		co = new Checkout(rules);

		assertEquals(0, co.priceList(""));
		co.printItemList();
		co.printTotal();

		assertEquals(50, co.priceList("A"));
		co.printItemList();
		co.printTotal();

		assertEquals(100, co.priceList("AA"));
		co.printItemList();
		co.printTotal();

		assertEquals(130, co.priceList("AAA"));
		co.printItemList();
		co.printTotal();

		assertEquals(180, co.priceList("AAAA"));
		co.printItemList();
		co.printTotal();

		assertEquals(230, co.priceList("AAAAA"));
		co.printItemList();
		co.printTotal();

		assertEquals(260, co.priceList("AAAAAA"));
		co.printItemList();
		co.printTotal();

		assertEquals(30, co.priceList("B"));
		co.printItemList();
		co.printTotal();

		assertEquals(45, co.priceList("BB"));
		co.printItemList();
		co.printTotal();

		assertEquals(75, co.priceList("BBB"));
		co.printItemList();
		co.printTotal();

		assertEquals(90, co.priceList("BBBB"));
		co.printItemList();
		co.printTotal();

		assertEquals(120, co.priceList("BBBBB"));
		co.printItemList();
		co.printTotal();

		assertEquals(135, co.priceList("BBBBBB"));
		co.printItemList();
		co.printTotal();

		assertEquals(20, co.priceList("C"));
		co.printItemList();
		co.printTotal();

		assertEquals(40, co.priceList("CC"));
		co.printItemList();
		co.printTotal();

		assertEquals(60, co.priceList("CCC"));
		co.printItemList();
		co.printTotal();

		assertEquals(80, co.priceList("CCCC"));
		co.printItemList();
		co.printTotal();

		assertEquals(100, co.priceList("CCCCC"));
		co.printItemList();
		co.printTotal();

		assertEquals(120, co.priceList("CCCCCC"));
		co.printItemList();
		co.printTotal();

	}

	@Test
	public void testTotalDifferentItems() throws InterruptedException {
		co = new Checkout(rules);

		assertEquals(80, co.priceList("AB"));
		co.printItemList();
		co.printTotal();

		assertEquals(100, co.priceList("ABC"));
		co.printItemList();
		co.printTotal();

		assertEquals(115, co.priceList("ABCD"));
		co.printItemList();
		co.printTotal();

		assertEquals(115, co.priceList("DBCA"));
		co.printItemList();
		co.printTotal();
	}

	@Test
	public void testTotalRepeatedItemsNoOrder() throws InterruptedException {
		co = new Checkout(rules);

		assertEquals(95, co.priceList("ABB"));
		co.printItemList();
		co.printTotal();

		assertEquals(95, co.priceList("BAB"));
		co.printItemList();
		co.printTotal();

		assertEquals(160, co.priceList("AAAB"));
		co.printItemList();
		co.printTotal();

		assertEquals(175, co.priceList("AAABB"));
		co.printItemList();
		co.printTotal();

		assertEquals(175, co.priceList("ABABA"));
		co.printItemList();
		co.printTotal();

		assertEquals(135, co.priceList("CBCAB"));
		co.printItemList();
		co.printTotal();

		assertEquals(240, co.priceList("BABABABC"));
		co.printItemList();
		co.printTotal();

		assertEquals(255, co.priceList("ADADACBDDB"));
		co.printItemList();
		co.printTotal();
	}

	@Test
	public void testIncremental() throws InterruptedException {
		co = new Checkout(rules);
		
		assertEquals(0, co.getTotal());
		co.scan("A"); assertEquals(50, co.getTotal());
		co.scan("B"); assertEquals(80, co.getTotal()); 
		co.scan("C"); assertEquals(100, co.getTotal());
		co.scan("B"); assertEquals(115, co.getTotal());
		co.scan("D"); assertEquals(130, co.getTotal());
		co.scan("A"); assertEquals(180, co.getTotal());
		co.scan("B"); assertEquals(210, co.getTotal());
		co.scan("A"); assertEquals(240, co.getTotal());
		co.scan("B"); assertEquals(255, co.getTotal());
		
		co.printItemList();
		co.printTotal();
		
	}

}
