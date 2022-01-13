
public class Stringhe {

	public static void main(String[] args) {
				  //012
		String s = "ABC";
		String c = new String("A1B2C3");
		
		int a = 1;
		char character = 'c';
		
		if(s == c) {
			System.out.println("Vero");
		} else {
			System.out.println("Falso");
		}
		
		if(s.equals(c)) {
			System.out.println("Vero");
		} else {
			System.out.println("Falso");
		}
		
											  //012345
		for(int i = 0; i < s.length(); i++) { //ABCYTR
			System.out.println(s.charAt(i));
		}
		// STESSA COSA
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		
		
		for(int i = 0; i < c.length(); i++) { //A1B2C3
			if(c.charAt(i) == '2') {
				System.out.println("Confermato");
			}
		}
		
		
		s = s.concat("YTR");
		System.out.println(s);
		
		c = c.substring(3); //A1B2C3
		System.out.println(c);
		
		// Indice di partenza = 0 < 3
		s = s.substring(0,3);
		System.out.println("Primo substring: " + s);
		// Indice di partenza e di fine
		s = s.substring(0,2);
		System.out.println("Secondo substring: " + s);
		
		
		String utente = "rossi";
		utente = utente.toUpperCase();
		utente = utente.toLowerCase();
		if(utente.equals("ROSSI")) {
			// 
		} else if(utente.equals("rossi")) {
			//
		}
		
		if(utente.equalsIgnoreCase("RoSsI")) {
			System.out.println("Uguali lo stesso (maiuscole e minuscole)");
		}
		
		String numero = String.valueOf(1);
		int casoDiTest = 10;
		numero = numero.concat(String.valueOf(casoDiTest));
		System.out.println("Valore variabile numero: " + numero);
		
		
		StringBuilder stb = new StringBuilder("AAAAAA ");
		stb.append("Ciao");
		System.out.println(stb);
		System.out.println(stb.toString());
		
		
		String daPulire = "  ciao, mi chiamo Gino   ";
		System.out.println(daPulire.trim());
		
		
	}

}
