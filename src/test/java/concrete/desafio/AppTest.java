package concrete.desafio;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest{
	
	@Test
	public void iniciarTest() {
		
		App app = new App();
		assertEquals(0.0, app.iniciar(""), 0.0f);
		assertEquals(50.0, app.iniciar("A"), 0.0f);
		assertEquals(80.0, app.iniciar("AB"), 0.0f);
		assertEquals(115.0, app.iniciar("CDBA"), 0.0f);
		assertEquals(100.0, app.iniciar("AA"), 0.0f);
		assertEquals(130.0, app.iniciar("AAA"), 0.0f);
		
		assertEquals(180,app.iniciar("AAAA"), 0.0f);
		assertEquals(230, app.iniciar("AAAAA"), 0.0f);
		assertEquals(260, app.iniciar("AAAAAA"), 0.0f);
		
		assertEquals(160, app.iniciar("AAAB"), 0.0f);
		assertEquals(175, app.iniciar("AAABB"), 0.0f);
		assertEquals(190, app.iniciar("AAABBD"), 0.0f);
		assertEquals(190, app.iniciar("DABABA"), 0.0f);
	
	
	   }
        








}
