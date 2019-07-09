package equacoes;

import capturaProduto.CapturaProduto;

public class Equacoes {
	private int promoTotal = 0;
	private int valorTotal = 0;
	private int precoA = 50;
	private int precoB = 30;
	private int precoC = 20;
	private int precoD = 15;
	private int PromoA = 0;
	private int PromoB = 0;
			
	
	public void equacoesProdutos(){
		
		CapturaProduto produto;
		produto=new CapturaProduto();
		produto.capturaProduto();
		
	precoA*=produto.getA();
	precoB*=produto.getB();
	precoC*=produto.getC();
	precoD*=produto.getD();
	setValorTotal(precoA + precoB + precoC + precoD);
	PromoA= (produto.getA() / 3);
	
	if (PromoA>=1) {
	PromoA*=20;	
	}
	
	PromoB= (produto.getB() / 2);
	
	if (PromoB>=1) {
	PromoB*=15;	
	}
	
	
	setValorTotal(getValorTotal() - (PromoA + PromoB));
	
	setPromoTotal(getPromoTotal() + (PromoA + PromoB));
	
	
}


	public int getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public int getPromoTotal () {
		return promoTotal;
	}
	
	public void setPromoTotal (int promoTotal) {
		this.promoTotal = promoTotal;
	}
	
}
