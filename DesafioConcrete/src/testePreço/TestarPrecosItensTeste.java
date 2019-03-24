package testePreço;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import PrecoProduto.TesteProduto;

public class TestarPrecosItensTeste {
	
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		TesteProduto t = new TesteProduto();
		
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
