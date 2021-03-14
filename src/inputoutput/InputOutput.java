package inputoutput;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class InputOutput {

		Console cons = System.console();
		String username = cons.readLine("User name: ");
		char[] passwd = cons.readPassword("Password: ");
		
		public void method() throws IOException {
			
			Scanner sc = new Scanner(System.in);
			sc.hasNext();								// sc.hasNext()
			sc.hasNextInt();							// sc.hasNextInt()
			
			Scanner in = new Scanner(Paths.get("myfile.txt"), "UTF-8"); // scan file
			
			PrintWriter out = new PrintWriter("myfile.txt", "UTF-8"); 	// write to file
			
			String dir = System.getProperty("user.dir");   // starting directory 

		}
}
