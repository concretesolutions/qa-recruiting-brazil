package DesafioKata;

import java.util.Scanner;

public class Compra {

	public static void main(String[] args) {
		String inserirProduto;
		String produto;
		Scanner leitor = new Scanner(System.in);
		
		Carrinho carrinho = new Carrinho();
		
		System.out.println("\nINICIAR COMPRAS\n");
		
		do{
			System.out.println("\nINSERIR NOVO PRODUTO? (S/N)\n");
			inserirProduto = leitor.next();
			
			if(inserirProduto.toUpperCase().equals("S")) {
				carrinho.exibirLista();
				System.out.println("\nQual produto deseja inserir? (A, B,C ou D)\n");
				produto = leitor.next();
				carrinho.AdicionarProduto(produto.toUpperCase());
				
			}else if(inserirProduto.toUpperCase().equals("N")) {
				carrinho.resultado(); 
			}
		}while(inserirProduto.toUpperCase().equals("S"));
	}
}
