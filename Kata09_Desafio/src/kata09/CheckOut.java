package kata09;
import java.util.HashMap;
import java.util.Map;

public class CheckOut {

    private RegrasDosPrecos regraDosPrecos;
    private Map<String, Integer> itens = new HashMap<String, Integer>(); // Cria��o do HashMap que ir� armazenar os itens.
  

    public CheckOut(RegrasDosPrecos regraDosPrecos) {
        this.regraDosPrecos = regraDosPrecos;
    }

	public void scan(String item) {
        if(!itens.containsKey(item)) { //Se o item j� existe, ent�o a quantidade do item � aumentada em um.
            itens.put(item, 1);
        } else {                       ///Se o item n�o existe, ent�o um novo item � adicionado ao HashMap itens.
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
