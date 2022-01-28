
package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import controllers.CalcolatriceController;
import exceptions.CalcolatriceException;


public class CalcolatriceView{
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		 double op1=inputNumero();
		 double op2=inputNumero();
		 String operazione=inputOperazione();
		 CalcolatriceController calcolatriceController = new CalcolatriceController(op1, op2, operazione);
		 double risultato = calcolatriceController.eseguiOperazione();
		 printOperazione(op1, op2, risultato, operazione);
		
	}
	
	public static double inputNumero() {
		double numero = 0; 
		System.out.println("Inserire un numero ");
		try {
			numero = scan.nextDouble();
			
		}
		catch(InputMismatchException e) {
			System.out.println("Il numero non è valido!");
			e.printStackTrace();
			System.exit(1);
		}
		
		return numero;
	}
	
	public static String inputOperazione() {
		String operazione = "";
		System.out.println("Inserire il simbolo dell'operazione ");
		try {
			operazione = scan.next();
			if(!operazione.equals("+") && !operazione.equals("-") && !operazione.equals("*") && !operazione.equals("/"))
				throw new CalcolatriceException();
		}
		catch(CalcolatriceException e){
			System.out.println("Il simbolo non è valido!");
			e.printStackTrace();
			System.exit(1);
		}
		
		return operazione;
		
	}
	
	public static void printOperazione(double op1, double op2, double risultato, String operazione) {
		System.out.println("Operazione: " +op1+ " " +operazione+ " " +op2+ " = " +risultato);
	}
	
	
}