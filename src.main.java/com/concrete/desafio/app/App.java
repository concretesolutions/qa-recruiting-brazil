package com.concrete.desafio.app;

import com.concrete.desafio.Checkout;

public class App {
	
	public static void main(String[] args) {

		Checkout carrinho = new Checkout();

		try {
			Checkout.revisarCarrinho();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// A - 50 reais - promocao 3 = 130
		System.out.println("");
		carrinho.adicionarItem("A", 3);
		try {
			Checkout.revisarCarrinho();
		} catch (Exception e) {

			System.out.println(e.toString());
		}

		Double carrinho1 = carrinho.calcularPrecoTotal(Checkout.listaDeItens);
		System.out.println("Preço total 1: " + carrinho1);
		System.out.println("");



		// B - 30 reais - promocao 2 = 45
		carrinho.adicionarItem("B", 2);
		try {
			Checkout.revisarCarrinho();
		} catch (Exception e) {

			System.out.println(e.toString());
		}
		Double carrinho2 = carrinho.calcularPrecoTotal(Checkout.listaDeItens);
		System.out.println("Preço total 2: " + carrinho2);
		System.out.println("");

		carrinho.adicionarItem("C", 4);
		try {
			Checkout.revisarCarrinho();
			;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Double carrinho3 = carrinho.calcularPrecoTotal(Checkout.listaDeItens);
		System.out.println("Preço total 3: " + carrinho3);
		System.out.println("");
		try {
			Checkout.removeItem("B", 2);
		} catch (Exception e1) {
			System.out.println(e1.toString());
		}
		try {
			Checkout.revisarCarrinho();
			;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Double carrinho4 = carrinho.calcularPrecoTotal(Checkout.listaDeItens);
		System.out.println("Preço total 4: " + carrinho4);
		System.out.println("");
		try {
			Checkout.removeItem("A", 1);
		} catch (Exception e1) {
			System.out.println(e1.toString());
		}
		try {
			Checkout.revisarCarrinho();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Double carrinho5 = carrinho.calcularPrecoTotal(Checkout.listaDeItens);
		System.out.println("Preço total 5: " + carrinho5);
		System.out.println("");

		try {
			Checkout.revisarCarrinho();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Double carrinho6 = carrinho.calcularPrecoTotal(Checkout.listaDeItens);
		System.out.println("Preço total 6: " + carrinho6);
		System.out.println("");

		carrinho.adicionarItem("A", 4);

		try {
			Checkout.revisarCarrinho();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Double carrinho7 = carrinho.calcularPrecoTotal(Checkout.listaDeItens);
		System.out.println("Preço total 7: " + carrinho7);

		//JOptionPane.showMessageDialog(null,"Preço total 1: " + carrinho1 + "\n" + 
											//"Preço total 2: " + carrinho2 + "\n");


	}
}