package JavaInselBuch.CaptainCao.Capture16Threads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class WebResourceLastModifiedCallable implements Callable<ZonedDateTime> {
    private final URL url;

    public WebResourceLastModifiedCallable(URL url) {
        this.url = url;
    }

    @Override
    public ZonedDateTime call() throws IOException {
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        long dateTime = con.getLastModified();
        con.disconnect();

        // Erstellt ein ZonedDateTime-Objekt aus dem erhaltenen Epoch Milliseconds, in UTC-Zeitzone
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(dateTime), ZoneId.of("UTC"));
    }

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        // Erstelle Callable-Objekte für zwei Webressourcen
        Callable<ZonedDateTime> first = new WebResourceLastModifiedCallable(new URL("http://www.tutego.de/index.html"));
        Callable<ZonedDateTime> second = new WebResourceLastModifiedCallable(new URL("https://en.wikipedia.org/wiki/Main_Page"));

        // Sammle Callable-Objekte in einer Sammlung
        Collection<Callable<ZonedDateTime>> collection = new ArrayList<>();
        collection.add(first);
        collection.add(second);

        // Erstelle ExecutorService (ThreadPool)
        ExecutorService scheduler = Executors.newCachedThreadPool();

        // Starte die Callable-Aufgaben im ThreadPool
        List<Future<ZonedDateTime>> list = scheduler.invokeAll(collection);

        // Beende den ThreadPool
        scheduler.shutdown();

        // Iteriere über die Ergebnisse der Future-Objekte
        list.forEach((results) -> {
            try {
                // Hole das Ergebnis (die Websiteänderungszeit) mit einem Timeout von 1 Sekunde
                ZonedDateTime websiteChangeTime = results.get(1, TimeUnit.SECONDS);

                // Aktuelle Zeit in UTC-Zeitzone
                ZonedDateTime currentTimeUTC = ZonedDateTime.now(ZoneId.of("UTC"));

                // Berechne die Dauer zwischen Websiteänderungszeit und aktueller Zeit
                Duration duration = Duration.between(websiteChangeTime, currentTimeUTC);

                // Gib das Ergebnis aus
                System.out.println("Website Change Time: " + websiteChangeTime);
                System.out.println("Current Time (UTC): " + currentTimeUTC);
                System.out.println("Total duration between Website Change Time and the current time: " + duration.toMinutes() + " Minutes");
            } catch (InterruptedException | ExecutionException | TimeoutException ex) {
                ex.printStackTrace();
            }
        });
    }
}
