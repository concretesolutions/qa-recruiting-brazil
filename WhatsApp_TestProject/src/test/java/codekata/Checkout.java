package codekata;
import java.util.ArrayList;
import java.util.List;

public class Checkout {

	private List<Item> listaDeItens;
	private Double total;

	public Checkout() {
		this.total = 0d;
		this.listaDeItens = new ArrayList<Item>();
		this.listaDeItens.add(new ItemA());
		this.listaDeItens.add(new ItemB());
		this.listaDeItens.add(new ItemC());
		this.listaDeItens.add(new ItemD());
	}
	
	public Double price(String itens) {
		// recupere as regras
		char[] itensChar = new char[itens.length()];
		for (int i = 0; i < itens.length(); i++) {
			itensChar[i] = itens.charAt(i);
		}
		
		Double total = 0d;
		for (char item : itensChar) {
			for (Item it : listaDeItens) {
				if (it.isItem(item)) {
					it.incrementarQuantidade();
					total += it.getPreco();
				}
			}
		}

		for (Item it : listaDeItens) {
			total = it.aplicarDesconto(total);
		}

		return total;
	}
	
	public Double getTotal() {
		return this.total;
	}
}
