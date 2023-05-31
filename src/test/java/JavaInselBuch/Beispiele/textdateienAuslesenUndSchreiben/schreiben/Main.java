package JavaInselBuch.Beispiele.textdateienAuslesenUndSchreiben.schreiben;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
        1. Es muss wieder ein neues file Object hergestellt werden und in die Gwünschte URL(Pfad) erstellt werden.
        2. Das Filewriter Object wird im CatchTry Block getestet. Wenn erfolgreich. Dann kann man mit der Methode "writer" Text in die Datei hinzufügen und nicht vergessen mit der methode "flush()" , dass ganze dan auch wirklich zu schreiben.
    */
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        File datei = new File("TextFiles/selbsterstellt123.txt");
        try {
            //Zu beachten : wenn man Text nur hinzufügen will dan muss zweiter Parameter "true sein", ansonsten nur ersten Parameter nutzen(Der bewirkt das der ganze Inhalt gelöscht wird und danach befüllt.)
            FileWriter writer = new FileWriter(datei,true);
            writer.write("Das ist mein Text.\n");
            writer.write("Das ist der zweite Satz.\n");
            writer.flush();
            writer.close();
        }catch (IOException e){
            System.out.printf("Datei konnte nicht bearbeitet werden!");
        }
    }
}

