package StringAsses.Asses.Jan27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        try {
            String input = scanner.next(); // Read input as a string
            if (!input.matches("-?\\d+")) { // Check if the input is not an integer
                throw new InputMismatchException();
            }
            int value = Integer.parseInt(input); // Parse the valid integer
            System.out.println(value); // Print the integer if valid
        } catch (InputMismatchException e) {
            throw new InputMismatchException("java.util.InputMismatchException"); // Explicitly throw exception
        } finally {
            scanner.close(); // Close the scanner to avoid resource leak
        }
	}
}
