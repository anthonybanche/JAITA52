package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.CalcolatriceCtrl;
import controller.CalcolatriceException;
import model.Operazione;
import model.Somma;

public class CalcolatriceView {

	public static void main(String[] args)   {

		Scanner scan = new Scanner(System.in);

		CalcolatriceCtrl c = new CalcolatriceCtrl();
		double oper1 = 1;
		double oper2 = 1;
		String operazione = " ";
		List<String> operazioni = new ArrayList<>();

		System.out.println("Benvenuto nella calcolatrice");
		while(operazione != "") {

			
			try {
				System.out.println("Inserisci il primo numero");
				System.out.println("Oppure premi invio per accedere allo storico operazioni:");
				oper1 = Double.parseDouble(scan.nextLine());
				System.out.println("Inserisci il secondo numero:");
				oper2 = Double.parseDouble(scan.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("Numero non valido");
				e.getStackTrace();
				
			}


			System.out.println("Inserisci l'operazione da effettuare tra somma, divisione, sottrazione e moltiplicazione:");
			System.out.println("Digitare ritorno per riiniziare il processo di inserimento");
			System.out.println("Oppure premere invio per accedere allo storico operazioni");
			operazione = scan.nextLine().toUpperCase();



			switch(operazione) {

			case "SOMMA":
				c.calcoloSomma(oper1, oper2);
				
				break;

			case "SOTTRAZIONE":
				c.calcoloSottrazione(oper1, oper2);
				
				break;

			case "MOLTIPLICAZIONE":
				c.calcoloMoltiplicazione(oper1, oper2);
				
				break;

			case "DIVISIONE":
				try {
					c.calcoloDivisione(oper1, oper2);
				} catch (CalcolatriceException e) {
					System.out.println("Impossibile dividere per 0, il secondo numero deve essere diverso da 0");
				}
				
				break;

			case "RITORNO":
				break;

			case "":
				operazione.equals("");
				break;

			default:
				System.out.println("input non valido rinserire da capo");
			}




		}
		operazioni = c.getOperazioni();
		for (String s : operazioni) {
			System.out.println(s);
		}

	}

}







