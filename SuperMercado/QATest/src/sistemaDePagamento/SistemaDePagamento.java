

package sistemaDePagamento;

import contas.Contas;

public class SistemaDePagamento {

	public static void main(String[] args) {
		
		Contas contas;
		contas=new Contas();
		
		System.out.println("Bem vindo! Possuimos os produtos de SKU: A,B,C e D para compra.");
		System.out.println("Para adicionar o produto, digite seu respectivo SKU e pressione Enter");
		System.out.println("Para encerrar a compra digite 'E'.");
		contas.contaProduto();
		
		System.out.println("Valor total da compra é " + contas.getValorTotal() );
		System.out.println("Muito obrigado e volte sempre!");
}
}