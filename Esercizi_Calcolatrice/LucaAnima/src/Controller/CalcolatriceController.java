package Controller;

import Model.CalcolatriceException;
import Model.Divisione;
import Model.Interfaccia;
import Model.Moltiplicazione;
import Model.Somma;
import Model.Sottrazione;


public class CalcolatriceController {
	
	private float op1;
	private float op2;
	String operazione;
	
public CalcolatriceController(String operazione, float operatore1, float operatore2) {
	
	op1=operatore1;
	op2=operatore2;
	operazione=operazione;

		
}


public float getRisultato(){

	Interfaccia calcolo=new Somma(0, 0);

	switch(operazione) {
			 
		case "+":
		   calcolo= new Somma(op1, op2);
			break;
		   
		case "-":
			calcolo= new Sottrazione(op1, op2);
			break;
			
		case "*":
		calcolo= new Moltiplicazione(op1, op2);
			break;
		case "/":
			if(op2==0) {
				throw new CalcolatriceException ("Impossibile dividere per zero");
			}
			calcolo= new Divisione(op1, op2);
			break;
			
		default: throw new CalcolatriceException ("Non � stata inserita un'operazione gestita");
		}

		return calcolo.getRisultato();

}

	public float getSomma() {
    	Somma num = new Somma(op1, op2); 
    	float somma = num.calcoloSomma();
		return somma;
		
	}
	
	public float getSottrazione() {
		Sottrazione num = new Sottrazione(op1, op2); 
    	float sottrazione = num.calcoloSottrazione();
		return sottrazione;
		
	}
	
	public float getMoltiplicazione() {
		Moltiplicazione num = new Moltiplicazione(op1, op2); 
    	float moltiplicazione = num.calcoloMoltiplicazione();
		return moltiplicazione;
		
	}
	
	public float getDivisione() {
		Divisione num = new Divisione(op1, op2); 
    	float divisione = num.calcoloDivisione();
		return divisione;
		
	}
}
