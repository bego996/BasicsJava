package JavaInselBuch.Beispiele.basic;

import javax.swing.*;
import java.util.Arrays;

public class forEachBeispiele {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 9, 5};
        String[] words = {"Alpha","Beta"};
        int f = 7, g = 8;
        if (Arrays.asList(words).contains("Alpha")) //Arrays.asList gibtkein Array zurück sondern baut eine Sammlung auf.
            System.out.println("Found!");           //Funktioniert nur mit Objekten oder Referenztypen!
        if (Arrays.asList(f,g).contains(7))
            System.out.println("Found!");
        for (int number : Arrays.asList(f, g)) {
            System.out.println(number);
        }
        for (int number : numbers) {
            System.out.println(number);
        }

        String[] validInputs = {"Banane","Apfel","Nougat"};
        boolean found = false;
        while (!found){
            System.out.println("Errate das Obst:");
            String input =  JOptionPane.showInputDialog("Eingabe");
            if (input == null || input.isEmpty())   //Wenn eingabe abgebrochen oder keine Eingabe.
                throw new  NullPointerException("KEine Eingabe");
            for (String s:validInputs) {
                if (s.equals(input)){
                    found = true;
                    System.out.println("Richtig geraten!");
                    break;
                }
            }
        }

    }
}
