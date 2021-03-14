package string;

public class StringMain {

	public static void main(String[] args) {
		String greeting = "Hello";
		String string = new String();
		
		// substring
		String s = greeting.substring(0, 3);
		System.out.println(s);
		
		// put multiple strings together, separated by a delimiter: "S / M / L / XL"
		String all = String.join(" / ", "S", "M", "L", "XL");
		System.out.println(all);
		
		// equalsIgnoreCase
		System.out.println("hello".equalsIgnoreCase("HeLLo"));
		
		// str.length() <=>  str.equals("")
		if (string.length() == 0 || s.equals("")) {}
		
		string = " No spaces ";
		System.out.println("|" + string + "|");
		// eliminating all leading and trailing whitespace
		string = string.trim();
		System.out.println("|" + string + "|");
		
		// codePointCount
		int cpCount = greeting.codePointCount(0, greeting.length());
		System.out.println(cpCount);
		
		// indexOf
		System.out.println(s.indexOf('e'));
		
		// equals vs ==
		string = new String(greeting);
		System.out.println(string.equals(greeting));
		System.out.println(string == greeting);
		string = "test";
		System.out.println(string == "test");
		
		// starts with ends with
		System.out.println(string.startsWith("te"));

	}

}
