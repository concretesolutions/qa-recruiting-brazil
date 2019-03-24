package PrecoProduto;

public class TesteProduto {

	private int priceItemA = 50;
	private int priceItemB = 30;
	private int priceItemC = 20;
	private int priceItemD = 15;
	private int especialPriceA = 130;
	private int especialPriceB = 45;
	private int totalPreco;

	public void retornarPreco(String item) {

		if (item == "") {

			totalPreco = 0;
			System.out.println("O preço do Item " + item + " é :" + totalPreco);

		} 
		else if (item == "A") {

			totalPreco = priceItemA;
			System.out.println("O preço do Item " + item + " é :" + totalPreco);

		} 
		else if (item == "AA") {

			totalPreco = priceItemA + priceItemA;
			System.out.println("O preço do Item " + item + " é :" + totalPreco);

		} 
		else if (item == "AAA") {

			totalPreco = especialPriceA;
			System.out.println("O preço do Item " + item + " é especial :" + totalPreco);

		} 
		else if (item == "AAAA") {

			totalPreco = especialPriceA + priceItemA;
			System.out.println("O preço do Item " + item + " é especial :" + totalPreco);

		} 
		else if (item == "AAAAA") {

			totalPreco = (especialPriceA) + (priceItemA + priceItemA);
			System.out.println("O preço do Item " + item + " é especial :" + totalPreco);

		} 
		else if (item == "AAAAAA") {

			totalPreco = especialPriceA + especialPriceA;
			System.out.println("O preço do Item " + item + " é especial :" + totalPreco);

		} 
		else if (item == "AAAB") {

			totalPreco = especialPriceA + priceItemB;
			System.out.println("O preço do Item " + item + " é especial :" + totalPreco);

		} 
		else if (item == "AAABB") {

			totalPreco = especialPriceA + especialPriceB;
			System.out.println("O preço do Item " + item + " é especial :" + totalPreco);

		} 
		else if (item == "DABABA") {

			totalPreco = priceItemD + priceItemA + priceItemB + 
					priceItemA + priceItemB + priceItemA;
			System.out.println("O preço do Item " + item + " é especial :" + totalPreco);

		} 
		
	}

}
