package view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import controller.CalcolatriceCtrl;
import model.VerificaInput;

public class CalcolatriceView {

	public static void main(String[] args) {
		
		List<VerificaInput> validati = new ArrayList<>();
		
		try {
			validati = controlloOperatore();//poi prova con un .add se cosi non funziona
			//per fare un eccezzione personalizzata fai una classe con estensio throws exception
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		CalcolatriceCtrl calcolatrice = new CalcolatriceCtrl();
		
		try {
			calcolatrice.setOperator(validati);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		calcolatrice.calcolare();
		
		calcolatrice.getStorico(validati);
		
		
		calcolatrice.getRisultati();
		
		
		
		
	}
	
	private static List<VerificaInput> controlloOperatore() throws IllegalArgumentException {
		
		List<VerificaInput> verValidita = new ArrayList<>();
		
		String operazione;
		double variabile1;
		double variabile2;
		
		Scanner sc = new Scanner(System.in);
	
		
		do {
			//List<VerificaInput> verValidita = new ArrayList<>();
			System.out.println("Inserire tipo di operazione: ");
			System.out.println("+ - * /");
			operazione = sc.nextLine();
			
			VerificaInput input = new VerificaInput();
			input.setOperatore(operazione);
			
			
			switch (operazione.toLowerCase()) {
			case "+":
				System.out.println("inserire variabile 1");
				try {
					variabile1 = sc.nextDouble();
					sc.nextLine();
					input.setVariabile1(variabile1);	
					
					System.out.println("inserire variabile 2");
					variabile2 = sc.nextDouble();
					sc.nextLine();
					input.setVariabile2(variabile2);
				} catch (InputMismatchException e) {
					System.out.println("Attenzione! NaN inserito");
					continue;
				}
				break;
			case "-":
				System.out.println("inserire variabile 1");
				try {
					variabile1 = sc.nextDouble();
					sc.nextLine();
					input.setVariabile1(variabile1);	
					
					System.out.println("inserire variabile 2");
					variabile2 = sc.nextDouble();
					sc.nextLine();
					input.setVariabile2(variabile2);
				} catch (InputMismatchException e) {
					System.out.println("Attenzione! NaN inserito");
					continue;
				}
				break;
			case "*": 
				System.out.println("inserire variabile 1");
				try {
					variabile1 = sc.nextDouble();
					sc.nextLine();
					input.setVariabile1(variabile1);	
					
					System.out.println("inserire variabile 2");
					variabile2 = sc.nextDouble();
					sc.nextLine();
					input.setVariabile2(variabile2);
				} catch (InputMismatchException e) {
					System.out.println("Attenzione! NaN inserito");
					continue;
				}
				break;
				
			case "/": 
				System.out.println("inserire variabile 1");
				try {
					variabile1 = sc.nextDouble();
					sc.nextLine();
					input.setVariabile1(variabile1);	
						
					System.out.println("inserire variabile 2");
					variabile2 = sc.nextDouble();
					sc.nextLine();
					if(variabile2 != 0) {
						input.setVariabile2(variabile2);
					}else {
						throw new NumberFormatException("Cannot divide by zero");
					}
				} catch (InputMismatchException e) {
					System.out.println("Attenzione! NaN inserito");
					continue;
				}
				break;
				
			default:
				if(operazione.equals("")) {
					break;
				}else {
				throw new IllegalArgumentException("Tipo di operatore non riconosciuto");
				}
			}
			verValidita.add(input);
		} while (!operazione.isEmpty());
		
		
		return verValidita;
	
	}

}
