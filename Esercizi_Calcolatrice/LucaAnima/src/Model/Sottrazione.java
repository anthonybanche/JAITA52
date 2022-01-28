package Model;

public class Sottrazione extends Operazione implements Interfaccia{

	public Sottrazione(float operatore1, float operatore2) {
		super(operatore1, operatore2);
	}
	
public float getRisultato() {
	    
	 return getOp1()-getOp2();
	
}


}