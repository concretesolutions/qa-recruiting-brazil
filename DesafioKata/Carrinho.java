package DesafioKata;

public class Carrinho {

	int qtdProdutoA = 0;
	int qtdProdutoB = 0;
	int qtdProdutoC = 0;
	int qtdProdutoD = 0;
	int precoA = 50;
	int precoB = 30;
	int precoC = 20;
	int precoD = 15;
	int promocaoA = 0;
	int promocaoB = 0;
	int valorTotalA = 0;
	int valorTotalB = 0;
	int valorTotalC = 0;
	int valorTotalD = 0;
	
	public void AdicionarProduto(String produto) {
		
		switch (produto){
			case "A":
				qtdProdutoA++;
				calcularProdutoA();
	            break;
	        case "B":
	        	qtdProdutoB++;
	        	calcularProdutoB();
	            break;
	        case "C":
	        	qtdProdutoC++;
	        	calcularProdutoC();
	            break;
	        case "D":
	        	qtdProdutoD++;
	        	calcularProdutoD();
	            break;
	        default:
	        	System.out.println("Adicione um produto");
		}
	}
	
	public void calcularProdutoA() {
	
		for(int i = 0 ; i < qtdProdutoA; i++) {
			
			if(qtdProdutoA >= 3) {
				promocaoA += 130;
				qtdProdutoA -=3;
			}
		
		}
		
		valorTotalA  = (qtdProdutoA * precoA) + promocaoA;
	}

	public void calcularProdutoB() {
		
		for(int i = 0 ; i < qtdProdutoB; i++) {
	
			if(qtdProdutoB >= 2) {
				promocaoB += 45;
				qtdProdutoB -=2;
			}
		
		}
		
		valorTotalB  = (qtdProdutoB * precoB) + promocaoB;	
	}

	public void calcularProdutoC() {
		
		valorTotalC = qtdProdutoC * precoC;
	}
	
	public void calcularProdutoD() {
		valorTotalD = qtdProdutoD * precoD;
	}

	public void exibirLista() {
		System.out.println("\nProduto A, preço unitario: R$50 e preço de promoção: 3 por R$130\n"
				+ 			 "Produto B, preço unitario: R$30 e preço de promoção: 2 por R$45\n"
				+ 			 "Produto C, preço unitario: R$20\n"
				+ 			 "Produto D, preço unitario: R$15\n");
	}
	
	public void resultado() {
		System.out.println("\nVocê comprou um total R$" + (valorTotalA + valorTotalB +valorTotalC + valorTotalD) +",00");
	}
}