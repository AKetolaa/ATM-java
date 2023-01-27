package pankkitili;

public class Pankkitili {

	
	private String tilinumero = "<untitled> ";
	private String nimi = "<untitled> ";
	private double saldo = 0.0;


	public String getTilinumero() {
		return tilinumero;
	}
	
	public String getNimi() {
		return nimi;
	}

	public double getSaldo() {
		return saldo;
	}

		public void saldoNosto(double nosto){
			if(nosto>this.getSaldo()) {
				System.out.println("Et voi nostaa saldoa suurempaa maaraa!!!");
			}else if(nosto<0) {
				System.out.println("Yllatuitko muka tosiaan kun et voikkaan nostaa negatiivisa lukuja");
			}else {
				this.saldo -= nosto;
				System.out.printf("Nostit %.2f €",nosto);
				System.out.println("\nTilinomistaja > \n" + this.nimi + "\nTilinumero > \n" + this.tilinumero + "\nSaldo\n" + this.saldo);
			}
			
		}
		
		public void saldoTalleta(double talletus) {
			if(talletus<0) {
				System.out.println("Miten ihmeessa voit tallettaa negatiivisia lukuja?? Etpa voinu");
			}
			else {
				this.saldo += talletus;
				System.out.printf("Talletit %.2f €",talletus);
				System.out.println("\nTilinomistaja > \n" + this.nimi + "\nTilinumero > \n" + this.tilinumero + "\nSaldo\n" + this.saldo);
			}
		}
		
		public Pankkitili(String tilinumero, String nimi, double saldo) {
			this.tilinumero = tilinumero;
			this.nimi = nimi;
			this.saldo = saldo;
			System.out.printf("Nimi > \n" + this.getNimi() + "\nTilinumero > \n" + this.getTilinumero() + "\nSaldo > \n" + this.saldo);
		}
		public void tilintiedot() {
			System.out.println("\nTilinomistaja > \n" + this.nimi + "\nTilinumero > \n" + this.tilinumero + "\nSaldo\n" + this.saldo);
		}

}
