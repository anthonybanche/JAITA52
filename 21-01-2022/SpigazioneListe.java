package it.jaita54.liste;

import java.util.ArrayList;
import java.util.List;

public class SpigazioneListe {
	//Liste & Mappe
	public static void main(String[] args) {
	
	String[] arrayStringhe= new String[9999];
	arrayStringhe[0]="Ciao";
	System.out.println(arrayStringhe[0]);
	
	List<String> listaStringhe=new ArrayList<>();
	listaStringhe.add("Ciao");  	//Mette la stringa nel primo posto disponibile
	listaStringhe.add(0, "Ciao"); 	//Mette la stringa all'indice indicato (sovvrascrive se già piena)
	listaStringhe.get(0);			//Ottiene la stringa contenuta all'indice indicato
	
	listaStringhe.clear(); 			//Svuota lista
	listaStringhe.contains("Ciao"); //Cerco se l'oggetto è presente in lista
	listaStringhe.size(); 			//Conteggio
	//listaStringhe.remove(0);		//Svuota la cella dell'indice indicato
	
	
	/*
	 * Vogliamo capire mediante dimostrazione se il .add chiamato senza parametri
	 * Crea per forza una cella nuova, oppure riutilizza la prima vuota disponibile
	 */
	
	List<String> testList=new ArrayList<>();
	
	testList.add("Stringa1");
	testList.add("Stringa2");
	testList.add("Stringa3");
	testList.add("Stringa4");
	
	stampaLista(testList);
	
	testList.remove(2);
	
	stampaLista(testList);
	
	testList.add(3, "Stringa4");
	
	stampaLista(testList);

	/*
	 * Abbiamo verificato che la chiamata di remove esegue 
	 * lo shifting del contenuto delle cella della lista in modo da non lasciare buchi
	 * 
	 * Inoltre, provando l'add con indice abbiamo verificato che è possibile fare add 
	 * solo a +1 rispetto al numero di oggetti contenuti nella lista
	 */
	
	
	}
	
	private static void stampaLista(List<String> lista) {
		System.out.println("----");
		for(int i=0;i<lista.size();i++) {
			System.out.println("Contenuto di "+i+" : "+lista.get(i));
		}
	}
}
