package JavaInselBuch.CaptainCao.Capture8_Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class LongestLineInFile {
    public static void main(String[] args) {
        //Text Pfad wird in einem String gespeichert.
        String names = "C:/Users/bego/Desktop/family-names.txt";
        //Hier könnte ich auch eine Collection anstatt einer Liste nutzen um die namen zu sortieren. Zu beachten ist aber das diese nicht so viele methoden wie die Liste hatt.
        List<String> nameList;
        String longestName = "";
        String longestName2 = "";
        try {
            //Die Liste wird mit der text datei gefüttert.
            nameList = Files.readAllLines(Paths.get(names));
            //In der Schleife wird der erst größte und zweit größte name gefiltert.
            for (String name : nameList) {
                if (name.length() > longestName.length()) {
                    longestName2 = longestName;
                    longestName = name;
                } else if (name.length() > longestName2.length()) {
                    longestName2 = name;
                }
            }
            System.out.println(longestName + " " + longestName.length());
            System.out.println(longestName2 + " " + longestName2.length());
            //Eine Geprüfte Exception abfangen.
        } catch (IOException e) {
            System.err.println("Fehler in der Textdatei!");
            e.printStackTrace();
        }
        //Hier habe ich einen consumer erstellt , um die ganze text datei auszugeben auf der Konsole+ Lambda.
        //Consumer<String> consumer = System.out::println;
        //nameList.forEach(consumer);
    }
}
