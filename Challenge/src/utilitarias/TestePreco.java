package utilitarias;

public class TestePreco {

	/*
	 * Método responsável por dar início a um novo checkout, onde é possível
	 * informar as mercadorias disponíveis e suas características.
	 * 
	 * De forma separada, cada mercadoria é enviada, em maiúsculo, para ser
	 * escaneada.
	 * 
	 * Ao final é retornado o total da soma dos valores das mercadorias com os
	 * devidos descontos aplicados.
	 */

	public int preco(String mercadoria) {

		CheckOut checkOut = new CheckOut();

		for (String cadaMercadoria : mercadoria.split("")) {

			checkOut.scan(cadaMercadoria.toUpperCase());
		}

		return checkOut.getTotal();
	}

	// Envio de uma String que corresponde a várias mercadorias

	public void testeTotais() {

		System.out.println("Total a cada soma: " + this.preco("DABABA")); // 190
	}

	/*
	 * Envio consecutivo de várias mercadorias para ser escaneada seguindo da
	 * informação do valor total correspondente a todas as mercadorias escaneadas
	 * até o momento.
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
