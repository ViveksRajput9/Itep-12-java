package StringAsses.Asses.Jan27;

import java.util.Scanner;
class IllegalArgument extends RuntimeException{
	public IllegalArgument(String message) {
		super(message);
	}
}
public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
			if(a>7) {
				throw new IllegalArgument("Number should not be greater than 7");
			}else if (a==0) {
				throw new ArithmeticException("can't / by zero");
			}
			else {
				System.out.println(a);
			}
	
	}

}
