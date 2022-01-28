package View;

import java.util.Scanner;

import Controller.CalcolatriceController;
import Model.CalcolatriceException;
import Model.Operazione;



public class CalcolatriceView {

	public static void main(String[] args) throws Exception {
	
	Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Inserisci l'operazione da effettuare");
		String operazione= scanner.nextLine(); 
		
		
		System.out.println("Inserisci il primo operatore");
		float operatore1= scanner.nextFloat(); 
		
		
		
		System.out.println("Inserisci il secondo operatore");
		float operatore2= scanner.nextFloat(); 
		
		CalcolatriceController ris= new CalcolatriceController(operazione, operatore1, operatore2); //Prendo i dati da CalcolatriceController
		
		try{
			System.out.println(ris.getRisultato());
	 
		}catch(CalcolatriceException ce){
			ce.printStackTrace();
		}
        
	 
			

		
	}
}

