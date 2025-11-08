// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int i = Integer.parseInt(args[0]);
		for (int counter = 1; counter <= i; counter++) {
			int startNumber = counter;
			int currentNumber = counter;
			while (currentNumber != 1) {
				
				if (currentNumber % 2 == 0)
					currentNumber = currentNumber / 2;
				else currentNumber = 3 * currentNumber + 1;
			}
		}
	}
}
