package JavaInselBuch.Beispiele.anonymeKlassenPackage;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class AnonymeKlassen {
    public static void main(String[] args) {
        // Anonyme Klassen sind:
        //Namenlose Klase, die gleichzeitig deklariert und initialisiert wird.

        // 1 Weg. Klasse erweiten
        //Einmalig nutzbare anonyme Klasse wird erstellt, genutzt wird die Klasse AnonymeKlasenBeispielKlasen.
        //Es wird die Methode überschrieben.
        //Die anonyme Klasse kann in nirgends anderer Klasse mehr verwendet werden.Da es Kein Object ist und nur einmalig nutzbar ist.
        AnonymeKlassenBeispielKlasse test = new AnonymeKlassenBeispielKlasse() {
            public void tuEtwas() {
                System.out.println("Jetzt tue ich");
            }
        };
        test.tuEtwas();
        //Erster weg ende.









        // 2 Weg. Interface implementieren.
        //Anonyme Klasse wird erstellt die das Interface Lebewesen implementiert.


        // Lebewesen dog = new Lebewesen() {       *//BeispielCode bis zeile 38.
        //     @Override
        //     public void macheEtwas() {
        //      System.out.println("wufwuf");
        //   }
        //};
        //rufeMethodeAuf(dog);


        rufeMethodeAuf(new Lebewesen() { //Verkürzte version , Parameter Interface. Anwendung oft für GUIs.
            @Override
            public void macheEtwas() {
                System.out.println("wufwuf");
            }
        });

        //Uebungsbeispiel
        print(new Printablle() {
            @Override
            public void print(){
                System.out.println("hallo");
            }
        });
    }
        //Verwendung in Praxis.
        public static void rufeMethodeAuf(Lebewesen lebewesen){
            lebewesen.macheEtwas();
        }

        //UebungBeispiel
        public static void print(Printablle printable){
            printable.print();
        }
    }
