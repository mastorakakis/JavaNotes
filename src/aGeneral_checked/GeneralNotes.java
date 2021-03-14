package aGeneral_checked;

public class GeneralNotes {

	public static void main(String[] args) {

		double d2 = Double.NEGATIVE_INFINITY;
		double d3 = Double.NaN;
		double d4 = Double.MAX_VALUE;

		if (Double.isNaN(d3)) {
			System.out.println("d1 is not a number");
			System.out.println("d2: " + d2);
			System.out.println("Max double: " + d4);
		}
	}
}
