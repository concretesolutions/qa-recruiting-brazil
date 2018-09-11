package AppJava;

import AppTest.RegraDePrecificacao;

public class Checkout {

	private Valor valorTotal = new Valor(0);
    private RegraDePrecificacao regraDePrecificacao = new RegraDePrecificacao();
	
	public Valor total() {
		return valorTotal;
	}

	public void scan(CodigoItem codigoItem) {
		regraDePrecificacao.CodigoItemScanned(codigoItem, valorTotal);
	}
}