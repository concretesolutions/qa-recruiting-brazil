package kata09;
import java.util.HashMap;
import java.util.Map;

public class CheckOut {

    private RegrasDosPrecos regraDosPrecos;
    private Map<String, Integer> itens = new HashMap<String, Integer>(); // Criação do HashMap que irá armazenar os itens.
  

    public CheckOut(RegrasDosPrecos regraDosPrecos) {
        this.regraDosPrecos = regraDosPrecos;
    }

	public void scan(String item) {
        if(!itens.containsKey(item)) { //Se o item já existe, então a quantidade do item é aumentada em um.
            itens.put(item, 1);
        } else {                       ///Se o item não existe, então um novo item é adicionado ao HashMap itens.
            itens.put(item, itens.get(item) + 1);
        }
    }

    public int precoTotal() {
        int precoTotal = 0;

        for(Map.Entry<String, Integer> entry : itens.entrySet()) {
        	precoTotal += regraDosPrecos.getPrecoItem(entry.getKey(), entry.getValue());
        }

        return precoTotal;
    }
}
