import static org.junit.Assert.*;
import org.junit.Test;

public class Testes {

	private void assertEquals(int i, int price) {
		// TODO Auto-generated method stub

	}
	@Test
	public void test_incremental() {

		Katacheckout desc = new Katacheckout();

		desc.scan("A");
		assertEquals(50, desc.totalCompras());
		desc.scan("B");
		assertEquals(80, desc.totalCompras());
		desc.scan("A");
		assertEquals(130, desc.totalCompras());
		desc.scan("A");
		assertEquals(160, desc.totalCompras());
		desc.scan("B");
		assertEquals(175, desc.totalCompras());

	}

	@Test
	public void test_totals() {

		assertEquals(0, price(""));
		assertEquals(50, price("A"));
		assertEquals(80, price("AB"));
		assertEquals(115, price("CDBA"));

		assertEquals(100, price("AA"));
		assertEquals(130, price("AAA"));
		assertEquals(180, price("AAAA"));
		assertEquals(230, price("AAAAA"));
		assertEquals(260, price("AAAAAA"));

		assertEquals(160, price("AAAB"));
		assertEquals(175, price("AAABB"));
		assertEquals(190, price("AAABBD"));
		assertEquals(190, price("DABABA"));	

	}	

	public static int price(String itens) {

		Katacheckout desc = new Katacheckout();
		desc.zeraValores();

		for (int i = 0; i < itens.length(); i++) {
			String item = Character.toString(itens.charAt(i));
			desc.scan(item);
		}
		return desc.totalCompras();

	}
}
