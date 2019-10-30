package e4;

import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int value;

		System.out.println("Enter a integer number:");
		value = sc.nextInt();

		System.out.println("Showing the message produced by the if code: ");
		if (value >= 1 && value <= 3)
			System.out.println("Hello !");
		else if (value == 4 || value == 5)
			System.out.println("How are you?");
		else if (value == 0)
			System.out.println("Bye");
		else
			System.out.println("I don't know what to say");

		System.out.println("\nShowing the message produced by the switch code: ");
		switch (value) {
		case 1:
		case 2:
		case 3:
			System.out.println("Hello !");
			break;
		case 4:
		case 5:
			System.out.println("How are you?");
			break;
		case 0:
			System.out.println("Bye");
			break;
		default:
			System.out.println("I don't know what to say");
			break;
		}

	}

}
