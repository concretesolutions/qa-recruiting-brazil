package testes;
import kata09.CheckOut;

public class TestesKata09 {

	public static void main(String[] args) { // itens para realização de testes
		assert_equal(  0, precos(""));       // retorna true se o valor for igual ao calculado
	    assert_equal( 50, precos("A"));      // retorna false se o valor for passado for diferente do calculado
	    assert_equal( 80, precos("AB"));
	    assert_equal(115, precos("CDBA"));

	    assert_equal(100, precos("AA"));
	    assert_equal(130, precos("AAA"));
	    assert_equal(180, precos("AAAA"));
	    assert_equal(230, precos("AAAAA"));
	    assert_equal(260, precos("AAAAAA"));

	    assert_equal(160, precos("AAAB"));
	    assert_equal(175, precos("AAABB"));
	    assert_equal(190, precos("AAABBD"));
	    assert_equal(190, precos("DABABA"));
	    
	}

	private static int precos(String itens) { // Calcula o preco dos itens que estão na String
		TestesPrecos regraDosPrecos = new TestesPrecos();
			CheckOut checkOut = new CheckOut(regraDosPrecos.regras());	 
		    for(int i = 0; i < itens.length(); i++) {
	            checkOut.scan(itens.substring(i, i+1));
	        }
		    return checkOut.precoTotal();	
	}
		
	
	private static boolean assert_equal(int i, int precos) { // Se o preco i for igual ao calculado, então o metodo retorna true
		if(i == precos) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
