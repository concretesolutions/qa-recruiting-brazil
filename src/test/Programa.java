package test;

import main.Carrinho;

public class Programa {

	public static void main(String[] args) {

		Carrinho ck = new Carrinho();
		ck.adicionarItem("A", 4);
		ck.adicionarItem("B", 1);
		ck.adicionarItem("C", 4);
		if (ck.calcularPrecoTotal(ck.listaDeItens) == 320.0)
			System.out.println("Passou");
		else
			System.out.println("Falhou");

		try {
			ck.removeItem("A", 4);
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (ck.calcularPrecoTotal(ck.listaDeItens) == 110.0)
			System.out.println("Passou");
		else
			System.out.println("Falhou");

	}
}
