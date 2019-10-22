package codekata;

public class ItemA extends Item {
	
	public double getPreco() {
		return 50;
	}
	
	public boolean isItem(char valor) {
		return valor == 'A';
	}
	
	public double aplicarDesconto(double valor) {
		int valorMultiplicador = quantidade / 3;
		if (valorMultiplicador > 0) {
			return valor - (20 * valorMultiplicador);
		} else {
			return valor;
		}
	}
}
