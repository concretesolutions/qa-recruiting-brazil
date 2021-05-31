package main;

import java.util.*;

public class Carrinho {

	public static TreeMap<String, Integer> listaDeItens = new TreeMap<String, Integer>();

	public static void adicionarItem(String item, Integer qtd) {

		if (!listaDeItens.containsKey(item))
			listaDeItens.put(item, qtd);
		else {
			listaDeItens.put(item, qtd + listaDeItens.get(item));
		}
	}

	public static void removeItem(String item, Integer quantity) throws Exception {

		if (!listaDeItens.containsKey(item))
			throw new Exception("Esse item não existe no seu carrinho");

		if (listaDeItens.get(item) == quantity)
			listaDeItens.remove(item);
		else if (listaDeItens.get(item) > quantity)
			listaDeItens.put(item, listaDeItens.get(item) - quantity);
		else
			throw new Exception("Quantidade para o item fornecido é maior do que a quantidade no carrinho");
	}

	public static void revisarCarrinho() throws Exception {
		if (listaDeItens.isEmpty())
			throw new Exception("Seu carrinho está vazio");

		Set<String> todosItensdoCarrinho = listaDeItens.keySet();
		for (Iterator<String> i = todosItensdoCarrinho.iterator(); i.hasNext();) {
			String item = i.next();
			Integer qtdd = listaDeItens.get(item);
			System.out.println("Item: " + item + " quantidade: " + qtdd);
		}
	}

	public static void limparCarrinho() {
		listaDeItens.clear();
	}

	public static double calcularPrecoTotal(TreeMap<String, Integer> listaDeItens) {
		Double total = 0.0;

		Set<String> keys = listaDeItens.keySet();
		for (Iterator<String> i = keys.iterator(); i.hasNext();) {
			String item = i.next();
			Integer quantidade = listaDeItens.get(item);

			if (ProdutoOferta.produtoOferta.containsKey(item)) {

				Produto produto = (Produto)ProdutoOferta.produtoOferta.get(item);

				if (produto.qtd < quantidade) {
					total += (quantidade % produto.qtd) * ProdutoPreco.produtoPreco.get(item)
							+ (quantidade / produto.qtd) * produto.preco;
				} else if (produto.qtd == quantidade) {
					total += produto.preco;
				} else {
					total += (quantidade) * ProdutoPreco.produtoPreco.get(item);
				}
			} else {
				total += (quantidade) * ProdutoPreco.produtoPreco.get(item);
			}
		}

		return total;
	}

}
