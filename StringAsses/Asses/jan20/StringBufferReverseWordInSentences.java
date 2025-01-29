package StringAsses.Asses.jan20;
import static StringAsses.checkVowels.Methods.*;

import java.util.Scanner;

public class StringBufferReverseWordInSentences {
	public static void reverseWords(StringBuffer str) {
	    int start = 0;
	    
	    for (int i = 0; i <= str.length(); i++) {
	        // Identify the end of a word (space or end of buffer)
	        if (i == str.length() || str.charAt(i) == ' ') {
	            // Reverse the current word
	            reverseStringBuffer(str, start, i - 1);
	            start = i + 1; // Move to the start of the next word
	        }
	    }
	}

	// Helper method to reverse a portion of the StringBuffer in place
	private static void reverseStringBuffer(StringBuffer str, int start, int end) {
	    while (start < end) {
	        char temp = str.charAt(start);
	        str.setCharAt(start, str.charAt(end));
	        str.setCharAt(end, temp);
	        start++;
	        end--;
	    }
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentences :-");
		StringBuffer string1 = new StringBuffer(scanner.nextLine());
		reverseWords(string1);
		System.out.println(string1);
	}
	
}
