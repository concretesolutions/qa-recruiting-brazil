package main;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Programa {
	public static void main(String[] args) {

		Carrinho carrinho = new Carrinho();

		
		
		
		try {
			carrinho.revisarCarrinho();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		// A - 50 reais - promocao 3 = 130
		System.out.println("");
		carrinho.adicionarItem("A", 3);
		try {
			carrinho.revisarCarrinho();
		} catch (Exception e) {

			System.out.println(e.toString());
		}
		
		Double carrinho1 = carrinho.calcularPrecoTotal(carrinho.listaDeItens);
		System.out.println("Preço total 1: " + carrinho1);
		System.out.println("");
		
		
		
		
		
		
		
		
		// B - 30 reais - promocao 2 = 45
		carrinho.adicionarItem("B", 2);
		try {
			carrinho.revisarCarrinho();
		} catch (Exception e) {

			System.out.println(e.toString());
		}
		Double carrinho2 = carrinho.calcularPrecoTotal(carrinho.listaDeItens);
		System.out.println("Preço total 2: " + carrinho2);
		System.out.println("");

		carrinho.adicionarItem("C", 4);
		try {
			carrinho.revisarCarrinho();
			;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Double carrinho3 = carrinho.calcularPrecoTotal(carrinho.listaDeItens);
		System.out.println("Preço total 3: " + carrinho3);
		System.out.println("");
		try {
			carrinho.removeItem("B", 2);
		} catch (Exception e1) {
			System.out.println(e1.toString());
		}
		try {
			carrinho.revisarCarrinho();
			;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Double carrinho4 = carrinho.calcularPrecoTotal(carrinho.listaDeItens);
		System.out.println("Preço total 4: " + carrinho4);
		System.out.println("");
		try {
			carrinho.removeItem("A", 1);
		} catch (Exception e1) {
			System.out.println(e1.toString());
		}
		try {
			carrinho.revisarCarrinho();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Double carrinho5 = carrinho.calcularPrecoTotal(carrinho.listaDeItens);
		System.out.println("Preço total 5: " + carrinho5);
		System.out.println("");
		
		try {
			carrinho.revisarCarrinho();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Double carrinho6 = carrinho.calcularPrecoTotal(carrinho.listaDeItens);
		System.out.println("Preço total 6: " + carrinho6);
		System.out.println("");

		carrinho.adicionarItem("A", 4);

		try {
			carrinho.revisarCarrinho();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Double carrinho7 = carrinho.calcularPrecoTotal(carrinho.listaDeItens);
		System.out.println("Preço total 7: " + carrinho7);
		
		//JOptionPane.showMessageDialog(null,"Preço total 1: " + carrinho1 + "\n" + 
											//"Preço total 2: " + carrinho2 + "\n");
		
		
	}
}
