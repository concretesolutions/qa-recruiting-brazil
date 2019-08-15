package checkout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
//classe
public class CheckOut {
	Map<String, Integer> Itens = new HashMap<String, Integer>();
	{
		Itens.put("A", 50);
		Itens.put("B", 30);
		Itens.put("C", 20);
		Itens.put("D", 15);
	}
		
	private int total;
	private int valor;
	
	ArrayList<String> repetidos = new ArrayList<String>();
	
	public void scan(String item){
		
		int cont;
		this.valor = Itens.get(item);
		this.total += this.valor;
		
		repetidos.add(item);
		//conta a frequencia qt 
		cont =  Collections.frequency(repetidos, item);
		
		if (item == "A" && cont % 3 == 0){
		//pega o resto da divisão se for o item for A
			this.total -= 20;			
		}
		
		if (item == "B" && cont % 2 == 0){
			this.total -= 15;
		}		
		
	}
	
	public int total(){
		return total;
	}
	
	public void reset(){
		this.valor = 0;
		this.total = 0;
	}
	
	
	
}
