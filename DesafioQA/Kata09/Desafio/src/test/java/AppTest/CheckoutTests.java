package AppTest;

import static org.junit.Assert.*;

import org.junit.Test;
import AppJava.Checkout;
import AppJava.CodigoItem;
import AppJava.Valor;

public class CheckoutTests {

	@Test
	public void QuandoEuNaoScaneioItemEntaoValorZero() {
		Valor TotalEsperado = new Valor(0);
		Checkout checkout = new Checkout();
		Valor TotalAtual = checkout.total();

		assertEquals(TotalEsperado, TotalAtual);
	}

	@Test
	public void QuandoEuScaneioItemAEntaoValorCinquenta() {
		Valor TotalEsperado = new Valor(50);
		Checkout checkout = new Checkout();
		checkout.scan(new CodigoItem("A"));
		Valor TotalAtual = checkout.total();

		assertEquals(TotalEsperado, TotalAtual);
	}

	@Test
	public void QuandoEuScaneioItemBEntaoValorTrinta() {
		Valor TotalEsperado = new Valor(30);
		Checkout checkout = new Checkout();
		checkout.scan(new CodigoItem("B"));
		Valor TotalAtual = checkout.total();

		assertEquals(TotalEsperado, TotalAtual);
	}

	@Test
	public void QuandoEuScaneioItemABEntaoValorOitenta() {
		Valor TotalEsperado = new Valor(80);
		Checkout checkout = new Checkout();
		checkout.scan(new CodigoItem("A"));
		checkout.scan(new CodigoItem("B"));
		Valor TotalAtual = checkout.total();

		assertEquals(TotalEsperado, TotalAtual);
	}

}
