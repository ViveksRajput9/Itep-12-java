package StringAsses.Asses.jan20;
import static StringAsses.checkVowels.Methods.*;

import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 words to check is it anagram or not :-");
		System.out.print("Enter 1st word :- ");
		String string1 = scanner.nextLine();
		System.out.print("Enter 2nd word :- ");
		String string2 = scanner.nextLine();
		
		System.out.println(isAnagram1(string1, string2));
	}

}
