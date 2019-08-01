package bean;

public class Mercadoria {

	private String nomeDaMercadoria;
	private int precoUnitario;
	private int qtdItensParaDesconto;
	private int precoComDesconto;

	public String getNomeDaMercadoria() {
		return nomeDaMercadoria;
	}

	public void setNomeDaMercadoria(String nomeDaMercadoria) {
		this.nomeDaMercadoria = nomeDaMercadoria;
	}

	public int getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(int precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQtdItensParaDesconto() {
		return qtdItensParaDesconto;
	}

	public void setQtdItensParaDesconto(int qtdItensParaDesconto) {
		this.qtdItensParaDesconto = qtdItensParaDesconto;
	}

	public int getPrecoComDesconto() {
		return precoComDesconto;
	}

	public void setPrecoComDesconto(int precoComDesconto) {
		this.precoComDesconto = precoComDesconto;
	}
}
