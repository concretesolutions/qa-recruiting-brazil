package AppTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import AppJava.CodigoItem;

public class CodigoItemTest {

	@Test
	public void QuandoItemAIgualItemA() {

		CodigoItem codigoItem = new CodigoItem("A");
		CodigoItem codigoItemA = new CodigoItem("A");

		assertEquals(codigoItem, codigoItemA);
	}

	@Test
	public void QuandoItemBDiferenteItemA() {

		CodigoItem codigoItemB = new CodigoItem("B");
		CodigoItem codigoItemA = new CodigoItem("A");

		assertNotEquals(codigoItemB, codigoItemA);
	}
	
}
