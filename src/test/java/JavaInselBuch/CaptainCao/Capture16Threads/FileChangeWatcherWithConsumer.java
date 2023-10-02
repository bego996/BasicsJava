package JavaInselBuch.CaptainCao.Capture16Threads;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class FileChangeWatcherWithConsumer implements Runnable {
    private final Path inventar;       // Pfad zur überwachenden Datei
    private final Consumer<Path> callback;  // Rückruffunktion, die aufgerufen wird, wenn die Datei geändert wird

    FileChangeWatcherWithConsumer(String fileName, Consumer<Path> callback) {
        inventar = Paths.get(fileName);
        this.callback = Objects.requireNonNull(callback);
    }

    @Override
    public void run() {
        try {
            // Ermittlung des alten Zeitpunkts der letzten Änderung der Datei
            FileTime oldLastModified = Files.getLastModifiedTime(inventar);

            while (true) {
                // Warte für 1 Sekunde
                TimeUnit.MILLISECONDS.sleep(1000);

                // Ausgabe von Dateinamen, Größe und Zeitpunkt der letzten Änderung
                System.out.print(inventar.getFileName() + "[" + Files.size(inventar) + " Bytes] Letzte \u0041nderung: ");
                FileTime lastModifiedTime = Files.getLastModifiedTime(inventar);
                String formattedTime = formatDate(lastModifiedTime.toMillis());
                System.out.println(formattedTime);

                // Überprüfe, ob die Datei seit dem letzten Mal geändert wurde
                if (!oldLastModified.equals(lastModifiedTime)) {
                    // Aktualisiere den alten Zeitpunkt der letzten Änderung
                    oldLastModified = lastModifiedTime;

                    // Führe die Callback-Funktion aus
                    callback.accept(inventar);
                }
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    private static String formatDate(long millis) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(new Date(millis));
    }

    public static void main(String[] args) {
        // Definition einer Rückruffunktion, die aufgerufen wird, wenn die Datei geändert wird
        Consumer<Path> callback = (path) -> System.err.println("File changed " + path);

        // Erstellen einer Instanz des FileChangeWatcherWithConsumer und Starten des Überwachungsprozesses
        FileChangeWatcherWithConsumer changer = new FileChangeWatcherWithConsumer("TextFiles/Hooks.txt", callback);
        changer.run();
    }
}

