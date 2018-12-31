package desafio_concrete_kata_09;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Class responsible for calculating product prices
 * by checking promotion rules.
 * @author Raphael_Stark
 *
 */
public class Checkout {
	List<Product> listProduct = new ArrayList<Product>();
	String[] listNameProuct;
	public String productItem = "";

	/**
	 * Method responsible for returning total product prices.
	 * @param itens
	 * @return
	 */
	public int getTotalProducts(final String itens) {

		listNameProuct = itens.split("");

		Product productA = new Product();
		productA.setName("A");
		int countItensA;
		int countItensB;
		int countItensC;
		int countItensD;

		countItensA = countItens("A");
		productA.setCount(countItensA);

		Product productB = new Product();
		productB.setName("B");

		countItensB = countItens("B");
		productB.setCount(countItensB);

		Product productC = new Product();
		productC.setName("C");
		countItensC = countItens("C");
		productC.setCount(countItensC);

		Product productD = new Product();
		productD.setName("D");
		countItensD = countItens("D");
		productD.setCount(countItensD);

		int priceA = checkTypeSale(productA);
		productA.setPrice(priceA);
		int priceB = checkTypeSale(productB);
		productB.setPrice(priceB);
		int priceC = checkTypeSale(productC);
		productC.setPrice(priceC);
		int priceD = checkTypeSale(productD);
		productD.setPrice(priceD);

		int priceTotal = priceA + priceB + priceC + priceD;

		return priceTotal;
	}

	/**
	 * creates the list of items so that it is possible to calculate
	 * the incremental price of the products.
	 * @param item, item is the product that will have its price calculated.
	 */
	public void setProductItem(final String item) {
		productItem += item;

	}

	/**
	 * Calculates the individual price of each item.
	 * @return returns the price of the product.
	 */
	public int getPriceIndividual() {
		int total = 0;
		if (!productItem.equals("")) {
			total = getTotalProducts(productItem);

		}
		return total;

	}
	
	/**
	 * Method responsible for checking how many times a
	 * product is repeated in the list of items.
	 * @param nameProduct Product's name.
	 * @return
	 */

	private int countItens(final String nameProduct) {
		int countItens = 0;
		for (int i = 0; i < listNameProuct.length; i++) {
			if (listNameProuct[i].equals(nameProduct)) {
				countItens += 1;

			}

		}

		return countItens;
	}

	/**
	 * Method responsible for checking whether or not the product is
	 * on sale and calculate its price.
	 * @param product object that contains the product information.
	 * @return returns the price of the product.
	 */

	private int checkTypeSale(final Product product) {
		int priceTotal = 0;
		int price;
		int saleOut;
		switch (product.getName()) {
		case Constants.PRODUCT_A:
			if (product.getCount() % 3 == 0) {
				priceTotal = getSpecialPrice(product, Constants.SPECIAL_PRICE_PRODUCT_A, 3);
			} else {
				saleOut = product.getCount() % 3;
				price = saleOut * Constants.NORMAL_PRICE_PRODUCT_A;
				priceTotal = price + getSpecialPrice(product, Constants.SPECIAL_PRICE_PRODUCT_A, 3);
			}
			break;

		case Constants.PRODUCT_B:
			if (product.getCount() % 2 == 0) {
				priceTotal = getSpecialPrice(product, Constants.SPECIAL_PRICE_PRODUCT_B, 2);
			} else {
				saleOut = product.getCount() % 2;
				price = saleOut * Constants.NORMAL_PRICE_PRODUCT_B;
				priceTotal = price + getSpecialPrice(product, Constants.SPECIAL_PRICE_PRODUCT_B, 2);
			}
			break;
		case Constants.PRODUCT_C:
			priceTotal = product.getCount() * Constants.NORMAL_PRICE_PRODUCT_C;

			break;
		case Constants.PRODUCT_D:
			priceTotal = product.getCount() * Constants.NORMAL_PRICE_PRODUCT_D;
			break;

		default:
			break;
		}
		return priceTotal;

	}

	/**
	 * Method responsible for calculating the price in promotion of the products.
	 * @param product product object that contains the product information.
	 * @param specialPrice, price promotion of products. When buying 3 products
	 * of type A, the 3 items leave for 130, when buying 2 products of
	 * type B, the 2 items come out for 45.
	 * @param qtdSpecial, rule that indicates the quantity of products on sale.
	 * For products of type A, they are 3 by 130, for products of type B, they are 3 by 45.
	 * @return
	 */

	public int getSpecialPrice(final Product product, final int specialPrice, final int qtdSpecial) {

		int sale = product.getCount() / qtdSpecial;
		int price = sale * specialPrice;
		return price;

	}

}
