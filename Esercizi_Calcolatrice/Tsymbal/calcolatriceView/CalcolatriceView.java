package calcolatriceView;

import java.util.Scanner;

import controller.Controller;
import model.CalcolatriceException;
import model.Divisione;
import model.Moltiplicazione;
import model.Somma;
import model.Sottrazione;

public class CalcolatriceView {

	public static void main(String[] args) {
		
		Controller ctr=new Controller();
		
		Scanner sc = new Scanner(System.in);
		double op1, op2;
		String op;
		
		try {
		System.out.println("Scrivi il primo numero");
		op1=sc.nextDouble();
		sc.nextLine();
	
		System.out.println("Scrivi il secondo numero");
		op2=sc.nextDouble();
		sc.nextLine();
		

		System.out.println("Scrivi l'operazione da eseguire");
		op=sc.nextLine();
		
        
		
			ctr.Calcolo(op1, op2, op);
		} catch (CalcolatriceException e) {

			e.printStackTrace();
		}
   
	}
}
