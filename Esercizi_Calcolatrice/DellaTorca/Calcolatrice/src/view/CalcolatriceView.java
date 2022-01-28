package view;

import java.util.Scanner;

import controller.CalcolatriceCtrl;
import exceptions.CalcolatriceException;

public class CalcolatriceView {
	static double operatore1;
	static double operatore2;
	static double risultato = 0;
	/* scanner per input user */
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		start();

	}

	public static void start() {
		/* loop per continuare a ricevere input */
		boolean programma = true;
		while (programma) {
			try {
				inputOperatore();
			} catch (Exception e) {
				System.out.println("Non hai inserito un numero, riprova");
				start();
			}
			System.out.println("Che operazione vuoi eseguire? (digitare il numero)");
			System.out.println("1 - Addizione");
			System.out.println("2 - Sottrazione");
			System.out.println("3 - Moltiplicazione");
			System.out.println("4 - Divisione");
			String operazione = readInput("");
			switch (operazione) {
			case "1":
				CalcolatriceCtrl.addAdd(operatore1, operatore2, risultato);
				break;

			case "2":
				CalcolatriceCtrl.addSub(operatore1, operatore2, risultato);
				break;

			case "3":
				CalcolatriceCtrl.addMul(operatore1, operatore2, risultato);
				break;

			case "4":
				CalcolatriceCtrl.addDiv(operatore1, operatore2, risultato);
				break;
			}

		}
	}

	public static void inputOperatore() throws CalcolatriceException {
		
		System.out.println("Inserisci il primo operatore");
		if (CalcolatriceCtrl.log.size() > 0) {
			System.out.println("[lasciare vuoto per concludere e vedere il log]");
			}
		String str1 = readInput("");
		if (str1.equals("")) {resoconto();}
		operatore1 = Double.parseDouble(str1);
		System.out.println("Inserisci il secondo operatore");
		String str2 = readInput(""); 
		operatore2 = Double.parseDouble(str2);

	}
	
	public static void resoconto() {
		System.out.println("Hai eseguito " + CalcolatriceCtrl.log.size() + " operazioni.");
		for(int i=0;i<CalcolatriceCtrl.log.size();i++){
		    System.out.println(i+")  "+CalcolatriceCtrl.log.get(i));
		} 
		System.exit(0);
		
	}

	public static String readInput(String operazione) {
		System.out.println(operazione +"");
		return scan.nextLine(); 
	}

}
