package concrete.desafio;

import concrete.desafio.model.Mercado;

public class App {

	public static void main(String[] args) {

		App main = new App();
		main.iniciar("ABC");
	}

	public float iniciar(String str) {

		String pesqA = "A";
		String pesqB = "B";
		String pesqC = "C";
		String pesqD = "D";

		int a = 0;
		int b = 0;
		int ocorrenciasA = 0;
		int ocorrenciasB = 0;
		int ocorrenciasC = 0;
		int ocorrenciasD = 0;

		for (int i = 0; i < str.length(); i++) {

			if (pesqA.equals("" + str.charAt(i))) {

				ocorrenciasA++;

				if (ocorrenciasA == 3) {
					a = (int) (a + 1);
					ocorrenciasA = 0;
				}
			}

			if (pesqB.equals("" + str.charAt(i))) {

				ocorrenciasB++;

				if (ocorrenciasB == 2) {
					b = (int) (b + 1);
					ocorrenciasB = 0;
				}

			}

			if (pesqC.equals("" + str.charAt(i))) {

				ocorrenciasC++;

			}
			if (pesqD.equals("" + str.charAt(i))) {

				ocorrenciasD++;

			}

		}

		Mercado mercado = new Mercado(a, b, ocorrenciasA, ocorrenciasB, ocorrenciasC, ocorrenciasD);
		this.apresentarResultado(mercado.calcular());
		return mercado.getPrecoTotal();
	}

	public void apresentarResultado(Mercado mercado) {

		System.out.println("Bem vindo! \nAo Mercadinho Desafio Concrete:\n");

		System.out.println("Sua lista de Compras:\n");

		System.out.println("Quantidade do Produto A: " + mercado.getOcorrenciasA() + "\n" + "Valor Total = "
				+ mercado.getPrecoA() + "\n");

		System.out.println("Quantidade do Produto B: " + mercado.getOcorrenciasB() + "\n" + "Valor Total = "
				+ mercado.getPrecoB() + "\n");

		System.out.println("Quantidade do Produto C: " + mercado.getOcorrenciasC() + "\n" + "Valor Total = "
				+ mercado.getPrecoC() + "\n");

		System.out.println("Quantidade do Produto D: " + mercado.getOcorrenciasD() + "\n" + "Valor Total = "
				+ mercado.getPrecoD() + "\n");

		System.out.println("Preço Total " + mercado.getPrecoTotal() + "\n");
	}

}
