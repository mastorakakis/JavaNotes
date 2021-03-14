package scanner;

import java.util.Scanner;

public class MainScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Your age? ");
		while(!sc.hasNextInt()) {
			System.out.print("Only Integers allowed. Try again: ");
			sc.nextLine();
		}
		int age = sc.nextInt();
		System.out.println("You are " + age);
		sc.close();
	}

}
