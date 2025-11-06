// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int i = Integer.parseInt(args[0]);
		int current = i;
		for (int counter = 0; counter < i; counter++) {
			String str = "" + current;
			if (current % 2 == 0) {
				current = current / 2;
			}
			else current = current * 3 + 1;
		}
	}
}
