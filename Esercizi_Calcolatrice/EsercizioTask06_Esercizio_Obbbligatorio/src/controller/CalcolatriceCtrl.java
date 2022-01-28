package controller;

import java.util.ArrayList;
import java.util.List;

import model.Calcolo;
import model.Divisione;
import model.Moltiplicazione;
import model.Operazione;
import model.Somma;
import model.Sottrazione;

public class CalcolatriceCtrl{

	List<String> listaOperazioniFatte = new ArrayList<>();
	
	public CalcolatriceCtrl() {
		
	}
	
	double op1;
	double op2;
	
	

		
	
	public void controlloOperatore1(String risposta) {
		
		op1 = Double.parseDouble(risposta);
		
	}
	
	public void controlloOperatore2(String risposta) {
		
			
		op2 = Double.parseDouble(risposta);
			
	}
	
	
	public double controlloOperazione(String risposta) {

		Calcolo cal=new Somma();

		switch(risposta){
			case "+":
			cal=new Somma();
			break;
			case "-":
			cal=new Sottrazione();
			break;
			case "*":
			cal=new Moltiplicazione();
			break;
			case "/":
			cal=new Divisione();
			break;
		}

		double risultato = cal.calcolo(op1, op2);
		listaOperazioniFatte.add(cal.getReport());
		return risultato;

	}





	public String riepilogo() {
		String output="";
		System.out.println("Fine Operazioni");
		for (String s : listaOperazioniFatte) {
			output+=s+"\n";
		}
		return output;
	}

}
