package Produto;

public class ValorProduto {
	
	private int itenA = 50;
	private int itenB = 30;
	private int itenC = 20;
	private int itenD = 15;
	private int espA = 130;
	private int espB = 45;
	private int preco;

	public void retornarPreco(String item) {

		if (item == "") {
			preco = 0;
			System.out.println("O total é" + preco);
		} 
		
		else if (item == "A") {
			preco = itenA;
			System.out.println("O total é" + preco);
		}
		
		else if (item == "AA") {
			preco = itenA + itenA;
			System.out.println("O total é" + preco);
		} 
		
		else if (item == "AAA") {
			preco = espA;
			System.out.println("O total é" + preco);
		} 
		
		else if (item == "AAAA") {
			preco = espA + itenA;
			System.out.println("O total é" + preco);
		} 
		
		else if (item == "AAAAA") {
			preco = (espA) + (itenA + itenA);
			System.out.println("O total é" + preco);
		} 
		
		else if (item == "AAAAAA") {
			preco = espA + espA;
			System.out.println("O total é" + preco);
		} 
		
		else if (item == "AAAB") {
			preco = espA + itenB;
			System.out.println("O total é" + preco);
		} 
		
		else if (item == "AAABB") {
			preco = espA + espB;
			System.out.println("O total é" + preco);
		} 
		
		else if (item == "DABABA") {
			preco = espA + espB + itenD;
			System.out.println("O total é" + preco);

		} 
		else if (item == "CDBA") {
			preco = itenC + itenD + itenB+ itenA;
			System.out.println("O total é" + preco);
		}

	}

}
