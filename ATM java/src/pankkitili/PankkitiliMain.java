package pankkitili;
import java.util.Scanner;
public class PankkitiliMain {
	private static Scanner scanner = new Scanner (System.in);

	public static void main(String[] args) {
		boolean lopeta = false;
		String tilinumero;
		String nimi;
		double saldo;
		int valinta;

		System.out.println("Anna tilinumero > ");
		tilinumero = scanner.nextLine();
		System.out.println("Anna tilinomistajan nimi > ");
		nimi = scanner.nextLine();
		System.out.println("Anna aloitus saldo > ");
		saldo = scanner.nextDouble();
		while(saldo<0) {
			System.out.println("Aloitus saldo ei voi olla negatiivinen");
			System.out.println("Anna aloitus saldo > ");
			saldo = scanner.nextDouble();
		}
		Pankkitili pankkitili = new Pankkitili(tilinumero,nimi,saldo);
		
		while(!lopeta) {
			printMainMenu();
			valinta = scanner.nextInt();
			switch(valinta) {
			    case 1:
				    pankkitili.tilintiedot();
				    break;
			    case 2:
			    	System.out.println("Anna talletettava summa  > ");
			    	pankkitili.saldoTalleta(scanner.nextDouble());
			    	break;
			    case 3:
			    	System.out.println("Anna nostettava summa > ");
			    	pankkitili.saldoNosto(scanner.nextDouble());
			    	break;
			    case 4:
			    	lopeta = true;
			    	break;
			    default:
			    	System.out.println("Virheellinen valinta");
			}
		}
		scanner.close();
	}
	
	public static void printMainMenu() {
		System.out.printf("\nValitse toiminto\n1. Nayta tilin tiedot\n2. Suorita talletus\n3. Suorita nosto\n4. Lopeta\n");
	}

}
