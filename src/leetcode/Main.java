package leetcode;

public class Main {

	public static void main(String[] args) {

		int x = 3;
		System.out.println(x << 1);
	}

	public static int divide(int dividend, int divisor) {
		int count = -1;
		int adder = 1;
		int sum = 0;
		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
			count = 1;
			adder = -1;
		}
		while (Math.abs(sum) <= Math.abs(dividend)) {
			if (sum > 0 && Integer.MAX_VALUE - divisor < sum) {
				count += adder;
				break;
			}
			if (sum < 0 && Integer.MIN_VALUE - divisor < sum) {
				count += adder;
				break;
			}
			sum += divisor;
			count += adder;
		}
		return count;
	}
}
