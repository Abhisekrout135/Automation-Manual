package Practice_programing;

import java.util.Scanner;

public class FindLargestNumber {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);

        // Input four numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        System.out.print("Enter fourth number: ");
        int d = scanner.nextInt();

        // Find the largest
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        // Display the result
        System.out.println("The largest number is: " + max);

        scanner.close();
	}

}
