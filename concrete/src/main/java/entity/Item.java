package entity;

public class Item {
	
	private String id;
	private int unitPrice;
		
	public Item (String id, int price) {
		this.id = id;
		this.unitPrice = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPrice() {
		return unitPrice;
	}

	public void setPrice(int price) {
		this.unitPrice = price;
	}
	
	public void printItem() {
		System.out.println(getId()+" | "+ getPrice());
	}
}

