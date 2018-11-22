package com.qa.desafio.checkoutsystem;

public class Item 
{
	private Double price;
	private String product;
	private Double value;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	public Double priceOfProduct(String product, Double price)
	{
		setProduct(product);
		setPrice(price);
		return value = getPrice();
	}
}
