package e1;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ok 
		int n1 = 3;

		// Implicit casting 
		float n2 = 3;

		// Implicit casting
		int n3 = 'A';

		// String n4 = 4;
		String n4 = String.valueOf(4);

		// n1 = n4 + 3;
		n1 = Integer.parseInt(n4) + 3;

		// Implicit casting
		double n5 = n1 + n2;

		// float n6 = "6,5" + "5,2";
		float n6 = Float.parseFloat("6,5") + Float.parseFloat("5,2");

		// Implicit casting
		double n7 = 8.5f;

		// Implicit casting
		double n8 = 3;

		// Implicit casting
		int n9 = "983".charAt(0);

	}
}
