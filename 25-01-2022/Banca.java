
public class Banca {

	public static void main(String args[]) {

		ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

		try {
			conto1.preleva(1750.5);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(conto1.restituisciSaldo());
		ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);
		conto2.stampaSaldo();
		try {
			conto2.preleva(2000);
		} catch (BancaException e) {
			System.out.println("Eccezione di tipo BancaException");
			System.out.println("Il messaggio della mia eccezione è: " + e.getMessaggio());
		}
		
	}

}
