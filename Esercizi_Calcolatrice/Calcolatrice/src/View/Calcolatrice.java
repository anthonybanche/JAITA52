package View;


import controller.calcolatricectrl;



public class Calcolatrice {

	public static void main(String[] args) {
		
		
	calcolatricectrl calc = new calcolatricectrl();
	
		try {
			calc.Prendinumeri(0, 0);
		} catch (Exception e) {
			
			e.getMessage();
		System.out.println(e.getMessage());
		}
		
		
		}


	}


