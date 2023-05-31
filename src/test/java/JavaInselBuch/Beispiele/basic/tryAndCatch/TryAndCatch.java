package JavaInselBuch.Beispiele.basic.tryAndCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args) {
//try testet die Codezeile auf Fehler. Anstatt Exceptions fängt der catch block den Fehler auf. finnally zeigt das Testende an.
        Scanner scanner = new Scanner(System.in);
        try {
            int eingabe = scanner.nextInt();
            System.out.println(eingabe);
        } catch (InputMismatchException e){
            System.err.println("Falscher Datentyp!");
            e.printStackTrace();
        }finally {
            scanner.close();
            System.out.println("Scanner wurde geschlossen");
        }
        System.out.println("Weiter gehts !!");
    }
}
