package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a file or directory name:");

		// create path
		Path path = Paths.get(sc.nextLine());

		// file exists
		if (Files.exists(path)) {
			System.out.println(path.getFileName() + " exists");
			System.out.printf("%s a directory\n", Files.isDirectory(path) ? "is" : "is not");
			System.out.printf("%s an absolute path\n", path.isAbsolute() ? "is" : "is not");
			System.out.println("Last modified: " + Files.getLastModifiedTime(path));
			System.out.println("Size: " + Files.size(path));
			System.out.println("Path: " + path);
			System.out.println("Absolute path: " + path.toAbsolutePath());

			if (Files.isDirectory(path)) {
				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

				for (Path p : directoryStream) {
					System.out.println(p);
				}
			}
		} else {
			System.out.println(path + " does not exist");
		}
		// working directory
		System.out.println(System.getProperty("user.dir"));
		// separator character in current platform
		System.out.println(File.separator);
	}

}
