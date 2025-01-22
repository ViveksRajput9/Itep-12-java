package StringAsses.Asses;

import java.util.Scanner;
import static StringAsses.checkVowels.Methods.*;

public class StringReversal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to reverse string ");
		System.out.print("Enter :- ");
		String st = scan.nextLine();
		System.out.println(reverseString(st));
	}
}
