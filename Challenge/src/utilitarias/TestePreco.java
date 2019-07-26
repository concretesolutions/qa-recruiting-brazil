package utilitarias;

public class TestePreco {

	/*
	 * M�todo respons�vel por dar in�cio a um novo checkout, onde � poss�vel
	 * informar as mercadorias dispon�veis e suas caracter�sticas.
	 * 
	 * De forma separada, cada mercadoria � enviada, em mai�sculo, para ser
	 * escaneada.
	 * 
	 * Ao final � retornado o total da soma dos valores das mercadorias com os
	 * devidos descontos aplicados.
	 */

	public int preco(String mercadoria) {

		CheckOut checkOut = new CheckOut();

		for (String cadaMercadoria : mercadoria.split("")) {

			checkOut.scan(cadaMercadoria.toUpperCase());
		}

		return checkOut.getTotal();
	}

	// Envio de uma String que corresponde a v�rias mercadorias

	public void testeTotais() {

		System.out.println("Total a cada soma: " + this.preco("DABABA")); // 190
	}

	/*
	 * Envio consecutivo de v�rias mercadorias para ser escaneada seguindo da
	 * informa��o do valor total correspondente a todas as mercadorias escaneadas
	 * at� o momento.
	 */

	public void testeIncremental() {

		CheckOut checkOut = new CheckOut(); // DABABA 190

		System.out.println("\nTotal: " + checkOut.getTotal());

		checkOut.scan("d");
		System.out.println("Total: " + checkOut.getTotal());

		checkOut.scan("A");
		System.out.println("Total: " + checkOut.getTotal());

		checkOut.scan("B");
		System.out.println("Total: " + checkOut.getTotal());

		checkOut.scan("a");
		System.out.println("Total: " + checkOut.getTotal());

		checkOut.scan("b");
		System.out.println("Total: " + checkOut.getTotal());

		checkOut.scan("A");
		System.out.println("Total: " + checkOut.getTotal());

	}

}
