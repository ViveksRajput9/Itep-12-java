package StringAsses.Asses.jan20;
import static StringAsses.checkVowels.Methods.*;

import java.util.Scanner;

public class Q8 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String string = scanner.nextLine();
	System.out.println(removeAllDigits(string));
}
}
