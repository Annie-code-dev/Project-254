import java.util.Scanner;
public class Madlib {
    public static void main (String [] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a pronoun: ");
        String pronoun = keyboardInput.nextLine();
        System.out.print("Enter an effect: ");
        String effect = keyboardInput.nextLine();
        System.out.print("Enter a word: ");
        String word = keyboardInput.nextLine();



        System.out.println("I love " + pronoun + " and the minute you smile my skin gets " + effect + ".\n" +
                "This feeling has no " + word + " if you are not in the story. ");
    }
}
