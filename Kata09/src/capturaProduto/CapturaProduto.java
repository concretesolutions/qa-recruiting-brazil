package capturaProduto;

import java.util.Scanner;

public class CapturaProduto {

	private boolean E=false;
	private int A = 0, B = 0, C = 0, D = 0;
	private Scanner sc = new Scanner(System.in);

	public  void capturaProduto () {
		
	while (E==false) {	
		char produto = sc.next().charAt(0);
		if(produto=='A') {
			setA(getA() + 1);
			System.out.println("Você tem " + getA() + " produto A no carrinho");
		}	
		
			if(produto=='B') {
				setB(getB() + 1);
				System.out.println("Você tem " + getB() + " produto B no carrinho");		
		}
			
			if(produto=='C') {
				setC(getC() + 1);
				System.out.println("Você tem " + getC() + " produto C no carrinho");
		}	

			if(produto=='D') {
				setD(getD() + 1);
				System.out.println("Você tem " + getD() + " produto D no carrinho");
		}
		
			if(produto=='E') {
				System.out.println("Compra finalizada");
				E=true;
		}
		}
	sc.close();
	
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
