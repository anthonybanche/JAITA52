package Model;

public class Divisione extends Operazione implements Interfaccia{

	public Divisione(float operatore1, float operatore2) {
		super(operatore1, operatore2);
		
	
		
	}
	
public float getRisultato() {
	    
	 return getOp1()/getOp2();
	
}


}