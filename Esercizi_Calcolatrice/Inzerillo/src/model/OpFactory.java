package model;

public class OpFactory {
	public static Operazione createOperation(String operation) throws CalcolatriceException {
		switch(operation.trim().toLowerCase()){
			case "+":
				return new Somma();
			case "-":
				return new Sottrazione();
			case "*":
				return new Moltiplicazione();
			case "/":
				return new Divisione();
			default:
				throw new CalcolatriceException("no operation '"+operation+"' supported");
		}
	}
}
