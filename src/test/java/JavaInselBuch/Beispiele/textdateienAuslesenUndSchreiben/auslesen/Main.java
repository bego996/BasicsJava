package JavaInselBuch.Beispiele.textdateienAuslesenUndSchreiben.auslesen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*    Zwei möglichkeiten eine Textdatei Object zu erstellen.
          1. Eine File Object erstellen und zum Verzeichnis navigieren -> pathname "C:/Users/bego/Desktop/JavaEinleOrdner/test.txt" . Und mit sout checken ob die File verfügbar ist(boolean Rückgabe).
          2. Abgekürzte Methode : Wir kopieren die TxtDatei direkt in unser Projekt Verzeichnis und brauchen dan nur den Dateinamen -> pathname "test.txt".
    */
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        File datei = new File("TextFiles/test.txt");
        System.out.println(datei.isFile());
        //Einlesen des Files. "Systen.in" nicht notwendig weil keine Benutzereingabe.
        //Scanner Object mit null intialisieren, damit nach eventuell gescheitertem TryCatch das Programm nicht abstürzt.
        Scanner scan = null;
        //Um die Datei in den scanner einzulesen müssen wir das ganze mit einem try catch block machen.
        //Wenn erfolgreich dann haben wir das File in den Scanner eingelesen, andernfalls wird eine Message ausgegeben(Catch) und das Scanner Object bleibt leer.
        try {
            scan = new Scanner(datei);
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        //Mit scan.nextLine, wird nur die erste Zeile des Scanner ausgegeben. Danach ändert der Scanner automatisch seinen Header auf anfang nächste Zeile.
        System.out.println(scan.nextLine());
        System.out.println();
        //Hier lesen wir solange Zeilen aus, solange es noch zeilen gibt (scan.hasNext in der WhileSchleife) prüft hier ob noch Zeile inhalt enthält.
        //Wir geben jede Zeile mit Zeilenumbruch aus mit (scan.nextLine), danach springt der Scanner Header wieder automatisch in die nächste Zeile.
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
        System.out.println();
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Selbsexperiment. Wir lesen Text aus einer datei ein und erstellen uns Objecte als Array vom Typ Hund und initialisieren sie Mit dem Inhalt des Textes "dog.txt".
        //Neues Verständis : scan.nextInt-> gibt die nächste Zahl im Text aus und springt zum nächsten Buchstabenanfang.
        //                   scan.next   -> macht im Prinzip dass selbe wie oben, nur mit Strings.
        //Header Pointer bewegt nachwie vor mit.
        scan = null;
        Hund[] hunde = new Hund[4];

        File datei2 = new File("TextFiles/dogs.txt");
        System.out.println(datei2.isFile());
        try {
            scan = new Scanner(datei2);
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        int lines = 0;
        while (scan.hasNext()){
            int alter = scan.nextInt();
            String name = scan.next();
            String art = scan.next();
            String farbe = scan.next();
            hunde[lines] = new Hund(name,alter,farbe,art);
            lines++;
        }
        for (Hund hund: hunde) {
            System.out.printf("alter : %d, name : %s, art : %s, farbe : %s%n",hund.getAlter(),hund.getName(),hund.getArt(),hund.getFellFarbe());
            hund.bellen();
        }
        scan.close();
    }
}
