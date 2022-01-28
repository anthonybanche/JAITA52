package controller;

import model.Calcolo;
import model.Divisione;
import model.Moltiplicazione;
import model.Somma;
import model.Sottrazione;

public class Controller {

    public double faiCalcolo(String comando, double op1, double op2){
        
    Calcolo interf;

	switch(comando) {
	case "+":
	interf= new Somma(op1, op2);
		break;
	case "-":
	interf = new Sottrazione(op1,op2);
		break;
	case "*":
	interf= new Moltiplicazione(op1, op2);
		break;
	case "/":
		interf= new Divisione(op1, op2);
		break;
    default:
        throw new Exception("");
	}
	return interf.FaiOperazione();
    }
    
}
