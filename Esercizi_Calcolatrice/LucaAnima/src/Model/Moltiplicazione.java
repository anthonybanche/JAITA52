package Model;

public class Moltiplicazione extends Operazione implements Interfaccia{

	public Moltiplicazione(float operatore1, float operatore2) {
		super(operatore1, operatore2);
		
	
		
	}
	
public float getRisultato() {
	    
	 return getOp1()*getOp2();
	
}


}