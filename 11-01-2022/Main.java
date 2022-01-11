
public class Main {

	public static void main(String[] args) { // INZIO

		int a = 123;
		float b = 1.4f;
		double c = 323434.5435;
		char d = 'c';
//		String s = "Ciao 123";

		float base = 5.5f;
		float altezza = 8f;
		float area = 0f;

		area = base * altezza / 2;

		System.out.println("Questo è il risultato: " + area);
//		System.out.print("");

		if (area == base) {
			// VERA
			System.out.println("Condizione verificata");
			System.out.println("Congratulazioni");
		} else {
			// FALSA
			System.out.println("Condizione non verificata");
		}

		if (area == 20f) {
			System.out.println("L'area è 20");
		} else if (area == 22f) {
			System.out.println("L'area è 22");
		} else if (area == 10f) {
			System.out.println("L'area è 10");
		} else {
			System.out.println("");
		}

		int s = 2;
		switch (s) {
		case 1:
			// SE s == 1 allora esegui questo blocco di codice
			System.out.println("Ciao questo caso funziona");
			break;
		case 2:
			// SE s == 2 allora esegui questo blocco di codice
			System.out.println("Questo caso funziona");
			break;
		case 3:
		case 4:
			// SE s == 3 oppure s == 4 allora esegui questo blocco di codice
			System.out.println("Ciao valgo 3 oppure 4");
			break;
		default:
			System.out.println("Caso di default");
			// QUI SE NESSUN CASO E' STATO RISPETTATO
		}

		int x = 4, y = 0;
		// Prima controllo e poi faccio
		while ((y * y) != x) {
			// y = y + 1;
			// y += 1;
			y++;
		}
		System.out.println("1 - Radice quadrata di: " + x + " è: " + y);

		int t = 16, u = 0;
		do {
			// Prima faccio una determinata lista di azioni
			// e poi controllo
			u++;
		} while ((u * u) != t);
		System.out.println("2 - Radice quadrata di: " + t + " è: " + u);

		// inizializzazione; condizione; incremento/decremento
		for (int i = 0; i < 6; i++) {
			System.out.println("Ciao, mi chiamo i: " + i);
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	} // FINE

}
