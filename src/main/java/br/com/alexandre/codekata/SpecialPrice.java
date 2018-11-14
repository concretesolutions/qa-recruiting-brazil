package br.com.alexandre.codekata;

public class SpecialPrice extends Price{
	private int specialQuantity;
	private double specialPrice;
	
	public SpecialPrice(String sku, double price, int specialQuantity, double specialPrice) {
		super(sku, price);
		this.specialQuantity = specialQuantity;
		this.specialPrice = specialPrice;
	}

	public int getSpecialQuantity() {
		return specialQuantity;
	}

	public void setSpecialQuantity(int specialQuantity) {
		this.specialQuantity = specialQuantity;
	}

	public double getSpecialPrice() {
		return specialPrice;
	}

	public void setSpecialPrice(double specialPrice) {
		this.specialPrice = specialPrice;
	}
	
	public Double calculateTotalPrice(int quantity) {
		
		int specialChunk = quantity / specialQuantity;
		int divisionReminder = quantity % specialQuantity;
		
		if(specialChunk == 0) {
			return quantity * this.getPrice();
		} else {
			return (specialChunk * specialPrice) + (divisionReminder * this.getPrice());
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(specialPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + specialQuantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpecialPrice other = (SpecialPrice) obj;
		if (Double.doubleToLongBits(specialPrice) != Double.doubleToLongBits(other.specialPrice))
			return false;
		if (specialQuantity != other.specialQuantity)
			return false;
		return true;
	}
	
	

}
