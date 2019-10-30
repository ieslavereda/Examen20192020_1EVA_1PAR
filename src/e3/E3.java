package e3;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("Enter a positive integer number:");
		number = sc.nextInt();
		int aux = number;
		
		System.out.println("Showing exit produced by the do-while code: ");
		while(number>=0){
			System.out.println(number);
			number--;
		}
		
		System.out.println("\nShowing exit produced by the for code: ");
		for(int i=aux;i>=0;i--){			
			System.out.println(i);			
		}

	}

}
