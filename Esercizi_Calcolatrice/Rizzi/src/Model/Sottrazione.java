package Model;

public class Sottrazione {

	Double op1;
	Double op2;
	
public Sottrazione(double io1, double op2) {
	super();
	this.op1 = op1;
	this.op2 = op2;
	}

public double getSottrazione() {
	double risposta=(op1-op2);
	return risposta;
	}

public char[] FaiOperazione() {
	return null;
}

}

