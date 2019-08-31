import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Katacheckout {
	
	Map<String, Integer> rules = new HashMap<String, Integer>();
	{
		rules.put("A", 50); 		rules.put("B", 30);
		rules.put("C", 20); 		rules.put("D", 15);		
	}
	int totalCompras;
	int valor;
	
	public void scan(String itens) {
			
		int valor = rules.get(itens);
		totalCompras += valor; 
		ArrayList<String> itensRepetidos = new ArrayList<String>();
		
		itensRepetidos.add(itens);
		int i = Collections.frequency(itensRepetidos, itens);
		
		if (itens.contains("AAA"))  {
			totalCompras -=20;
		}
		
		if (itens.contains("BB")) {
			totalCompras -= 15;
		}
	}
	public int totalCompras() {
		return totalCompras;
		
	}
	public void zeraValores() {
		valor = 0;
		totalCompras = 0;
		}
}
