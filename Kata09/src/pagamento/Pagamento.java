package pagamento;


import equacoes.Equacoes;

public class Pagamento {

	public static void main(String[] args) {
		
		Equacoes equacoes;
		equacoes=new Equacoes();
		
		System.out.println("Adicione os produtos: A,B,C ou D no carrinho.");
		System.out.println("Para finalizar a compra digite 'E'.");
		equacoes.equacoesProdutos();
		
		System.out.println("Valor total da compra é " + equacoes.getValorTotal() );
		System.out.println("Valor total dos descontos é " + equacoes.getPromoTotal());
		
		
		

	}

}
