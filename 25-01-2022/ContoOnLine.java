
public class ContoOnLine extends ContoCorrente {

	private double maxPrelievo;

	ContoOnLine(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		maxPrelievo = maxP;
	}

	void stampaSaldo() {
		System.out.println("Il conto e' del titolare: " + titolare + " il cui saldo e': " + saldo);
	}

	void preleva(double x) throws BancaException {
		if (x < maxPrelievo) {
			super.preleva(x);
		} else {
			throw new BancaException("il prelievo non e’ disponibile"); 
		}
	}

}
