package utilitarias;

import java.util.ArrayList;

import bean.Mercadoria;

public class CheckOut {

	private ArrayList<Mercadoria> mercadoriasInformadasNoCheckOut = new ArrayList<Mercadoria>();

	private Mercadoria mercadoriaAtual = new Mercadoria();

	private String mercadoriasConcatenadas = "";

	private int total = 0;

	/*
	 * O método construtor da classe faz com que, a cada nova instância desta, seja
	 * necessária a informação dos detalhes de cada mercadoria.
	 * 
	 * Uma lista é preenchida com cada uma delas.
	 */

	public CheckOut() {

		DetalhesDaMercadoria detalhesDaMercadoria = new DetalhesDaMercadoria();

		mercadoriasInformadasNoCheckOut = detalhesDaMercadoria.informarDetalhesDaMercadoria();
	}

	/*
	 * Este método possui um parâmetro relacionado a cada mercadoria que será
	 * enviada a ele para leitura.
	 * 
	 * Se o item enviado a ele não for vazio, o seguinte ocorrerá: cada mercadoria
	 * informada no checkout será comparada à mercadoria recebida como parâmetro. Se
	 * a comparação for verdadeira, ela será considerada a mercadoria atual para que
	 * seja possível recuperar as suas informações.
	 * 
	 * Ao fim, a mercadoria escaneada será enviada ao método responsável para
	 * cálculo do valor total.
	 **/

	public void scan(String mercadoriaEscaneada) {

		for (Mercadoria mercadoria : mercadoriasInformadasNoCheckOut) {

			if (!mercadoriaEscaneada.isEmpty()) {

				if (mercadoriaEscaneada.toUpperCase().compareTo(mercadoria.getNomeDaMercadoria().toUpperCase()) == 0) {

					mercadoriaAtual = mercadoria;

					this.calcularValorTotal(mercadoriaEscaneada);
				}
			}
		}
	}

	/*
	 * O método é responsável por: recuperar os atributos da mercadoria atual,
	 * calcular o desconto da mercadoria atual, separar em um array a variável
	 * responsável por guardar cada mercadoria escaneada, incrementar a variável
	 * 'controle' se a mercadoria informada for encontrada entre os itens
	 * anteriormente escaneados.
	 * 
	 * Além disto, há uma comparação entre o valor de controle com o número da
	 * quantidade de itens necessários para aplicar o desconto menos 1, pois o
	 * desconto será aplicado após a atual mercadoria escaneada ser incrementada às
	 * existentes.
	 * 
	 * Sendo verdareia a comparação, o valor true é atribuido à variável que informa
	 * a aplicação do desconto para aquele item.
	 * 
	 * Após a apliação do descontro e incremento daquela mercadoria à
	 * 'mercadoriasConcatenadas', todos os itens iguais àquele são removidos para
	 * que novos descontos sejam aplicados, mas considerando os itens a partir
	 * daquele último (também removido após o valor total já ter sido informado com
	 * o desconto).
	 */

	public void calcularValorTotal(String mercadoria) {

		int qtdItemParaDesconto = mercadoriaAtual.getQtdItensParaDesconto();
		int precoComDesconto = mercadoriaAtual.getPrecoComDesconto();
		int valorUnitario = mercadoriaAtual.getPrecoUnitario();

		boolean descontoAplicado = false;
		int controle = 0;

		int descontoDoItem = (valorUnitario * qtdItemParaDesconto) - precoComDesconto;

		String[] stringSeparada = mercadoriasConcatenadas.split("");

		for (String cadaMercadoriaArmazenada : stringSeparada) {

			if (mercadoria.toUpperCase().compareTo(cadaMercadoriaArmazenada.toUpperCase()) == 0) {

				controle++;
			}
		}

		if (controle == qtdItemParaDesconto - 1) {

			total = total + (valorUnitario - descontoDoItem);

			descontoAplicado = true;

		} else {

			total += valorUnitario;
		}

		mercadoriasConcatenadas += mercadoria;

		if (descontoAplicado) {

			mercadoriasConcatenadas = mercadoriasConcatenadas.replace(mercadoria, "");
		}

	}

	// Método responsável por retornar o valor total calculado.

	public int getTotal() {

		return total;
	}

}
