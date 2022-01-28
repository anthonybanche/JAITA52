package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.calcController;
import controller.calcException;

public class CalcolatriceView {

	public static void main(String[] args){

		float r = 0f;
		float op1 = 0f;
		float op2 = 0f;
		boolean ciclo = true;

		calcController c = new calcController();

		Scanner s = new Scanner(System.in);

		while(ciclo) {

			System.out.println("Indicare operazione");

			String scelta= s.nextLine();
			if (scelta.isEmpty()) {
				ciclo = false;
			}else {
				
				try{

					operCheck(scelta);
					op1= numcheck(s);
					op2= numcheck(s);
					r = c.operazione(op1, op2, scelta); // non so se � il miglior modo, ho avuto un vuoto di memoria
					System.out.println("Il risultato � :"+ r );

				}catch(calcException ce){
					ce.printStackTrace();
				}

			}
		}

	}

	public static String operCheck(String scelta) throws calcException{

		scelta = scelta.trim();

		scelta = scelta.toLowerCase();

		if (scelta.equals("somma") || scelta.equals("sottrazione") || scelta.equals("moltiplicazione") || scelta.equals("divisione") ) {

		}else {
			throw new calcException ("Operazione non supportata");
		}
		
		return scelta;

	}

	public static float numcheck(Scanner s) throws calcException {
		
		
		System.out.println("Inserire operatore");	
		String sop1 = s.nextLine();

		try{
			return Float.parseFloat(sop1);
		}catch(NumberFormatException nf){
			throw new calcException ("Non è stato inserito un numero");
		}		
		
	}

}
