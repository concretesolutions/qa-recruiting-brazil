package codekata;

public class ItemC extends Item {
	
	public double getPreco() {
		return 20;
	}
	
	public boolean isItem(char valor) {
		return valor == 'C';
	}
	
	public double aplicarDesconto(double valor) {
		return valor;
	}
}
