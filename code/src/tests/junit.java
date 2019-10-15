package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import code.kata09;

class junit {

	@Test
	void test_totals() {
		assertEquals(0, kata09.price(""));
		assertEquals(50, kata09.price("A"));
		assertEquals(80, kata09.price("AB"));
		assertEquals(115, kata09.price("CDBA"));
		assertEquals(100, kata09.price("AA"));
		assertEquals(130, kata09.price("AAA"));
		assertEquals(180, kata09.price("AAAA"));
		assertEquals(230, kata09.price("AAAAA"));
		assertEquals(260, kata09.price("AAAAAA"));
		assertEquals(160, kata09.price("AAAB"));
		assertEquals(175, kata09.price("AAABB"));
		assertEquals(190, kata09.price("AAABBD"));
		assertEquals(190, kata09.price("DABABA"));
	}
	
	@Test
	void test_incremental() {
		String total = "";
		
		assertEquals(0, kata09.price(total));
		
		total = kata09.scan(total,'A'); 
		assertEquals( 50, kata09.price(total));
		
		total = kata09.scan(total,'B'); 
		assertEquals( 80, kata09.price(total));
		
		total = kata09.scan(total,'A'); 
		assertEquals( 130, kata09.price(total));
		
		total = kata09.scan(total,'A'); 
		assertEquals( 160, kata09.price(total));
		
		total = kata09.scan(total,'B'); 
		assertEquals( 175, kata09.price(total));
	}
}
