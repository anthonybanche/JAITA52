package it.view;

import java.util.Scanner;

import it.controller.controller;


public class MainView {
	
	
	public static void main(String[] args) throws Exception {
		
		String tipoOperazione;
		float op1;
		float op2;
		controller c = new controller();
	
		
		Scanner sc= new Scanner(System.in);
		
		do {
			
			System.out.println("Inserire operazione: ");
			tipoOperazione= sc.nextLine();
			if(tipoOperazione!= "") {
			try {
			System.out.println("inserire operatore 1: ");
			op1= Float.parseFloat(sc.nextLine());
			System.out.println("inserire operatore 2: ");
			op2 =Float.parseFloat(sc.nextLine());
			System.out.println(c.calc(tipoOperazione, op1, op2));}
			catch (java.util.InputMismatchException e){
	            System.out.println("Operatore sbagliato");
			}
	        }else System.out.println("Non hai inserito nulla");
		
		}while(!tipoOperazione.isEmpty());
		
		

	}

}
