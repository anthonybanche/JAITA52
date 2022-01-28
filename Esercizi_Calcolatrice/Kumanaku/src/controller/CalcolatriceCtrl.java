package controller;

import java.util.ArrayList;
import java.util.List;

import model.Calcolo;
import model.Divisione;
import model.Moltiplicazione;
import model.Somma;
import model.Sottrazione;
import model.VerificaInput;

public class CalcolatriceCtrl {
	
	List<Calcolo> calcoli;
	List<String> input;
	
	public CalcolatriceCtrl(){
		this.calcoli = new ArrayList<>();
	}
	
	public void setOperator(List<VerificaInput> input) throws Exception {
		
		for(int i = 0; i < input.size();i++) {
			VerificaInput user = input.get(i);
			
			switch (user.getOperazione().toLowerCase()) {
			case "+":
				Somma somma = new Somma(user.getVariabile1(),user.getVariabile2());
				calcoli.add(somma);
				break;
			case "-":
				Sottrazione sottrazione = new Sottrazione(user.getVariabile1(), user.getVariabile2());
				calcoli.add(sottrazione);
				break;
			case "*":
				Moltiplicazione moltiplicazione = new Moltiplicazione(user.getVariabile1(), user.getVariabile2());
				calcoli.add(moltiplicazione);
				break;
			case "/":
				if(user.getVariabile2() != 0) {
					Divisione divisione = new Divisione(user.getVariabile1(), user.getVariabile2());
					
					calcoli.add(divisione);
				}else {
					throw new NumberFormatException("Cannot divide by zero");
				}
				break;	
			default:
				if(user.getOperazione().equals("")) {
					break;
				}else {
				throw new IllegalArgumentException("Unexpected value: ");
				}
			}
		}
		
		
			
	}
		
	public void calcolare() {
		input = new ArrayList<String>();
		
		for(int i=0; i<calcoli.size(); i++) {
			Calcolo calcolo = calcoli.get(i);
			double risul = calcolo.operazione();
			String operatore = calcolo.getClass().getSimpleName();
			input.add("Risultato della " + operatore +" = " + risul);
		}
	}
	
	public void getRisultati(){
		for (Object o : input) {
			System.out.println(o);
		}
	}
	
	public  void getStorico(List<VerificaInput> o){
		int b = 1;
		for (int i = 0; i<calcoli.size();i++) {
			VerificaInput user = o.get(i);
			System.out.println("Operazione numero " + b + " : " +user.getVariabile1()+ " " + user.getOperazione()+" "+user.getVariabile2());
			b++;
		}

	}
	
	
	
	
	
}
