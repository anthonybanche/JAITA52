
public class PaccoAColori extends Pacco {

	String colore;

	public PaccoAColori(double base, double altezza, double profondita) {
		super(base, altezza, profondita);
	}

	void setColore(String c) {
		colore = c;
	}

	void stampa() {
		System.out.println("altezza" + altezza + "larghezza" + base + "profondità" + profondita + "colore" + colore);
	}

	void stampaVolume() {
		double x = volume();
		System.out.println("il volume" + x);
	}

}
