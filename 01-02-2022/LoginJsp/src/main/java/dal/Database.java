package dal;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private static Database instance;
	private List<PersonaDAO> listaPersone;

	private Database() {
		listaPersone = new ArrayList<>();
		listaPersone.add(new PersonaDAO("Giuseppe", "Verdi", "g.verdi@gmail.com", "123456"));
		listaPersone.add(new PersonaDAO("Paperino", "Paperino", "paperino@gmail.com", "123456"));
		listaPersone.add(new PersonaDAO("Topo", "Lino", "topolino@gmail.com", "123456"));
	}

	public static Database getDatabase() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}

	public List<PersonaDAO> getPersone() {
		return listaPersone;
	}

}

// Database.getDatabase();
// Database b1 = new Database();
// b1.getListaPersone(); // UN ARRAY DA 3 PERSONE
// NON SONO LO STESSO ARRAY!
// Database b2 = new Database();
// b2.getListaPersone(); // UN ARRAY DA 3 PERSONE