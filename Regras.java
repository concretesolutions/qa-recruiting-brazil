
/**
 * Script Name : <b> ScriptRegras</b> Generated : <b>11/06/2020 21:06</b>
 * Description : Functional Test Script Original Host : Win10 version xx Build
 * xxx (s)
 * 
 * @since 2020/06/11
 * @author wellington Pontes Medeiros
 * 
 * 
 */

import java.util.Random;

public class Regras {
	Integer totalCarrinho = 0;
	Integer itenslCarrinho = 0;

	Integer qtdA = 0;
	Integer qtdB = 0;
	Integer qtdC = 0;
	Integer qtdD = 0;

	Integer valorA = 0;
	Integer valorB = 0;
	Integer valorC = 0;
	Integer valorD = 0;

	Integer bonusA = 0;
	Integer bonusB = 0;
	Integer s = 0;

	public void addItem(String item) {
		if (item.equals("A")) {
			++qtdA;
			calculaA();
		} else if (item.equals("B")) {
			++qtdB;
			calculaB();
		} else if (item.equals("C")) {
			++qtdC;
			calculaC();
		} else if (item.equals("D")) {
			++qtdD;
			calculaD();
		}
	}

	public void calculaA() {
		if (bonusA == 0) {
			valorA = valorA + 50;
			System.out
					.println("Produto A adicionado ao Carrinho de Compras, seu valor unitario é 50, totalA: " + valorA);
			bonusA = 1;
		} else if (bonusA == 1) {
			valorA = valorA + 50;
			System.out
					.println("Produto A adicionado ao Carrinho de compras, seu valor unitario é 50, totalA: " + valorA);
			bonusA = 2;
		} else if (bonusA == 2) {
			valorA = valorA + 30;
			System.out.println(
					"Produto A adicionado ao Carrinho de compras, devido a promoção na segunda unidade, seu valor passa a ser 30, totalA: "
							+ valorA);
			bonusA = 0;
		}
	}

	public void calculaB() {
		if (bonusB == 0) {
			valorB = valorB + 30;
			System.out
					.println("Produto B adicionado ao Carrinho de compras, seu valor unitario passa a ser 30, totalB: "
							+ valorB);
			bonusB = 1;
		} else if (bonusB == 1) {
			valorB = valorB + 15;
			System.out.println(
					"Produto B adicionado ao Carrinho de compras, devido a promoção na segunda unidade seu valor passa a ser 15, totalB: "
							+ valorB);
			bonusB = 0;
		}
	}

	public void calculaC() {
		valorC = valorC + 20;
		System.out.println("Produto C adicionado ao Carrinho de compras, seu valor unitario é 20, totalC: " + valorC);
	}

	public void calculaD() {
		valorD = valorD + 15;
		System.out.println("Produto D adicionado ao Carrinho, seu valor unitario é 15, totalD: " + valorD);
	}

	// cálculo total, somando todos os itens.
	public void fechaCarrinho() {
		totalCarrinho = valorA + valorB + valorC + valorD;
		itenslCarrinho = qtdA + qtdB + qtdC + qtdD;
		System.out.println("\n>> SEU CARRINHO DE COMPRAS ESTÁ FECHADO! <<");
		System.out.println("Essa compra possui " + itenslCarrinho + " itens.");
		System.out.println("Valor total a pagar: >>> " + totalCarrinho + " <<<");

		zeraValores();
	}

	private void zeraValores() {
		totalCarrinho = itenslCarrinho = qtdA = qtdB = qtdC = qtdD = valorA = valorB = valorC = valorD = bonusA = bonusB = 0;
	}

	public int sorteioQuantidadeDeItens() {
		Random sorteio = new Random();
		s = sorteio.nextInt((5) + 1);// limite máximo de um único item por
										// Carrinho
		return s;
	}

}
