package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import control.MiaEccezione;
import control.calcolatricectrl;

public class Calcolatrice {
	public static void main(String args[]) throws MiaEccezione {

		Scanner sc = new Scanner(System.in);
		System.out.println("Scegli un'operazione ");
		System.out.println("( + ) per la somma");
		System.out.println("");
		System.out.println("( - ) per la differenza ");
		System.out.println("");
		System.out.println("( * ) per la moltiplicazione");
		System.out.println("");
		System.out.println("( / ) per la divisione ");
		System.out.println("");
		String opr = sc.nextLine();

		System.out.println("Inserire primo numero: ");
		double op1 = sc.nextDouble();
		System.out.println("Inserire secondo numero: ");
		double op2 = sc.nextDouble();


		
		calcolatricectrl CALC = new calcolatricectrl();

		try {
			System.out.println(CALC.ImpostaOperazione(opr, op1, op2));
		} catch (InputMismatchException e) {
			System.out.println("Non � un numero");

		}catch (MiaEccezione e) {
			System.out.println("ERRORE");
		}
	}
}
