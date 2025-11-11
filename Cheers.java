//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String str = args[0];
            str = str.toUpperCase();
            char currentLetter;
            String anLetters = "AEFHILMNORSX";
            for (int index = 0; index < str.length(); index++) {
                currentLetter = str.charAt(index);
                if (anLetters.indexOf(currentLetter) == -1) {
                        System.out.println("Give me a  " + currentLetter + ": " + currentLetter + "!");
                }
                else System.out.println("Give me an " + currentLetter + ": " + currentLetter + "!");
            }
            int i = Integer.parseInt(args[1]);
            System.out.println("What does that spell?");
            for (int cheers = 0; cheers < i; cheers++) {
                System.out.println(str + "!!!");
            }
        }
}
