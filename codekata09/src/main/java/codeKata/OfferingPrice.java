package codeKata;

public class OfferingPrice {

public int priceOffering(String itens) {
	
		int itemA, itemB, itemC, itemD, specialPriceA, specialPriceB;
		itemA = itemB = itemC = itemD = specialPriceA = specialPriceB = 0;
		
		TotalPrice totalPrice = new TotalPrice();
		
		    for(int i = 0; i < itens.length(); i++) {
		    	String letter = Character.toString(itens.charAt(i));
		    	
		    	if(letter.equals("A")) {
		    		itemA = itemA + 50;
		    	}
		    	
		    	if(letter.equals("B")) {
		    		itemB = itemB + 30;
		    	}
		    	
		    	if(letter.equals("C")) {
		    		itemC = itemC + 20;
		    	}
		    	
		    	if(letter.equals("D")) {
		    		itemD = itemD + 15;
		    	}
		    	
			    if(itemA == 150) {
			    	specialPriceA = specialPriceA + 130;
			    	itemA = 0;
			    	
			    }
			    if(itemB == 60) {
			    	specialPriceB = specialPriceB + 45;
			    	itemB = 0;
			    }		    	
	        }
		    
		    return totalPrice.sumOfValues(itemA, itemB, itemC, itemD, specialPriceA, specialPriceB); 	
	}
}