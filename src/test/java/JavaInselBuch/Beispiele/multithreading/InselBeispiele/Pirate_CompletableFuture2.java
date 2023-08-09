package JavaInselBuch.Beispiele.multithreading.InselBeispiele;

import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Pirate_CompletableFuture2 {
    public static void main(String[] args) throws Throwable {

        // Setze das Logging-Format für die Konsolenausgabe
        System.setProperty("java.util.logging.SimpleFormatter.format", "-> %2$s: %5$s %6$s%n");

        // Erstelle ein CompletableFuture, um den Namen des Piraten asynchron zu generieren
        CompletableFuture<String> pirateNameFuture = CompletableFuture.supplyAsync(Pirate_CompletableFuture2::newName);

        // Wendet die "swear" Methode asynchron auf den Piratennamen an
        CompletableFuture<String> swearingFuture = pirateNameFuture.thenApply(Pirate_CompletableFuture2::swear);

        // Erstelle zwei CompletableFuture-Instanzen, um asynchron das Trinken von Rum zu simulieren
        CompletableFuture<Integer> drinkRumFuture1 = CompletableFuture.supplyAsync(Pirate_CompletableFuture2::drinkRum);
        CompletableFuture<Integer> drinkRumFuture2 = CompletableFuture.supplyAsync(Pirate_CompletableFuture2::drinkRum);

        // Kombiniere das Ergebnis des Fluchens und des Trinkens von Rum in der "combinedFuture"
        CompletableFuture<String> combinedFuture = swearingFuture
                .thenCombine(drinkRumFuture1, Pirate_CompletableFuture2::combinePiratAndDrinks)
                .thenCombine(drinkRumFuture2, Pirate_CompletableFuture2::combinePiratAndDrinks)
                .exceptionally(e -> "Pirat Guybrush hat den Todesfluch '" +
                        e.getCause().getMessage() + "' nicht überlebt");

        // Warte auf das Endergebnis der Kette und gib es aus
        String result = combinedFuture.get();
        System.out.println(result);
    }

    // Erzeugt einen neuen Namen für den Piraten
    static String newName() {
        Logger.getGlobal().info(Thread.currentThread().getName());
        return "Pirat Guybrush";
    }

    // Lässt den Piraten fluchen; wirft in einigen Fällen eine Ausnahme
    static String swear(String pirate) {
        Logger.getGlobal().info(Thread.currentThread().getName());
        if (Math.random() < 0.4)
            throw new IllegalStateException("Avada Kedavra");
        return pirate + " flucht";
    }

    // Simuliert das Trinken von Rum; gibt die Sekunden der aktuellen Uhrzeit zurück
    static Integer drinkRum() {
        Logger.getGlobal().info(Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(1); // Verzögerung simulieren
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return LocalTime.now().getSecond();
    }

    // Kombiniert den Piratennamen und die Anzahl der getrunkenen Rums zu einer Nachricht
    static String combinePiratAndDrinks(String pirate, int bottlesOfRum) {
        Logger.getGlobal().info(Thread.currentThread().getName());
        return pirate + " und trinkt dann " + bottlesOfRum + " Flaschen Rum";
    }
}
