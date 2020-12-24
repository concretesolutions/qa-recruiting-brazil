package control;
import java.util.ArrayList;

import entity.Item;
import entity.PriceRules;

public class Checkout {

	private ArrayList<Item> itemList;
	private PriceRules rules;
	private int interatorItemA = 0;
	private int interatorItemB = 0;
	private int interatorItemC = 0;
	private int interatorItemD = 0;

	public Checkout (PriceRules priceRules) {
		this.itemList = new ArrayList<Item>();
		rules = priceRules;
	}


	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void scan (String itemId) {

		Item item;

		if(rules.getPricingRulesTable().containsKey(itemId)) {

			int price = rules.getUnitPrice(itemId);
			item = new Item(itemId, price);
			this.itemList.add(item);
			itemIterator(itemId);

		}else {
			System.out.println("Unknown item. Couldn't finish operation.");
		}

	}
	private void itemIterator(String itemId) {

		if(itemId.equals("A")) {
			this.interatorItemA++;
		}
		else if (itemId.equals("B")) {
			this.interatorItemB++;
		}
		else if (itemId.equals("C")){
			this.interatorItemC++;
		}
		else if(itemId.equals("D")){
			this.interatorItemD++;
		}
	}

	public int priceList(String itemsIDSequence) {

		newItemList();
		resetInterators();
		
		char[]itemsList = itemsIDSequence.toCharArray();
		for(char id : itemsList) {
			String item = Character.toString(id);
			scan(item);
		}
		return getTotal();
	}

	private int getTotalForPrint () {
		int totalPrice = 0;

		for (Item i : this.itemList ) {			
			totalPrice = totalPrice+ i.getPrice();
		}
		if(checkForPromo(itemList)) {

			if(interatorItemA>= rules.getPromoQuantity("A")){
				totalPrice -= giveAndPrintDiscount("A", interatorItemA);	
			}
			if(interatorItemB>= rules.getPromoQuantity("B")){
				totalPrice -= giveAndPrintDiscount("B", interatorItemB);	
			}
			if(interatorItemC>= rules.getPromoQuantity("C")){
				totalPrice -= giveAndPrintDiscount("C", interatorItemC);	
			}
			if(interatorItemD>= rules.getPromoQuantity("D")){
				totalPrice -= giveAndPrintDiscount("D", interatorItemD);	
			}
		}
		return totalPrice;
	}
	
	public int getTotal() {
		int totalPrice = 0;

		for (Item i : this.itemList ) {			
			totalPrice = totalPrice+ i.getPrice();
		}
		if(checkForPromo(itemList)) {

			if(interatorItemA>= rules.getPromoQuantity("A")){
				totalPrice -= giveDiscount("A", interatorItemA);	
			}
			if(interatorItemB>= rules.getPromoQuantity("B")){
				totalPrice -= giveDiscount("B", interatorItemB);	
			}
			if(interatorItemC>= rules.getPromoQuantity("C")){
				totalPrice -= giveDiscount("C", interatorItemC);	
			}
			if(interatorItemD>= rules.getPromoQuantity("D")){
				totalPrice -= giveDiscount("D", interatorItemD);	
			}
		}
		return totalPrice;
	}

	private void newItemList() {
		this.itemList.clear();
	}

	private void resetInterators() {
		this.interatorItemA = 0;
		this.interatorItemB = 0;
		this.interatorItemC = 0;
		this.interatorItemD = 0;
	}

	private boolean checkForPromo(ArrayList<Item> itemList) {
		boolean hasPromo = false;

		for(Item i: itemList) {
			String itemID = i.getId();

			if(rules.getPromoQuantity(itemID) > 1) {
				hasPromo = true;
				break;
			}
		}
		return hasPromo;
	}

	private int giveAndPrintDiscount(String itemID, int itemInterator) {

		int discount;

		int minQuantity = rules.getPromoQuantity(itemID);		
		int specialPrice = rules.getSpecialPrice(itemID);
		int unitPrice = rules.getUnitPrice(itemID);

		if(itemInterator >=minQuantity && minQuantity>1) {

			unitPrice = rules.getUnitPrice(itemID);
			int fullPrice = minQuantity*unitPrice;
			int discountMultiplier = itemInterator/minQuantity;
			discount = (fullPrice - specialPrice)*discountMultiplier;
			System.out.println("You recieved " + discount +" off on item "+ itemID);
		}else {
			discount = 0;
		}

		return discount;
	}
	
	private int giveDiscount(String itemID, int itemInterator) {

		int discount;

		int minQuantity = rules.getPromoQuantity(itemID);		
		int specialPrice = rules.getSpecialPrice(itemID);
		int unitPrice = rules.getUnitPrice(itemID);

		if(itemInterator >=minQuantity && minQuantity>1) {

			unitPrice = rules.getUnitPrice(itemID);
			int fullPrice = minQuantity*unitPrice;
			int discountMultiplier = itemInterator/minQuantity;
			discount = (fullPrice - specialPrice)*discountMultiplier;
		}else {
			discount = 0;
		}

		return discount;
	}

	public void printItemList () {
		if(!itemList.isEmpty()) {
			System.out.println(" ");
			for (Item i : this.itemList){
				i.printItem();
			}
		}else {
			System.out.println("There's no item on this list.");
		}
	}

	public void printTotal() {
		System.out.println("Total: "+getTotalForPrint());
	}



}

