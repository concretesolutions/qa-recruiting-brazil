package kata09;
import java.util.HashMap;
import java.util.Map;

public class RegrasDosPrecos {

    private Map<String, Integer> precoNormal = new HashMap<String, Integer>();
    private Map<String, Desconto> descontoPreco = new HashMap<String, Desconto>();

    public void adicionarRegraDosPrecos(String item, int preco) {
    	precoNormal.put(item, preco);
    }

    public void adicionarRegraDoDesconto(String item, Desconto desconto) {
    	descontoPreco.put(item, desconto);
    }
    
    public int getPrecoItem(String item, int quantidade) {

        int precoTotal = precoNormal.get(item) * quantidade;

        if(descontoPreco.containsKey(item)) {
        	precoTotal -= descontoPreco.get(item).calcularDesconto(quantidade);
        }

        return precoTotal;
    }
}
