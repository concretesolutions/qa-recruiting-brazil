package recebeProduto;

import java.util.Scanner;

public class RecebeProduto {

	private boolean E=false;
	private int A = 0, B = 0, C = 0, D = 0;
	private Scanner sc = new Scanner(System.in); //inicia scanner

	public  void recebeProduto () {
		
	while (E==false) {	
		char opcaos = sc.next().charAt(0);
		if(opcaos=='A') {
			setA(getA() + 1);
			System.out.println("Este � o " + getA() + " produto A que voc� escolheu");
		}	
		
			if(opcaos=='B') {
				setB(getB() + 1);
				System.out.println("Este � o " + getB() + " produto B que voc� escolheu");		
		}
			
			if(opcaos=='C') {
				setC(getC() + 1);
				System.out.println("Este � o " + getC() + " produto C que voc� escolheu");
		}	

			if(opcaos=='D') {
				setD(getD() + 1);
				System.out.println("Este � o " + getD() + " produto D que voc� escolheu");
		}
		
			if(opcaos=='E') {
				System.out.println("Voc� encerrou a compra ");
				E=true;
		}
		}
	sc.close();//para de comprar produtos
	
	}

	public int getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	public int getC() {
		return C;
	}

	public void setC(int c) {
		C = c;
	}

	public int getD() {
		return D;
	}

	public void setD(int d) {
		D = d;
	}
}
	
	
	
