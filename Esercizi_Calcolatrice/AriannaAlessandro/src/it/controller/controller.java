package it.controller;

import java.util.Scanner;

import it.model.Divisione;
import it.model.Moltiplicazione;
import it.model.Somma;
import it.model.Sottrazione;

public class controller {
	Scanner sc =new Scanner(System.in);
	float risultato;
		 
		public float calc(String tipoOperazione, float op1, float op2) throws calcolatriceException {
			
			switch(tipoOperazione.toUpperCase()) {
			
			case "SOMMA": 
							
							Somma s= new Somma(op1,op2);
							risultato= s.calcolo();
							
							break;
							
			case "SOTTRAZIONE":
							
							Sottrazione sot= new Sottrazione(op1,op2);
							risultato= sot.calcolo();
							
							break;
							
			case "MOLTIPLICAZIONE":
							
							Moltiplicazione m= new Moltiplicazione(op1,op2);
							risultato= m.calcolo();
							
							break;
				
			case "DIVISIONE":
							
							Divisione d= new Divisione(op1,op2);
							if (op2!=0) {risultato = d.calcolo();}
							else throw new calcolatriceException ("non si può dividere per 0");
							
							break;
							
							
			default : throw new calcolatriceException ("operazione sbagliata");
			}
			return risultato;
			
		}
	}
	


