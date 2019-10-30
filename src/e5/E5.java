package e5;

import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] words;
		int vectorSize, positionForLongestWord;

		System.out.println("Enter vector size:");
		vectorSize = sc.nextInt();

		words = new String[vectorSize];

		fillVector(words);
		System.out.println("\nShowing the original content.");
		showVector(words);
		System.out.println("\nShowing the words reversing upper and lower case.");
		showReveringChars(words);

		positionForLongestWord = getPositionForLongestWord(words);

		System.out.println("\nThe longest word is " + words[positionForLongestWord] + " and it's placed in the position " + positionForLongestWord);

	}

	private static int getPositionForLongestWord(String[] words) {
		// TODO Auto-generated method stub
		int pos = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > words[pos].length())
				pos = i;
		}
		return pos;
	}

	private static void showReveringChars(String[] words) {
		// TODO Auto-generated method stub
		
		// for each word
		for(int i=0;i<words.length;i++){
			System.out.print(i + " --> ");
			// for each char
			for(int j=0;j<words[i].length();j++){
				// Check if the char is upper or lower case
				if(words[i].charAt(j)>='A' && words[i].charAt(j)<='Z')
					System.out.print((char)(words[i].charAt(j)+('a'-'A')));
				else
					System.out.print((char)(words[i].charAt(j)-('a'-'A')));
			}
			System.out.println();
		}

	}

	private static void showVector(String[] words) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<words.length;i++){
			System.out.println(i+ " --> " + words[i]);
		}

	}

	private static void fillVector(String[] words) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<words.length;i++){
			System.out.println("Enter the word for the position " + i);
			words[i]=sc.next();
		}

	}

}
