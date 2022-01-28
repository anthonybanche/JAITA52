package view;

import java.util.Scanner;

import controller.CalcoloCtrl;
import model.CalcolatriceException;                             

public class CalcolatriceView {

	public static void main(String[] args) throws CalcolatriceException {

		CalcoloCtrl ctrl = new CalcoloCtrl();

		Scanner scan = new Scanner(System.in);
		double op1;
		double op2;
		String oper;

	try {		//provo ad eseguire
		System.out.println("Inserire numero:" );
		op1 = scan.nextDouble();
		
		System.out.println("Inserire operazione: ");
		oper = scan.next();
		
		System.out.println("Inserire numero: ");
		op2 = scan.nextDouble();
		
		
			ctrl.eseguiCalcoloCtrl(op1, op2, oper);
		} catch (CalcolatriceException e) {
			System.out.println("Ritenta, sarai più fortunato!");
			//e.printStackTrace();
		}
	}
}
