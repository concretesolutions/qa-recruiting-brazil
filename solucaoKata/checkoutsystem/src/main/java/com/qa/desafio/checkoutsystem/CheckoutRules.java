package com.qa.desafio.checkoutsystem;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CheckoutRules {

	private Double value = 0.00;
	private Item item = new Item();
	private String valueFormat;
	DecimalFormat formatter = new DecimalFormat("#0.00");

	public String Calcula(int qtd, String product, Double price) {
		value = item.priceOfProduct(product, price);

		if (qtd == 0) {
			value = null;
			return valueFormat = null;
		} else {
			if (qtd >= 2) {
				if (product.equals("A")) {
					value = ((value * qtd) - 0.20);
				} else if (product.equals("B")) {
					value = ((value * qtd) - 0.15);
				}
			} else {
				value = (value * qtd);
			}
			return valueFormat = formatter.format(value);
		}

	}

	public String CalculaVarios(ArrayList<Integer> qtd, ArrayList<String> products, ArrayList<Double> price) {
		ArrayList<Item> lista = new ArrayList<Item>();
		Item item2 = null;

		Double valueA = 0.00;
		Double valueB = 0.00;
		Double valueOther = 0.00; // teria uma forma de fazer alguma lista deste atributo para nao precisar ficar
									// repetindo o código IF
		Double sum = 0.00;

		if (qtd.size() == 0) {
			value = null;
			return valueFormat = null;
		} else {
			for (int i = 0; i < qtd.size(); i++) {
				item2 = new Item();
				item2.setProduct(products.get(i));
				item2.setPrice(price.get(i));
				lista.add(item2);
			}

			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getProduct().equals("A")) {
					if (qtd.get(i) > 2) {
						valueA = ((lista.get(i).getPrice() * qtd.get(i)) - 0.20);
					} else {
						valueA = ((lista.get(i).getPrice() * qtd.get(i)));
					}
				} else if (lista.get(i).getProduct().equals("B")) {
					if (qtd.get(i) >= 2) {
						valueB = ((lista.get(i).getPrice() * qtd.get(i)) - 0.15);
					} else {
						valueB = ((lista.get(i).getPrice() * qtd.get(i)));
					}
				} else {
					valueOther = ((lista.get(i).getPrice() * qtd.get(i)));
				}
			}
		}
		sum = valueA + valueB + valueOther;
		return valueFormat = formatter.format(sum);

	}

}
