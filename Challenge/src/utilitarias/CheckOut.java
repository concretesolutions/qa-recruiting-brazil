package utilitarias;

import java.util.ArrayList;

import bean.Mercadoria;

public class CheckOut {

	private ArrayList<Mercadoria> mercadoriasInformadasNoCheckOut = new ArrayList<Mercadoria>();

	private Mercadoria mercadoriaAtual = new Mercadoria();

	private String mercadoriasConcatenadas = "";

	private int total = 0;

	/*
	 * O m�todo construtor da classe faz com que, a cada nova inst�ncia desta, seja
	 * necess�ria a informa��o dos detalhes de cada mercadoria.
	 * 
	 * Uma lista � preenchida com cada uma delas.
	 */

	public CheckOut() {

		DetalhesDaMercadoria detalhesDaMercadoria = new DetalhesDaMercadoria();

		mercadoriasInformadasNoCheckOut = detalhesDaMercadoria.informarDetalhesDaMercadoria();
	}

	/*
	 * Este m�todo possui um par�metro relacionado a cada mercadoria que ser�
	 * enviada a ele para leitura.
	 * 
	 * Se o item enviado a ele n�o for vazio, o seguinte ocorrer�: cada mercadoria
	 * informada no checkout ser� comparada � mercadoria recebida como par�metro. Se
	 * a compara��o for verdadeira, ela ser� considerada a mercadoria atual para que
	 * seja poss�vel recuperar as suas informa��es.
	 * 
	 * Ao fim, a mercadoria escaneada ser� enviada ao m�todo respons�vel para
	 * c�lculo do valor total.
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
	 * O m�todo � respons�vel por: recuperar os atributos da mercadoria atual,
	 * calcular o desconto da mercadoria atual, separar em um array a vari�vel
	 * respons�vel por guardar cada mercadoria escaneada, incrementar a vari�vel
	 * 'controle' se a mercadoria informada for encontrada entre os itens
	 * anteriormente escaneados.
	 * 
	 * Al�m disto, h� uma compara��o entre o valor de controle com o n�mero da
	 * quantidade de itens necess�rios para aplicar o desconto menos 1, pois o
	 * desconto ser� aplicado ap�s a atual mercadoria escaneada ser incrementada �s
	 * existentes.
	 * 
	 * Sendo verdareia a compara��o, o valor true � atribuido � vari�vel que informa
	 * a aplica��o do desconto para aquele item.
	 * 
	 * Ap�s a aplia��o do descontro e incremento daquela mercadoria �
	 * 'mercadoriasConcatenadas', todos os itens iguais �quele s�o removidos para
	 * que novos descontos sejam aplicados, mas considerando os itens a partir
	 * daquele �ltimo (tamb�m removido ap�s o valor total j� ter sido informado com
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

	// M�todo respons�vel por retornar o valor total calculado.

	public int getTotal() {

		return total;
	}

}
