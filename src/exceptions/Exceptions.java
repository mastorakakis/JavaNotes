package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) throws Exception {
//		exceptionWithResources();
//		throw new CustomException("This is a custom");
		simpleException();
	}
	
	public static void simpleException() {
		
		int[] array = {1, 2, 3};
		try {
			System.out.println(array[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("E: " + e);
			System.out.println("Exception thrown");
			System.out.println(e.getClass().getName());
		}
	}
	
	public static void exceptionWithThrows() throws FileNotFoundException {
		PrintWriter out = new PrintWriter("out.txt");
	}

	public static void exceptionWithFinally() {
		try {
			PrintWriter out = new PrintWriter("out.txt");
			try {
				out.println("Test");
			} finally {
				out.close();
			}
		} catch (FileNotFoundException | RuntimeException e) {
			e.printStackTrace();
		}
	}

	public static void exceptionWithResources() {
		try (Scanner in = new Scanner(Paths.get("out.txt"))) {
			while (in.hasNext())
				System.out.println(in.next());
		} catch (IOException e) {
			StackTraceElement[] frames = e.getStackTrace();
			for (StackTraceElement frame : frames) {
				System.out.println(frame);
			}
		}
	}
}
