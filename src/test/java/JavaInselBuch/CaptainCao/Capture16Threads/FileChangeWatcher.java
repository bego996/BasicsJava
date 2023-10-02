package JavaInselBuch.CaptainCao.Capture16Threads;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class FileChangeWatcher implements Runnable {
    File inventar;                    // Die zu überwachende Datei (als File-Objekt)
    FileTime time;                    // Zeitpunkt der letzten Änderung der Datei

    FileChangeWatcher(String fileName) throws IOException {
        // Erstellen eines File-Objekts für die zu überwachende Datei
        inventar = new File(String.format("TextFiles/%s", fileName));

        // Ermittlung des Zeitpunkts der letzten Änderung der Datei
        time = Files.getLastModifiedTime(Path.of(String.format("TextFiles/%s", inventar.getName())));
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Pausiere für 1 Sekunde
                TimeUnit.MILLISECONDS.sleep(1000);

                // Ausgabe von Dateinamen, Größe und Zeitpunkt der letzten Änderung
                System.out.print(inventar.getName() + "[" + this.inventar.length() + " Byte] Letzte Änderung: ");
                FileTime lastModifiedTime = Files.getLastModifiedTime(Path.of(String.format("TextFiles/%s", inventar.getName())));
                String formattedTime = formatDate(lastModifiedTime.toMillis());
                System.out.println(formattedTime);

                // Überprüfung, ob die Datei seit dem letzten Mal geändert wurde
                if (!time.equals(lastModifiedTime)) {
                    time = lastModifiedTime;
                    System.err.println("Datei wurde geändert!");
                }
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String formatDate(long millis) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(new Date(millis));
    }

    public static void main(String[] args) throws IOException {
        // Erstellen einer Instanz des FileChangeWatcher
        FileChangeWatcher fileChangeWatcher = new FileChangeWatcher("Hooks.txt");
        // Starten des Überwachungsprozesses
        fileChangeWatcher.run();
    }
}
