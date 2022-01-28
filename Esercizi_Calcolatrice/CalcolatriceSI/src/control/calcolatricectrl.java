package control;

import java.util.Scanner;

import model.Somma;
import model.Valori;
import model.Calcolo;
import model.Differenza;
import model.Moltiplicazione;
import model.Divisione;

public class calcolatricectrl {

	public double ImpostaOperazione(String opr, double op1, double op2) throws MiaEccezione {
		
		Calcolo opera=new Somma(0, 0);
		if (opr.equals("+") || opr.equals("-") || opr.equals("*") || opr.equals("/")) {
			switch (opr) {
			case "+":
				opera = new Somma(op1, op2);
				break;
			case "-":
				opera = new Differenza(op1, op2);
				break;
			case "*":
				opera = new Moltiplicazione(op1, op2);
				break;
			case "/":
				if (op2 == 0) {
					throw new MiaEccezione("Hai diviso per 0, non va beeene");
				} else {
					opera = new Moltiplicazione(op1, op2);
				break;
				}
			}

			return opera.faiCalcolo();

		} else if (opr.equals("stop")) {
			throw new MiaEccezione("Terminato");
		} else {
			throw new MiaEccezione("Non hai inserito operatore");
		}
	}
}

//	public double PrendiNumero1() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Inserire primo numero: ");
//		double op1 = sc.nextDouble();
//		return (op1);
//	}}
//				Vorrei implementarlo, ma non so perch� non riesco, 
//				eppure mi sembra una cosa veramente semplice
//				Se vado a inserire un PrendiNumeroX il risultato va a 0.0;
//
//	public double PrendiNumero2() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Inserire secondo numero: ");
//		double op2 = sc.nextDouble();
//		return (op2);
//	}
