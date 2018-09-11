package AppTest;

import java.util.HashMap;
import java.util.Map;

import AppJava.CodigoItem;
import AppJava.Valor;

public class RegraDePrecificacao {
	
	private Map<CodigoItem, Valor> regraDePrecificacao;
	
	public RegraDePrecificacao() {
		
		regraDePrecificacao = new HashMap<>();
		regraDePrecificacao.put (new CodigoItem("A"),new Valor(50));
		regraDePrecificacao.put (new CodigoItem("B"),new Valor(30));
		regraDePrecificacao.put (new CodigoItem("AB"),new Valor(80));
		
	}
	
	public Valor get(CodigoItem codigoItem) {
		return regraDePrecificacao.get(codigoItem);
	}
	
	public void CodigoItemScanned(CodigoItem codigoItem, Valor valorTotal) {
		Valor valorItem = regraDePrecificacao.get(codigoItem);
		valorTotal.Add(valorItem);
	}
	

}
