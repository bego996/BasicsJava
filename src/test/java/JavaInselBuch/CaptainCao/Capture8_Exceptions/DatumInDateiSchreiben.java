package JavaInselBuch.CaptainCao.Capture8_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class DatumInDateiSchreiben {
    public static void main(String[] args) {
        File file = new File("TextFiles/TestDatei.txt");
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.append(String.valueOf(LocalTime.now()));
            writer.close();
        }catch (FileNotFoundException e){
            System.err.println("Datei wurde nicht gefunden!");
        }finally {
            System.out.println("Action erfolgreich, Textdatei würde beschrieben!");
        }
    }
}
