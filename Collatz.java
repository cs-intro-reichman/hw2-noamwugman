// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		String vORc = args[1];
		for (int index = 1; index <= n; index++) {
			int i = index;
			int counter = 1;
			String str = "" + i;
			if (i == 1) {
				i = 3 * i + 1;
				str = str + " " + i;
				counter++;
			}
			while (i != 1) {
				if (i % 2 == 0) {
					i = i / 2;
					str = str + " " + i;
					counter++;
				} else {
					i = 3 * i + 1;
					str = str + " " + i;
					counter++;
				}
			}
			if (vORc.equals("v")) {
				System.out.println(str + " (" + counter +")");
			}
		}
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	}
}
