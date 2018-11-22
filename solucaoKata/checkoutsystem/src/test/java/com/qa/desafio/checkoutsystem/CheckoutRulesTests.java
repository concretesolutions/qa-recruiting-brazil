package com.qa.desafio.checkoutsystem;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;

public class CheckoutRulesTests {

	@Test
	public void testValueOfEach()
	{
		CheckoutRules checkout = new CheckoutRules();
		
		String emptyAProducts = checkout.Calcula(0, "A", 0.00);
		String oneAproducts = checkout.Calcula(1, "A", 0.50);
		String treeAproducts = checkout.Calcula(3, "A", 0.50);
		
		String emptyBProducts = checkout.Calcula(0, "B", 0.00);
		String oneBproducts = checkout.Calcula(1, "B", 0.30);
		String treeBproducts = checkout.Calcula(2, "B", 0.30);
		
		Assert.assertEquals(null, emptyAProducts);
		Assert.assertEquals("0,50", oneAproducts);
		Assert.assertEquals("1,30", treeAproducts);
		
		Assert.assertEquals(null, emptyBProducts);
		Assert.assertEquals("0,30", oneBproducts);
		Assert.assertEquals("0,45", treeBproducts);
	}
	
	@Test
	public void testValueOfTotal()
	{
		CheckoutRules checkout = new CheckoutRules();
		ArrayList<String> listaProducts = new ArrayList<String>();
		ArrayList<Double> listaPrice = new ArrayList<Double>();
		ArrayList<Integer> listaqtdProd = new ArrayList<Integer>();
		
		Item item = new Item();
		
		listaProducts.add("A");
		listaPrice.add(0.50);
		listaqtdProd.add(1);
		listaProducts.add("B");
		listaPrice.add(0.30);
		listaqtdProd.add(1);
		listaProducts.add("C");
		listaPrice.add(0.20);
		listaqtdProd.add(1);
		
		String products = checkout.CalculaVarios(listaqtdProd, listaProducts, listaPrice);
		
		Assert.assertEquals("1,00", products);
		
	}
	
}
