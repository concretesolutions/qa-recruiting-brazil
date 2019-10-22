package codekata;

public abstract class Item {
	
	protected int quantidade;
	
	abstract double getPreco();
	abstract boolean isItem(char valor);
	abstract double aplicarDesconto(double valor);
	
	public final void incrementarQuantidade() {
		quantidade++;
	}
	
}
