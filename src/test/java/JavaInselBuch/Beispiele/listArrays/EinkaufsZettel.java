package JavaInselBuch.Beispiele.listArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EinkaufsZettel {
    public static void main(String[] args) {
        List<String> einkaufsliste = new ArrayList<>();
        boolean ausgabe = false;

        while (!ausgabe) {
            System.out.print("Brauchen wir noch was (Y) / (N)");
            Scanner scanner = new Scanner(System.in);
            char inputYN = scanner.next().charAt(0);
            System.out.println();
            switch (inputYN) {
                case 'y', 'Y' -> {
                    System.out.print("Was brauchen wir?");
                    einkaufsliste.add(scanner.next());
                }
                case 'n', 'N' -> {
                    System.out.println("Deine Einkaufsliste lautet:");
                    for (String parts : einkaufsliste) {
                        System.out.println(parts);
                    }
                    ausgabe = true;
                }
            }
        }
    }
}
