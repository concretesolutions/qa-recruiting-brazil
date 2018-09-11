package AppTest;

import static org.junit.Assert.*;
import org.junit.Test;
import AppJava.Valor;

public class ValorTest {
	
	@Test
	public void Valor1NaoIgualParaValor2() {
		Valor valor1 = new Valor(1);
		Valor valor2 = new Valor(2);
		
		assertNotEquals(valor1,valor2);
	}
	
	@Test
	public void Valor1IgualParaValor1() {
		Valor valor1 = new Valor(1);
		Valor valor3 = new Valor(1);
		
		assertEquals(valor1,valor3);
	}


}
