
public class Pacco {
	
	double base, altezza, profondita;
	int numero;

	public Pacco(double base, double altezza, double profondita) {
		this.base = base;
		this.altezza = altezza;
		this.profondita = profondita;
	}

	void setNumero(int x) {
		numero = x;
	}

	double volume() {
		return (base * altezza * profondita);
	}
}
