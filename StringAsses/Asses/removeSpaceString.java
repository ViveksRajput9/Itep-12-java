package StringAsses.Asses;
import static StringAsses.checkVowels.Methods.*;
import java.util.Scanner;
public class removeSpaceString{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to remove space from sentence");
		System.out.print("Enter :- ");
		String st = scan.nextLine();
		System.out.println(removeSpace(st));
		scan.close();
	}
}