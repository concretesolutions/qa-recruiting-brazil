package Produto;

import org.junit.Test;
import Produto.ValorProduto;

public class TestProduto {

	@Test
	public void test() {

		ValorProduto t = new ValorProduto();

		t.retornarPreco("");
		t.retornarPreco("A");
		t.retornarPreco("CDBA");

		t.retornarPreco("AA");
		t.retornarPreco("AAA");
		t.retornarPreco("AAAA");
		t.retornarPreco("AAAAA");
		t.retornarPreco("AAAAAA");

		t.retornarPreco("AAAB");
		t.retornarPreco("AAABB");
		t.retornarPreco("AAABBD");
		t.retornarPreco("DABABA");

	}

}
