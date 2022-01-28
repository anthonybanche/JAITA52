package view;

import java.util.Scanner;

import control.operazioneCTRL;
import eccezioni.CalcolatriceException;

public class CalcolatriceView {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		operazioneCTRL operazioneCTRL = new operazioneCTRL();
		operazioneCTRL.init();

		boolean cicla = false;
		do {
			System.out.print("Digita una scelta : ");
			System.out.println();
			System.out.println("1) Utilizza la Calcolatrice");
			System.out.println("2) Esci");
			int sceltaUtente = in.nextInt();
			if (sceltaUtente == 1) {
				System.out.print("Inserire primo numero : \n");
				double operando1 = nextDouble(in);
				System.out.println("Inserisci operatore :");
				char operatore = nextChar(in);
				System.out.print("Inserire secondo numero : \n");
				double operando2 = nextDouble(in);

				try {
					System.out.println(operazioneCTRL.calcolo(operando1, operando2, operatore));
				} catch (CalcolatriceException e) {
					e.printStackTrace();
					break;
				}
			}if (sceltaUtente == 2) {
				break;
			}
		}while (!cicla);
	}

	public static double nextDouble(Scanner in) {
		while (!in.hasNextDouble()) {
			in.next();
			System.out.print("Inserisci un numero intero oppure un numero decimale \n");
		}
		return in.nextDouble();
	}

	public static char nextChar(Scanner in) {
		char result = in.next().charAt(0);
		boolean exit = false;
		while (!exit) {
			switch (result) {
			case '+':
				return result;
			case '-':
				return result;
			case '/':
				return result;
			case '*':
				return result;
			default:
				System.out.print("Inserisci un operatore valido ( + - * / )\n");
				result = in.next().charAt(0);
			}

		}
		return result;
	}

}