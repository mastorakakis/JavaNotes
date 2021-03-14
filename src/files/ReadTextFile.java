package files;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {

	static Scanner sc;

	public static void main(String[] args) {

		openFile();
		readRecords();
		closeFile();
	}

	private static void openFile() {
		try {
			// Paths.get
			sc = new Scanner(Paths.get("clients.txt"));
		} catch (IOException e) {
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}

	}

	private static void readRecords() {
		System.out.printf("%-10s%-12s%-12s%10s\n", "Account", "First Name", "Last Name", "Balance");
		try {
			while (sc.hasNext()) // while there is more to read
			{
				System.out.printf("%-10d%-12s%-12s%10.2f%n", sc.nextInt(), sc.next(), sc.next(),
						sc.nextDouble());// display record contents
			}
		} catch (NoSuchElementException elementException) {
			System.err.println("File improperly formed. Terminating.");
		} catch (IllegalStateException stateException) {
			System.err.println("Error reading from file. Terminating.");
		}
	}

	private static void closeFile() {
		if (sc != null) {
			sc.close();
		}
	}

}
