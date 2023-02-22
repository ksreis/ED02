package Controller;

public class Resto {
	public Resto() {
		super();
	}
	 public static int restoDiv(int A, int B) {
		    if (A < B) {
		        return A;
		    } else {
		        return restoDiv(A-B, B);
		    }
		}


}
