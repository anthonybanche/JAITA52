package control;

import java.util.ArrayList;
import java.util.List;

import eccezioni.CalcolatriceException;
import model.*;

public class operazioneCTRL {

	List<Operazione> operazioni = new ArrayList<>();

	public void init() {
		this.operazioni.add(new Somma());
		this.operazioni.add(new Sottrazione());
		this.operazioni.add(new Divisione());
		this.operazioni.add(new Moltiplicazione());
	}

	public String calcolo(double operando1, double operando2, char operatore) throws CalcolatriceException {

		switch (operatore) {
		case '+':
			this.operazioni.get(0).setOperando1(operando1);
			this.operazioni.get(0).setOperando2(operando2);
			return this.operazioni.get(0).toString();
		case '-':
			this.operazioni.get(1).setOperando1(operando1);
			this.operazioni.get(1).setOperando2(operando2);
			return this.operazioni.get(1).toString();
		case '/':
			if (operando2 == 0) {
				throw new CalcolatriceException("impossibile dividere un numero per zero");
			} else
			this.operazioni.get(2).setOperando1(operando1);
			this.operazioni.get(2).setOperando2(operando2);
			return this.operazioni.get(2).toString();
		case '*':
			this.operazioni.get(3).setOperando1(operando1);
			this.operazioni.get(3).setOperando2(operando2);
			return this.operazioni.get(3).toString();
		}
		return null;
	}
}
