package contas;

import recebeProduto.RecebeProduto;

public class Contas {
	private int valorTotal = 0;
	private int precoUnitarioA = 50;
	private int precoUnitarioB = 30;
	private int precoUnitarioC = 20;
	private int precoUnitarioD = 15;
	private int quantidadePromoA = 0;
	private int quantidadePromoB = 0;
			
	
	public void contaProduto(){
		
		RecebeProduto produto;
		produto=new RecebeProduto();
		produto.recebeProduto();
		
	precoUnitarioA*=produto.getA();
	precoUnitarioB*=produto.getB();
	precoUnitarioC*=produto.getC();
	precoUnitarioD*=produto.getD();
	setValorTotal(precoUnitarioA + precoUnitarioB + precoUnitarioC + precoUnitarioD);
	quantidadePromoA= (produto.getA() / 3);
	
	if (quantidadePromoA>=1) {
	quantidadePromoA*=20;	
	}
	
	quantidadePromoB= (produto.getB() / 2);
	
	if (quantidadePromoB>=1) {
	quantidadePromoB*=15;	
	}
	setValorTotal(getValorTotal() - (quantidadePromoA + quantidadePromoB));
	
}


	public int getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}