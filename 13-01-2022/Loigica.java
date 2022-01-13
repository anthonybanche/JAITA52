package it.javaita54.operatorilogici;

public class Loigica {
	
	public static void main(String[] args) {
		//AND 	&&
		//OR  		|| 
		//NOT  			!
		
		//Si usano per scrivere le condizioni
		//Per valorizzare dei boolean, per cicli e IF
		
		int p1eta=25;
		String p1citta=""; //Comparatore per le Stringhe
		
		
		if(p1eta<20 || !p1citta.equals("Torino")) {
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}
		
		if(!p1citta.equals("Torino")) {
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}
		
		int es2eta=25;
		int es2etaLimite=25;
		if(es2eta!=es2etaLimite) {
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}

		//Operatore Ternario
		int saldoBanca=100;
		int sogliaRicchezza=1000000;
		
		//CON TERNARIO
		String statoCliente=(saldoBanca>=sogliaRicchezza ? "Ricco" : "Normale");
		
		//SENZA TERNARIO
		String statoCliente2;
		if(saldoBanca>=sogliaRicchezza) {
			statoCliente2="Ricco";
		}else {
			statoCliente2="Normale";
		}
		
		System.out.println(statoCliente);
		
		
		
		// int risultato = (condizione ? val_vero : val_falso) 
		
		
		
		
		
		
	}
}
