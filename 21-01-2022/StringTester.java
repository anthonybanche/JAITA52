package it.jaita54.stringhe;

public class StringTester {

	public static void main(String[] args) {
		//Bibliografia -> https://www.html.it/pag/50644/stringhe-in-java/
		
		String nome;       			//Dichiarazione
		nome = "Luca";     			//Assegnazione (set)
		System.out.println(nome); 	//Accesso (get)
		
		//SE NON DIVERSAMENTE SPECIFICATO E' TUTTO CASE SENSITIVE
		
		/*
		 * Considerando la stringa come Array di caratteri 
		 * ci pernette di prendere quello in una determinata posizione
		 * 
		 * Utilizzando charAt in un ciclo posso scansionare la mia stringa
		 *  alla ricerca di caratteri specifici
		 */
		char a=nome.charAt(0);
		System.out.println(a);
		
		/*
		 * Operatore di comparazione tra stringhe
		 * In java non posso confrontare stringhe con ==
		 * ES: Verifico se il contenuto della stringa nome è Marco
		 */
		boolean b=nome.equals("Marco");
		boolean e=nome.equalsIgnoreCase("MARCO");  //versione case insentive
		
		/*
		 * Equivalente all'uso del +
		 * Concatena alla stringa su cui viene chiamato la stringa passata a parametro
		 */
		String x= nome.concat(" Rossi");
		System.out.println(x);
		
		/*
		 * Serve per verificare se una stringa contiene un carattere o una sottostringa
		 */
		boolean c=nome.contains("L");
		boolean d=nome.contains("Luc");
		//Esiste anche la variante che mi dice in che indice si trova il carattere o la sottostringa
		int f=nome.indexOf("L");
		int g=nome.indexOf("Lu");
		
		/*
		 * I modificatori di casing
		 */
		String minuscola=nome.toLowerCase();
		System.out.println(minuscola);
		String maiuscola=nome.toUpperCase();
		System.out.println(maiuscola);
		
		
		/*
		 * Rimozione di spazi
		 */
		String cognome = " Dei Campi  ";
		System.out.println(cognome.trim());
		
	
		/*
		 * Sottostringhe
		 */
		String nomeCompleto="Luca Dei Campi";
		int indiceDelloSpazio=nomeCompleto.indexOf(" ");
		String soloNome=nomeCompleto.substring(0, indiceDelloSpazio);
		System.out.println(soloNome);
		
		int indiceUltimoSpazio=nomeCompleto.lastIndexOf(" ");
		int lunghezzaStringa=nomeCompleto.length();
		String soloUltimoCognome=nomeCompleto.substring(indiceUltimoSpazio, lunghezzaStringa);
		System.out.println(soloUltimoCognome);
		
		
		/*
		 * Replace
		 */
		String testo="Te$t $empre!";
		testo=testo.replace("$", "s"); //Se non ci sono non li sostituisce
		System.out.println(testo);
		
		//Anche per sottostringhe e per caratteri speciali
		//   /n -> carattere speciale per anadare a capo in una stringa
		String aCapo="Ciao \n Come \n Stai";
		//Volendo è combinabile
		aCapo=aCapo.replace("\n", "").replace("Ciao", "Hello");
		System.out.println(aCapo);
		
	
	}

}
