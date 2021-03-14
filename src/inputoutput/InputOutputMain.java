package inputoutput;

import java.util.Date;
import java.util.Scanner;

public class InputOutputMain {

	public static void main(String[] args) {
		
		System.out.printf("%tF \n", new Date());
		
		String dir = System.getProperty("user.dir");
		
		System.out.println(dir);
		
		System.out.printf("% d", 1234);
		
	}

}
