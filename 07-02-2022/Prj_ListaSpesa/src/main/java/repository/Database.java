package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exceptions.UtenteBannatoException;
import model.Persona;
import model.Prodotto;

public class Database {

	private static Database instance;
	private Map<String, List<Prodotto>> listaSpesa;
	private List<Persona> listaPersone;
	private List<String> listaEmailBannate;
	
	private Database() {
		listaSpesa = new HashMap<>();
		
		List<Prodotto> spesaDiLuca= new ArrayList<Prodotto>();
		spesaDiLuca.add(new Prodotto(0, "Banana", 1.00, "Frutta"));
		spesaDiLuca.add(new Prodotto(1, "Biscotti", 2.00, "Dolci"));
		spesaDiLuca.add(new Prodotto(2, "Carota", 0.70, "Verdura"));
		
		listaSpesa.put("g.verdi@gmail.com", spesaDiLuca);
		
		listaPersone = new ArrayList<>();
		listaPersone.add(new Persona("Giuseppe", "Verdi", "g.verdi@gmail.com", "123456"));
		listaPersone.add(new Persona("Paperino", "Paperino", "paperino@gmail.com", "123456"));
		listaPersone.add(new Persona("Topo", "Lino", "topolino@gmail.com", "123456"));
		
		listaEmailBannate = new ArrayList<>();
		listaEmailBannate.add("topolino@gmail.com");
		
		
	}
	
	public static Database getDatabase() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}
	
	public List<Prodotto> getListaSpesa(String mail) throws UtenteBannatoException{
		
		if(listaEmailBannate.contains(mail)) {
			throw new UtenteBannatoException(mail);
		}
		
		if(listaSpesa.get(mail)==null) {
			List<Prodotto> listaSpesaVuota= new ArrayList<Prodotto>();
			listaSpesa.put(mail, listaSpesaVuota);
		}
		
		return listaSpesa.get(mail);
	}
	
	public List<Persona> getListaPersone(){
		return listaPersone;
	}
	
	//In questo modo saremo in grado di istanziare una volta soltanto l'oggetto database = Singleton.
}
