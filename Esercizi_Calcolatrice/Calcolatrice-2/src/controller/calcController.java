package controller;



import model.divisione;
import model.moltiplicazione;
import model.somma;
import model.sottrazione;



public class calcController {

	public float operazione(float op1, float op2, String scelta) {

		float ris= 0;

		switch (scelta.toUpperCase()) {

		case "SOMMA":

			somma sum = new somma();

			sum.calcolo(op1, op2);

			ris = sum.getRisultato();
			break;

		case "SOTTRAZIONE":

			sottrazione sot = new sottrazione();

			sot.calcolo(op1, op2);

			ris = sot.getRisultato();
			break;

		case "MOLTIPLICAZIONE":

			moltiplicazione mul = new moltiplicazione();

			mul.calcolo(op1, op2);

			ris = mul.getRisultato();

			break;

		case "DIVISIONE":

			divisione div = new divisione();

			div.calcolo(op1, op2);

			ris = div.getRisultato();
			break;
		}
		
		return ris;
	}

}




