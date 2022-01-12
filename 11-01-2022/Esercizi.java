
public class Esercizi {

	public static void main(String[] args) {

		// ES1
		System.out.println("--- Inizio Esercizio 1 ---");
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n--- Fine Esercizio 1 ---\n");

		System.out.println("--- Inizio Esercizio 2 ---");
		for (int i = 20; i > -1; i--) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
		System.out.println("\n--- Fine Esercizio 2 ---\n");

		System.out.println("--- Inizio Esercizio 3 ---");
		int numero = 5;
		for (int i = 0; i < 11; i++) {
			System.out.print(numero * i + " ");
		}
		System.out.println("\n--- Fine Esercizio 3 ---\n");

		System.out.println("--- Inizio Esercizio 4 ---");
		for (int i = 6; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("\n--- Fine Esercizio 4 ---\n");

		System.out.println("--- Inizio Esercizio 5 ---");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
		System.out.println("\n--- Fine Esercizio 5 ---\n");

		System.out.println("--- Inizio Esercizio 6 ---");
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i; j < 6+i; j++) { 
                System.out.print(" "); 
            }
			for (int l = 7-i; l >= 1; l--) {
				System.out.print(l);
			}
			System.out.println("");
		}
		System.out.println("\n--- Fine Esercizio 6 ---\n");
		
		System.out.println("--- Inizio Esercizio 7 ---");
		//Long non basta ma 100 sono eccessivi
		long num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < 100) {
            System.out.print(num1 + " ");
            long num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
		System.out.println("\n--- Fine Esercizio 7 ---\n");
		
		
	}

}
