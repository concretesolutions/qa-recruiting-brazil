package entity;

import java.util.HashMap;

public class PriceRules {

	private HashMap <String, int[]> pricingRulesTable;
	public PriceRules() {

		pricingRulesTable = new HashMap<String, int[]>();

	}


	public HashMap<String, int[]> getPricingRulesTable() {
		return pricingRulesTable;
	}


	public void setPricingRulesTable(HashMap<String, int[]> pricingRulesTable) {
		this.pricingRulesTable = pricingRulesTable;
	}


	public void newPriceRule(String itemId, int unitPrice, int quantity, int specialPrice) {

		int[] values = {unitPrice, quantity, specialPrice};
		this.pricingRulesTable.put(itemId, values);

	}

	public void printTable() {
		
		System.out.println("Item  Unit $  Quantity Special $ ");
		for (String id :pricingRulesTable.keySet()) {
			System.out.print(id +"      ");

			int values[] = pricingRulesTable.get(id);
			for(int v : values) {
				System.out.print(v+"       ");
			}
			System.out.println(" ");
		}
	}
	
	public int getUnitPrice(String key) {
		int[] values = pricingRulesTable.get(key);
		return values[0];
	}
	
	public int getPromoQuantity(String key) {
		int[] values = pricingRulesTable.get(key);
		return values[1];
	}

	public int getSpecialPrice(String key) {
		int[] values = pricingRulesTable.get(key);
		return values[2];
	}
}
