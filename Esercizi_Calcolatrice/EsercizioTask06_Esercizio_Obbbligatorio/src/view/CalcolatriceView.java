package view;

import java.util.Scanner;

import controller.CalcolatriceCtrl;
import model.CalcolatriceException;

public class CalcolatriceView {

	public static void main(String[] args) {

		/*
		 * Si implementi un applicazione da terminale MVC per l'esecuzione di operazioni
		 * matematiche.
		 * Che permetta 3 input da utente: operatore1, operatore2 e operazione da
		 * effettuare
		 * Definire un interfaccia "Calcolo" da implementare attraverso le classi delle
		 * operazioni
		 * effettuabili (somma, sottrazione, divisione, moltiplicazione)
		 * Utilizzare una superclasse (Operazione) per unificare costruttore, struttura
		 * attributi
		 * Il main del programma sar� presente in una classe "CalcolatriceView"
		 * 
		 * Predisporre all'interno della view il metodo di controllo per
		 * Verificare gli input da tastiera per quanto riguarda i numeri (sia positivi
		 * che negativi)
		 * Verificare gli input da tastiera per confermare che l'operazione sia gestita
		 * (gestiamo somma, sottrazione, divisione, moltiplicazione)
		 * In caso di errore sollevare eccezioni specifiche CalcolatriceException
		 * contenente un messaggio di errore.
		 * 
		 * SOLO DOPO AVER COMPLETATO QUANTO VISTO SOPRA (EXTRA)
		 * - Incasellare l'esecuzione in un loop (che esce quando operazione == stringa
		 * vuota)
		 * - Tenere traccia mediante una List<String> delle operazioni effettuate, dei
		 * loro operatori e dei risultati
		 * - Mostrare lo storico delle operazione a fine programma dopo aver rilevato
		 * operazione == stringa vuota
		 * 
		 * HINTS
		 * Classe Somma extends Operazione Implements Calcolo
		 * Classe Sottrazione extends Operazione Implements Calcolo
		 * Classe Divisione extends Operazione Implements Calcolo
		 * Classe Moltiplicazione extends Operazione Implements Calcolo
		 * Nella superclasse (extends) bisogna mettere ci� che sarebbe in comune tra
		 * tutte le operazioni (sia attributi che metodi)
		 * Nell'interfaccia (implements) bisogna definire la firma del metodo di calcolo
		 * che ogni operazione implementer� nella
		 * sua classe specifica
		 * La View(main) serve solo per leggere gli input da tastiera e per scrivere gli
		 * ouput
		 * Il controller istanzia le operazioni, tiene la storia, scatenza i calcoli e
		 * passa i risultati alla view
		 */

		CalcolatriceCtrl ctrl = new CalcolatriceCtrl();

		Scanner sc = new Scanner(System.in);

		boolean condizioneUscita = true;

		do {// ciclo finale

			condizioneUscita = true;

			boolean condizioneUscita2 = false;

			do {// ciclo operatore1

				System.out.println("Inserire operatore 1 :");

				try {

					ctrl.controlloOperatore1(sc.nextLine());
					condizioneUscita2 = false;

				} catch (NumberFormatException e) {

					System.out.println("Non hai inserito un numero! Riprova");
					condizioneUscita2 = true;

				}
			} while (condizioneUscita2);

			boolean condizioneUscita3 = false;

			do {// ciclo operatore2

				System.out.println("Inserire operatore 2 :");
				try {
					ctrl.controlloOperatore2(sc.nextLine());
					condizioneUscita3 = false;
				} catch (NumberFormatException e) {
					System.out.println("Non hai inserito un numero! Riprova");
					condizioneUscita3 = true;
				}

			} while (condizioneUscita3);

			boolean condizioneUscita4 = false;

			do {// ciclo operatore3

				System.out.println(
						"Inserire operazione da fare :\n(Somma: + | Sottrazione: - | Moltiplicazione * | Divisione / | exit : lasciare vuoto)");
				String risposta = sc.nextLine();

				if (risposta.equals("+") || risposta.equals("-") || risposta.equals("*") || risposta.equals("/")) {

					double risultato=ctrl.controlloOperazione(risposta);
					System.out.println("Il risultato è "+risultato);
					condizioneUscita4 = false;

				} else if (risposta.equals("")) {
					condizioneUscita = false;
				} else {
					try {

						throw new CalcolatriceException();

					} catch (CalcolatriceException e) {
						System.out.println("Non hai inserito un operatore valido! Riprova");
						condizioneUscita4 = true;

					} // fine try catch

				} // fine if
			} while (condizioneUscita4);

		} while (condizioneUscita);

		String rie=ctrl.riepilogo();
		System.out.println(rie);

	}

}
