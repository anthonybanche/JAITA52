package Model;

public class Somma extends Operazione implements Interfaccia{

	public Somma(float operatore1, float operatore2) {
		super(operatore1, operatore2);
		
	
		
	}
	
public float getRisultato() {
	    
	 return getOp1()+getOp2();
	
}


}
