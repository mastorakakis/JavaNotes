package collections;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {

		Stack<Number> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3.1);
		System.out.println(stack);
		
		while(true) {
			
			try {
				Number number = stack.pop();
				System.out.println(number);
			} catch (EmptyStackException e) {
				System.out.println("Stack is empty");
				break;
			}
		}
	}

}
