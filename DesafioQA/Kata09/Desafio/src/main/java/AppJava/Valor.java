package AppJava;

public class Valor {
	
	private int qtdade;
	
	public Valor(int qtdade) {
		this.qtdade = qtdade;
	}

	@Override
	public boolean equals(Object object) {
		return ((Valor)object).qtdade == qtdade;
	}
	
	public void Add(Valor valorItem) {
		qtdade += valorItem.qtdade;
	}
}