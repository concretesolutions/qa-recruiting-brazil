package br.com.alexandre.codekata;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CheckoutRules implements ICheckoutRules{
	
	private Set<Price> priceSet = new HashSet<>();	

	@Override
	public void addPrice(Price price) {
		priceSet.add(price);
	}

	@Override
	public Double total(HashMap<String, Integer> items) {
		Double total = 0.0;
		
		for (String sku : items.keySet()) {
			for (Price price : priceSet) {
				if(price.getSku().equals(sku)) {
					total += price.calculateTotalPrice(items.get(sku));
				}
			}
		}

		return total;
	}

}
