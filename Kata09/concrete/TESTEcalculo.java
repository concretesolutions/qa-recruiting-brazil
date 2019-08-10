package desafio.concrete;

import java.util.Scanner;

public class TESTEcalculo {
	int quantiaProdutos;
	char calculoQuantia;
	int produtoA = 0, produtoB = 0, produtoC = 0, produtoD = 0;
		Scanner sc = new Scanner(System.in);
	
	public void calculo() {
		for(int i = 0; i < quantiaProdutos; i++) {
			System.out.println("Selecione o produto");

		    char recebeProduto = sc.next().charAt(0);
			
			
			if(recebeProduto == 'a') {
				produtoA += 1;
			}
			else if(recebeProduto == 'b') {
				produtoB += 1;
			}
			else if(recebeProduto == 'c') {
				produtoC += 1;
			}
			else if(recebeProduto == 'd') {
				produtoD += 1;
			}
			
		
		}

	
		// VALOR SEM DESCONTO
		

		int ProdASemDesconto = produtoA*50;
		int ProdBSemDesconto = produtoB*30;
		int ProdCSemDesconto = produtoC*20;
		int ProdDSemDesconto = produtoD*15;
		

		
		
		//VALOR COM DESCONTO
		int calcDescA = ProdASemDesconto - ((produtoA/3)*20);
	    int calcDescB = ProdBSemDesconto - ((produtoB/2)*15);

	    
	    int somaTudo = calcDescA + calcDescB + ProdCSemDesconto+ProdDSemDesconto;

	    System.out.print("\n\n VALOR TOTAL COM DESCONTO: \n"+somaTudo);
	  //return somaTudo;		
	}
}
