package testes;

import codeKata.OfferingPrice;

public class KataTest {
	
	private static boolean assertions(int value, int price) {
		if(value == price) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		OfferingPrice offer = new OfferingPrice();
		
		assertions(  0, offer.priceOffering(""));      
		assertions( 50, offer.priceOffering("A"));      
		assertions( 80, offer.priceOffering("AB"));
		assertions(115, offer.priceOffering("CDBA"));

		assertions(100, offer.priceOffering("AA"));
		assertions(130, offer.priceOffering("AAA"));
		assertions(180, offer.priceOffering("AAAA"));
		assertions(230, offer.priceOffering("AAAAA"));
		assertions(260, offer.priceOffering("AAAAAA"));

		assertions(160, offer.priceOffering("AAAB"));
		assertions(175, offer.priceOffering("AAABB"));
		assertions(190, offer.priceOffering("AAABBD"));
		assertions(190, offer.priceOffering("DABABA"));
	    
	}
}