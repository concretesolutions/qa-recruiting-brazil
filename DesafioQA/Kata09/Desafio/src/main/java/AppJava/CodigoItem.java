package AppJava;

public class CodigoItem {
	
	private String codigoItem;

	public CodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}
	
	@Override
	public boolean equals(Object object) {
		return ((CodigoItem)object).codigoItem == codigoItem;
	}
	
	@Override
	public int hashCode() {
		return codigoItem.hashCode();
	}
}