package interfaces;

public class Employee extends Person implements Named, Naming{

	@Override
	public void print() {
		
	}
	
	@Override
	public String getName() {
		return Named.super.getName(); // both Named and Naming have getName() method
	}

	
}
