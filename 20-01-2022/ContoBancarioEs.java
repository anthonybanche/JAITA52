import java.util.Scanner;

public class ContoBancarioEs {

	public static void main(String[] args) {

		Conto c1 = new Conto("Giuseppe", 0f);
		c1.aggiungiSaldo(1000f);
		c1.prelevaSaldo(500f);
		c1.prelevaSaldo(400f);
		System.out.println("Saldo rimanente: " + c1.restituisciSaldo());

		Scanner s = new Scanner(System.in);
		System.out.println("Quanti conti vogliamo creare? ");

		int numeroConti = s.nextInt();
		Conto[] conti = new Conto[numeroConti];
		float totaleConti = 0f;
		for (int i = 0; i < numeroConti; i++) {
			System.out.println("Nome proprietario del conto: ");
			String nomeProprietario = s.nextLine();
			System.out.println("Saldo iniziale del conto: ");
			float saldoIniziale = s.nextFloat();
			conti[i] = new Conto(nomeProprietario, saldoIniziale);
			totaleConti += conti[i].restituisciSaldo();
		}
		System.out.println("Media conti: " + totaleConti / numeroConti);

	}

}
