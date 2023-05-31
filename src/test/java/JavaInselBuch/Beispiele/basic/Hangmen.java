package JavaInselBuch.Beispiele.basic;

import java.util.Scanner;

public class Hangmen {
    public static void main(String[] args) {
        String hangmen = "Apfelbaum";
        String guesedWord = "";
        String usedChars = "";
        for (int i = 0; i < hangmen.length() ; i++) {
            guesedWord += "_";
        }
        for (int guesses = 0; ; guesses++){
            if (guesses == 10){
                System.err.println("Leider zu viele Versuche.Du hast das wort nicht erraten!");
                break;
            }
            if (guesedWord.equals(hangmen)) {
                System.out.printf("Gratulation, du hast %s richtig erraten!%n",hangmen);
                break;
            }
            System.out.printf("Runde %d. Du hast bisher %s erraten. Welches Zeichen wählst du?%n",guesses,guesedWord);
            char guessedChar = new Scanner(System.in).nextLine().charAt(0);
            if (usedChars.indexOf(guessedChar) >= 0)
                System.out.printf("Das %c hast du schonmal getippt!%n", guessedChar);
            else {
                usedChars += guessedChar;
                if (hangmen.indexOf(guessedChar) >= 0) {
                    guesedWord = "";
                    for (int i = 0; i < hangmen.length() ; i++)
                        guesedWord += usedChars.indexOf(hangmen.charAt(i)) >= 0 ? hangmen.charAt(i) : "_";

                }
                else {
                    System.err.printf("Pech gehabt, der buchstabe %c kommt nicht vor!%n", guessedChar);
                }
            }
        }
    }
}
