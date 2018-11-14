package br.com.alexandre.codekata;

import java.util.HashMap;

public interface ICheckoutRules {

	public void addPrice(Price price);

	public Double total(HashMap<String, Integer> items);
}
