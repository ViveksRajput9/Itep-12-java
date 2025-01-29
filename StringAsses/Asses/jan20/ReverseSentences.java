package StringAsses.Asses.jan20;

import static StringAsses.checkVowels.Methods.*;

import java.util.Scanner;

public class ReverseSentences {
	public static void reverseSentences1(StringBuilder stringBuilder) {
	    String[] words = stringBuilder.toString().split(" ");
	    
	    // Reverse the array of words
	    for (int i = 0; i < words.length / 2; i++) {
	        String temp = words[i];
	        words[i] = words[words.length - 1 - i];
	        words[words.length - 1 - i] = temp;
	    }

	    // Clear the StringBuilder and append the reversed words
	    stringBuilder.setLength(0); // Clear the StringBuilder
	    for (int i = 0; i < words.length; i++) {
	        stringBuilder.append(words[i]+" ");
	       
	    }
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter :- ");
		StringBuilder string2 = new StringBuilder(scanner.nextLine());
		reverseSentences1(string2);
		System.out.println(string2);
	}

}
