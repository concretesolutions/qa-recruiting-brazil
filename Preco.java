import java.util.Scanner;
public class Preco {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		String nome;
		int continua = 1, aaa = 0, bb=0, PrecoFinal;
		int A=0, B=0, C=0, D=0;
		while (continua == 1) {
		System.out.println("Digite o Código do produto A,B,C,D");		
		nome = sc.nextLine();
		System.out.println("Deseja continuar? Digite 1 para sim ou 2 para não");		
		continua = sc1.nextInt();
		
	
	//Identifica quantos A  foram colocados no carrinho de compra 
	//e quantos grupos de 3A podem ser formados
		if (nome.charAt(0) == 'A') {
			A= A+1;
		   if (A==3) {
			   aaa= (int) (aaa +A);
			   A=0;
		   }
		
		}
		//Identifica quantos B  foram colocados no carrinho de compra 
		//e quantos grupos de 2B podem ser formados
		
		
		
		if (nome.charAt(0) == 'B') {
			B= B+1;
			 if (B==2) {
				   bb= (int) (bb +B);
				   B=0;
			   }
		}
		//Identifica quantos C  foram colocados no carrinho de compra 
		if (nome.charAt(0) == 'C') {
			C= C+1;
		}
		//Identifica quantos D  foram colocados no carrinho de compra 
		if (nome.charAt(0) == 'D') {
			D= D+1;
   }
			
		}
		
		
		//REGRA DE DESCONTOS DE PREÇO  A VARIAVEL aaa representa os grupos de 3A

		//REGRA DE DESCONTOS DE PREÇO  A VARIAVEL bb representa os grupos de 2b

		//REGRA DE DESCONTOS DE PREÇO  A VARIAVEL A representa A quantidade de A quem NÃO FORMA UM GRUPO DE 3
		//REGRA DE DESCONTOS DE PREÇO  B VARIAVEL A representa A quantidade de A quem NÃO FORMA UM GRUPO DE 2
		//REGRA DE DESCONTOS DE PREÇO  C VARIAVEL C representa A quantidade de C
		//REGRA DE DESCONTOS DE PREÇO  D VARIAVEL C representa D quantidade de C
		aaa=aaa/3;
		bb=bb/2;
		// CALCULA O PREÇO FINAL
		
	
		PrecoFinal = (aaa*130) + (A*50) + (bb*45) +(B*30) + (C*20) +(D*15);
		System.out.println( "Preço Final");
		System.out.println( PrecoFinal);
				
	
	
	//Suites de testes
	//Cenario 1 CLIENTE COMPROU  3 A.
    //resultado esperado = 130
	if (PrecoFinal == 0) {
		System.out.println( " ");	}
		
		if (PrecoFinal == 50) {
			System.out.println( "A ");
		}
		if (PrecoFinal == 80) {
			System.out.println( "AB ");
		}
		if (PrecoFinal == 115) {
			System.out.println( "ABC ");
		}
		if (PrecoFinal == 115) {
			System.out.println( "CDBA ");
		}
		
		if (PrecoFinal == 100) {
			System.out.println( "AA ");
		}
			
		if (PrecoFinal == 130) {
			System.out.println( "AAA ");
		}
		
		if (PrecoFinal == 180) {
			System.out.println( "AAAA ");
		}
		
		if (PrecoFinal == 230) {
			System.out.println( "AAAAA ");
		}
		if (PrecoFinal == 260) {
			System.out.println( "AAAAAA ");
		}
		
		if (PrecoFinal == 160) {
			System.out.println( "AAAB ");
		}
		if (PrecoFinal == 175) {
			System.out.println( "AAABB ");
		}
		if (PrecoFinal == 190) {
			System.out.println( "AAABBD ");
		}
		if (PrecoFinal == 190) {
			System.out.println( "DABABA ");
		
		
		}
		
	}
	

	}
	
		
	
