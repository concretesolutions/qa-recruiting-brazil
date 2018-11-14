package br.com.alexandre.codekata;

public class CheckoutRuleBuilder {
	ICheckoutRules checkoutRules = new CheckoutRules();
	
	public CheckoutRuleBuilder() {
		
	};
	
	public CheckoutRuleBuilder addPrice(String sku, Double price) {
		checkoutRules.addPrice(new Price(sku, price));
		return this;
	}
	
	public CheckoutRuleBuilder addSpecialPrice(String sku, Double price, int specialQuantity, Double specialPrice) {
		checkoutRules.addPrice(new SpecialPrice(sku, price, specialQuantity, specialPrice));
		return this;
	}
	
	public ICheckoutRules build() {
		return checkoutRules;
	}
}
