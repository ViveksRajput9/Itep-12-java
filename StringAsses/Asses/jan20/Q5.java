package StringAsses.Asses.jan20;
import static StringAsses.checkVowels.Methods.*;

import java.util.Scanner;
public class Q5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String string = scanner.nextLine();
	mostOccuredChar(string);
	System.out.println("s "+countOccuredChar(string, 's'));
}
}
