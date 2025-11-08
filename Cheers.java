//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String str = args[0];
            str = str.toUpperCase();
            int index = 0;
            char currentLetter;
            String anLetters = "AEFHILMNORSX";
            while (index < str.length()) {
                currentLetter = str.charAt(index);
                if (anLetters.indexOf(currentLetter) == -1) {
                        System.out.println("Give me a  " + currentLetter + ": " + currentLetter + "!");
                }
                else System.out.println("Give me an " + currentLetter + ": " + currentLetter + "!");
                index++;
            }
            index = 0;
            System.out.println("What does that spell?");
            while (index < Integer.parseInt(args[1])) {
                System.out.println(str + "!!!");
                index++;
            }
        }
}
