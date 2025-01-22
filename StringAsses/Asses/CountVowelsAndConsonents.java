package StringAsses.Asses;

import static StringAsses.checkVowels.Methods.*;

import java.util.Scanner;

public class CountVowelsAndConsonents {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to count vowels in word or sentences");
		System.out.print("Enter :- ");
		String st = scan.nextLine();
		System.out.println(countVowels(st));
		System.out.println(countConsonents(st));
	}
}
