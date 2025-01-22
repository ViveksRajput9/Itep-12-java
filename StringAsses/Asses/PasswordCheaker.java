package StringAsses.Asses;

import static StringAsses.checkVowels.Methods.*;

import java.util.Scanner;

public class PasswordCheaker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to password Checking system");
		System.out.print("Enter password :- ");
		String st = scan.nextLine();
		if(isPasswordValid(st)) {
			System.out.println("Password is valid ");
		}else {
			System.out.println("oops... \n password Not valid...  \n Example :- Ex@123Abc");
		}
	}
}
