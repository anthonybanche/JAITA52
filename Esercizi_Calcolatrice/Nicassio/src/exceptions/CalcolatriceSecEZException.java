package exceptions;

public class CalcolatriceSecEZException extends Exception {
	
	public CalcolatriceSecEZException(){
		super("Si sta tentando di eseguire una divisione per 0. Operazione negata per forma di indeterminazione.");
	}
}
