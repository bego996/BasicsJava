package JavaInselBuch.CaptainCao.Capture8_Exceptions;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotenEinlesenTeilA {
    public static void main(String[] args) {
        //Hier werden die eingelesenen noten aus der Textdatei gespeichert um sie später in eine neue Textdatei zu schreiben.
        StringBuilder chain = new StringBuilder();
        //Der Filter für die gewünschten Noten. ', sind optional zu jedem vorherigen buchstaben. Das * steht dass es null oder mehrmal vorkommen kann. + steht das die ganze gruppierung mehrmals vorkommen kann.
        Pattern pattern = Pattern.compile("([A-Ga-g][',]*)+");
        try {
            Scanner noteReader = new Scanner(Paths.get("TextFiles/musical-notes.txt"));
            //Solange eine nächste zeile besteht.
            while (noteReader.hasNextLine()) {
                //Den matcher brauchen wir in kombi mit dem Pattern um abzugleichen. Wir übergeben im die aktuelle scanner Zeile und diese wird mti der Methode automatisch geskippt für den nächsten Durchlauf.
                Matcher matcher = pattern.matcher(noteReader.nextLine());
                //solange matcher einzeln die gesuchten Buchstaben findet, werden diese in einen String gepsiechert . Danach zum stringbuilder hinzugefügt.
                while (matcher.find()) {
                    String match = matcher.group();
                    chain.append(match);
                    System.out.print(match);
                }
            }
            System.out.println();
            //wichtig Scanner immer schließen try-mit Resourcen!
            noteReader.close();
        } catch (IOException e) {
            System.out.println("File was not found!");
        } finally {
            System.out.println("File found and succesfully readed!");
        }

        try {
            //Neue Textdatei erstellen.
            FileWriter fileWriter = new FileWriter("TextFiles/NotenSchreiben.txt");
            //Printwriter mit erstellten Textdatei veknüpfen , um darin schreiben zu können.
            PrintWriter fileWriter2 = new PrintWriter(fileWriter);
            //Schreiben von stringbuilderinhalt in die textdatei.
            fileWriter2.println(chain);
            //Sehr Wichtig : Beide Resourcen(Files) schließen um die Resourcen freizugeben und tatsächlich zu schreiben!
            fileWriter.close();
            fileWriter2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
