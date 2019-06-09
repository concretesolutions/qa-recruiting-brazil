package testesJUnit;
import org.junit.Assert;
import org.junit.Test;



public class TesteContas {
	
			@Test
			
			public void testeContas(){
				
	int valorTotal = 0;
	int valorTotalEsperado=440;
	int precoUnitarioA = 50;
	int precoUnitarioB = 30;
	int precoUnitarioC = 20;
	int precoUnitarioD = 15;
	int quantidadePromoA = 0;
	int quantidadePromoB = 0;
	int A = 7, B = 3, C = 2, D = 1;
	
	precoUnitarioA*=A;
	precoUnitarioB*=B;
	precoUnitarioC*=C;
	precoUnitarioD*=D;
	valorTotal=(precoUnitarioA + precoUnitarioB + precoUnitarioC + precoUnitarioD);
	quantidadePromoA= (A / 3);
	
	if (quantidadePromoA>=1) {
	quantidadePromoA*=20;	
	}
	
	quantidadePromoB= (B / 2);
	
	if (quantidadePromoB>=1) {
	quantidadePromoB*=15;	
	}
	valorTotal-= (quantidadePromoA + quantidadePromoB);
	System.out.println("Valor esperado é de " + valorTotalEsperado);
	System.out.println("Valor real retornado é de " + valorTotal);
	Assert.assertEquals(valorTotal, valorTotalEsperado, 0);
		
	}

}
