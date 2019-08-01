package utilitarias;

import java.util.ArrayList;
import java.util.Scanner;

import bean.Mercadoria;

public class DetalhesDaMercadoria {

	/* M�todo para retorno de uma lista com os nomes das mercadorias informadas. */

	public ArrayList<String> getNomesDasMercadorias() {

		ArrayList<String> nomeDeCadaMercadoria = new ArrayList<String>();

		ArrayList<Mercadoria> mercadoria = this.informarDetalhesDaMercadoria();

		for (Mercadoria cadaItem : mercadoria) {

			nomeDeCadaMercadoria.add(cadaItem.getNomeDaMercadoria());
		}

		return nomeDeCadaMercadoria;
	}

	/*
	 * M�todo para que sejam informados os atributos das mercadorias, inclusive
	 * quantas ser�o adicionadas em cada execu��o
	 */

	public ArrayList<Mercadoria> informarDetalhesDaMercadoria() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantas mercadorias voc� deseja adicionar? ");

		int qtdMercadoriasASeremAdicionadas = scanner.nextInt();

		ArrayList<Mercadoria> novasMercadorias = new ArrayList<>(qtdMercadoriasASeremAdicionadas);

		for (int x = 0; x < qtdMercadoriasASeremAdicionadas; x++) {

			Mercadoria item = new Mercadoria();

			System.out.println("\nNome da mercadoria: ");
			String nomeDaMercadoria = scanner.next();

			item.setNomeDaMercadoria(nomeDaMercadoria);

			System.out.println("\nPre�o unit�rio: ");
			int precoUnitario = scanner.nextInt();

			item.setPrecoUnitario(precoUnitario);

			System.out.println("\nQuantidade de itens para que o desconto seja aplicado: ");
			int qtdItensParaDesconto = scanner.nextInt();

			item.setQtdItensParaDesconto(qtdItensParaDesconto);

			System.out.println("\nPre�o com o desconto: ");
			int precoComDesconto = scanner.nextInt();

			item.setPrecoComDesconto(precoComDesconto);

			novasMercadorias.add(item);
		}

		scanner.close();

		return novasMercadorias;
	}
}
