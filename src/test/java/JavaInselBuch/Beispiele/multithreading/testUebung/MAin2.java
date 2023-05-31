package JavaInselBuch.Beispiele.multithreading.testUebung;

import java.util.ArrayList;
import java.util.List;

public class MAin2 {
    public static void main(String[] args) {
        List<Hund> hundeListe = new ArrayList<>();
        System.out.println("Unser Tierheim hat viele Hunde.");
        //Wir erstellen eine anonyme Klasse für den Schnellen gebrauch.
        //Code ohne Lambda...(bis Zeile 22)
        /*
        ThreadMaker.lassImHintergrundLaufen(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    Hund hund = new Hund("Bello "+i);
                    hundeListe.add(hund);
                }
            }
        });
        */
        //Code mit Lambda(bis Zeile 38)
        ThreadMaker.lassImHintergrundLaufen(() -> {
            for (int i = 0; i < 1000; i++) {
                Hund hund = new Hund("Bello "+i);
                hundeListe.add(hund);
            }
        });
        System.out.println("Das sind unsere Hunde:");
        for (Hund hund: hundeListe) {
            System.out.println(hund.getName());
        }
    }
}
