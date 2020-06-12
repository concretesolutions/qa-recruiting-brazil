/**
 * Script Name : <b> ScriptCompra</b> Generated : <b>11/06/2020 21:06</b>
 * Description : Functional Test Script Original Host : Win10 version xx Build
 * xxx (s)
 * 
 * @since 2020/06/11
 * @author wellington Pontes Medeiros
 * 
 * 
 */

public class Compra {
	public static void main(String[] args) {
		int qtdItens = 0;
		int i = 0;

		Regras cr = new Regras();
		System.out.println("\n>> SEU CARRINHO DE COMPRAS ESTÁ ABERTO! <<");

		// Sorteando a quantidade do item A que vai ser adionado ao Carrinho de compras
		qtdItens = cr.sorteioQuantidadeDeItens();
		while (i < qtdItens) {
			cr.addItem("A");
			i++;
		}
		// Sorteando a quantidade do item B que vai ser adionado ao Carrinho de compras
		qtdItens = i = 0;
		qtdItens = cr.sorteioQuantidadeDeItens();
		while (i < qtdItens) {
			cr.addItem("B");
			i++;
		}
		// Sorteando a quantidade do item C que vai ser adionado ao Carrinho de compras
		qtdItens = i = 0;
		qtdItens = cr.sorteioQuantidadeDeItens();
		while (i < qtdItens) {
			cr.addItem("C");
			i++;
		}
		// Sorteando a quantidade do item D que vai ser adionado ao Carrinho de compras
		qtdItens = i = 0;
		qtdItens = cr.sorteioQuantidadeDeItens();
		while (i < qtdItens) {
			cr.addItem("D");
			i++;
		}

		// Fechamento do Carrinho de compras
		cr.fechaCarrinho();
	}

}
