import java.util.Scanner;

public class Hello_Concrete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a;
		int itemA1;
		int itemA2;
		int itemA3;
		int soma1;
	
		System.out.println("Digite seu Nome para Identica��o nas vendas ");
		Scanner ler = new Scanner(System.in);
		a = ler.next();

		System.out.println("Digite o pre�o Unit�rio");
		Scanner ler2 = new Scanner(System.in);
		itemA1 = ler2.nextInt();

		System.out.println("Digite o pre�o unit�rio ");
		Scanner ler3 = new Scanner(System.in);
		itemA2 = ler3.nextInt();

		System.out.println("Digite o pre�o unit�rio");
		Scanner ler4 = new Scanner(System.in);
		itemA3 = ler4.nextInt();
		soma1 = itemA1 + itemA2 + itemA3;

		if (soma1 == 150) {
			System.out.println("Item A na promo��o" + " " + " " + soma1);
		} else {
			System.out.println("item sem promo��o" + " " + soma1);
		}
		if (soma1 == 45) {
			System.out.println("Item  B  na promo��o" + " " + " " + soma1);
		} else {

			if (soma1 == 20) {
				System.out.println("item C sem promo��o" + " " + soma1);
			} else {
				if (soma1 == 15) {
					System.out.println("item C sem promo��o" + " " + soma1);
				}

			}
		}
	}
}
