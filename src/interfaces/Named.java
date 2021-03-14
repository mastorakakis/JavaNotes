package interfaces;

public interface Named {
	
	double SPEED_LIMIT = 95; // always a public static final constant
	
	void print();
	
	static int add(int a, int b) { // as of Java 8
		return a+b;
	}
	
	default String getName() {
		return getClass().getName();
	}

}
