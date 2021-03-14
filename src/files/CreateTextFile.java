package files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {

	public static Formatter output;
	public static PrintWriter out;

	public static void main(String[] args) {

		openFile();
		addRecords();
		closeFile();
	}

	public static void openFile() {
		try {
			output = new Formatter("clients.txt"); // open the file
//			out = new PrintWriter("clients.txt", "UTF-8");
		} catch (SecurityException e) {
			System.err.println("Write permission denied. Terminating");
			System.exit(1);
		} catch (FileNotFoundException e) {
			System.err.println("Error opening file. Terminating");
			System.exit(1);
		}
	}

	private static void addRecords() {
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n? ", "Enter account number, first name, last name and balance.",
				"Enter end-of-file indicator to end input.");
		while (input.hasNext()) {
			try {
				output.format("%d %s %s %.2f\n", input.nextInt(), input.next(), input.next(), input.nextDouble());
			} catch (FormatterClosedException e) {
				System.err.println("Error writing to file. Termninating");
				break;
			} catch (NoSuchElementException e) {
				System.err.println("Invalid input. Please try again.");
				input.nextLine();
			}
			System.out.print("? ");
		}
	}
	
	private static void closeFile() {
		if (output != null) {
			output.close();
		}
	}

}
