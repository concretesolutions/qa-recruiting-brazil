package br.com.alexandre.codekata;

import java.util.HashMap;

public class Checkout implements ICheckout{

	private final ICheckoutRules checkoutRules;
	private final HashMap<String, Integer> items = new HashMap<>();
	
	public Checkout(ICheckoutRules checkoutRules) {
		this.checkoutRules = checkoutRules;
	}
	
	public void scan(String sku) {
		
		Integer skuQuantity = items.get(sku);
		
		if(skuQuantity == null) {
			items.put(sku, 1);
		} else {
			items.put(sku, skuQuantity + 1);
		}
	}
	
	public Double total() {
		return checkoutRules.total(items);
	}
	
}