package view;

import java.util.Scanner;

import controller.CalcolatriceCtrl;
import exceptions.CalcolatriceException;
import exceptions.CalcolatriceSecEZException;

public class CalcolatriceView {
	
	static CalcolatriceCtrl ctrl = new CalcolatriceCtrl();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		String choose = "";
		boolean controllo = false;
		
		System.out.println("Benvenuto nel sistema di calcolo.");
		
		do {
			
			System.out.println("La preghiamo di scegliere fra le seguenti operazioni:");
			System.out.println("(1) Eseguire un operazione");
			System.out.println("(2) Rivedere lista operazioni effettuate fino ad adesso");
			System.out.println("(exit o premere solamente invio) Chisura del programma");
			choose = sc.nextLine();
			
			switch(choose.toLowerCase().trim()) {
				
			case "1":
				eseguiCalcolo();
				break;
			
			case "2":
				listaOperazioni();
				break;
				
			case "exit", "":
				controllo = true;
				break;
			
			default:
				System.out.println("Scelta non valida.");
				break;
			}
		
		} while (controllo == false);
		
		System.out.println("Sistema in chiusura. Lista operazioni effettuate:");
		listaOperazioni();
	}
	
	public static void eseguiCalcolo() {
		
		try {
			System.out.println("Inserisca primo operando:");
			double operando1 = Double.parseDouble(sc.nextLine());
		
			System.out.println("Inserisca secondo operando:");
			double operando2 = Double.parseDouble(sc.nextLine());
		
			System.out.println("Inserisca l'operazione da eseguire fra 'addizione' o +, 'sottrazione' o -,"
				+ " 'moltiplicazione' o * e 'divisione' o / :");
			String choose = sc.nextLine();
			System.out.println(ctrl.esecuzione(choose, operando1, operando2));
		} catch (NumberFormatException e) { //Eccezione standard con messaggio impostato in catch
			System.out.println("Operando non valido.");
		} catch (CalcolatriceException e) { //Eccezione custom con messaggio impostato nella classe
			System.out.println(e);
		} catch (CalcolatriceSecEZException e) { //Seconda eccezione custom per controllare eventuali forme di indeterminazione
			System.out.println(e);
		}
	}
	
	public static void listaOperazioni() {
		for (String operazione: ctrl.getListaOperazioni()) {
			System.out.println(operazione);
		}
	}
}
