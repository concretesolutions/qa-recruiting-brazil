package codekata;

public class ItemB extends Item {
	
	public double getPreco() {
		return 30;
	}
	
	public boolean isItem(char valor) {
		return valor == 'B';
	}
	
	public double aplicarDesconto(double valor) {
		int valorMultiplicador = quantidade / 2;
		if (valorMultiplicador > 0) {
			return valor - (15 * valorMultiplicador);
		} else {
			return valor;
		} 
	} 
}
