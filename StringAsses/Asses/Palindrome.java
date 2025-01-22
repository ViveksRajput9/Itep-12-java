package StringAsses.Asses;
import static StringAsses.checkVowels.Methods.isPalindrome;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("welcome to count vowels in word or sentences");
	System.out.print("Enter :- ");
	String st = scan.nextLine();
	System.out.println(isPalindrome(st));
	}
}
