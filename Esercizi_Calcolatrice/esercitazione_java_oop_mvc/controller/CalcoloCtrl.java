package controller;

import java.util.Scanner;

import model.CalcolatriceException;
import model.Divisione;
import model.Moltiplicazione;
import model.Somma;
import model.Sottrazione;

public class CalcoloCtrl {

	public CalcoloCtrl() {
	}

	public void eseguiCalcoloCtrl(double operatore1, double operatore2, String oper) throws CalcolatriceException {


		switch(oper) {

		case "+":
			Somma risultatoSo = new Somma(operatore1, operatore2);
			System.out.println(risultatoSo.esOper());
			break;
		case "-":
			Sottrazione risultatoSott = new Sottrazione(operatore1, operatore2);
			System.out.println(risultatoSott.esOper());
			break;
		case "*":
			Moltiplicazione risultatoMol = new Moltiplicazione(operatore1, operatore2);
			System.out.println(risultatoMol.esOper());
			break;
		case "/":
			Divisione risultatoDivi = new Divisione(operatore1, operatore2);
			System.out.println(risultatoDivi.esOper());
			break;
		default:
			//System.out.println("Ritenta!");
			throw new CalcolatriceException(oper);

		}
	}
}
























/*private List<OperazioneCalcolo> operazioni;

	public OperazioniCtrl() {
		this.operazioni = new ArrayList<OperazioneCalcolo>();	
	}

	public void addOperazioneCalcolo(int x, int y, int ris) {
		OperazioneCalcolo c = new OperazioneCalcolo(x, y, ris);
		this.operazioni.add(c);
		System.out.println("Operazione aggiunta!" + c);
	}

	public List<OperazioneCalcolo> getOperazioni() {
		return operazioni;
	}

	public void setOperazioni(List<OperazioneCalcolo> operazioni) {
		this.operazioni = operazioni;
	}

}
 */
