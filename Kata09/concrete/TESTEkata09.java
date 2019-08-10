package desafio.concrete;

import java.util.Scanner;

public class TESTEkata09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("SISTEMA EM FUNCIONAMENTO");
	
		
		TESTEcalculo y;
		y = new TESTEcalculo();
		
		
		
		System.out.println("\nDigite o total de produtos");
		y.quantiaProdutos = sc.nextInt();
		
		y.calculo(); 
		
		sc.close();
		
	}

}
