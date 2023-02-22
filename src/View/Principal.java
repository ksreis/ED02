package View;

import Controller.Resto;

public class Principal {


	public static void main (String [] args) {
		Resto Rt = new Resto();
		
		int A = 5;
		int B = 2;
		
		int  restoDiv = Rt.restoDiv(A, B);
		System.out.println("O resto da divisao e:" + restoDiv);
				
	}
}

