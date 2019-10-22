package codekata;

public class ItemD extends Item {
	
	public double getPreco() {
		return 15;
	}
	
	public boolean isItem(char valor) {
		return valor == 'D';
	}
	
	public double aplicarDesconto(double valor) {
		return valor;
	}
}
