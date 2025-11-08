// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int i = Integer.parseInt(args[0]);
		int counter = 0;
		double piCalc = 0;
		double deno = 1; // holds the last denominator (מכנה) that was added/subtracted
		while (counter < i) {
			if ((counter) % 2 == 0) {
				piCalc = piCalc + (1 / (deno + 2));
			}
			else piCalc = piCalc - (1 / (deno + 2));
			deno = deno + 2;
			counter++;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (4 * piCalc));
	}
}
