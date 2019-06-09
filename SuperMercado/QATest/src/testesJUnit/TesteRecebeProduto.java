package testesJUnit;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class TesteRecebeProduto {
	
	@Test
	public  void recebeProduto () {
		
		boolean E=false;
		int A = 0, B = 0, C = 0, D = 0, i=0, esperado=6;
		
	while (E==false) {	
		if (i<=5) {
			
				A+=1;
				System.out.println("Este é o " + A + " produto A que você escolheu");
		
			
					B+= 1;
					System.out.println("Este é o " + B + " produto B que você escolheu");		
				
				
					C+= 1;
					System.out.println("Este é o " + C + " produto C que você escolheu");

				
					D+= 1;
					System.out.println("Este é o " + D + " produto D que você escolheu");
			
					if (i==5) {
					System.out.println("Você encerrou a compra ");
					E=true;
				}
				i++;
			}
			
			
			
			
			
			
		}
				Assert.assertEquals(esperado, A, 0);
				Assert.assertEquals(esperado, B, 0);
				Assert.assertEquals(esperado, C, 0);
				Assert.assertEquals(esperado, D, 0);
				assertTrue(E);
	
		}
	
}



