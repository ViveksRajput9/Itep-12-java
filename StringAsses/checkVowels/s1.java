package StringAsses.checkVowels;
import  static StringAsses.checkVowels.Methods.*;
import java.util.Scanner;
public class s1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to count vowels in word or sentences");
		System.out.print("Enter :- ");
		String st = scan.nextLine();
//		System.out.println(isContainSpecialChar(st));
//		System.out.println(countVowels(st));
//		System.out.println(countSpace(st));
//		System.out.println("Enter the character to count how many time occured in sentence ");
//	    System.out.print("Enter :- ");
//	    char c = scan.next().charAt(0);
//	    System.out.println(countOccuredChar(st, c));
//	    System.out.println(isUpperCaseChar(st));
		System.out.println(isPalindrome(st));
	    scan.close();	
	    
	}
}
