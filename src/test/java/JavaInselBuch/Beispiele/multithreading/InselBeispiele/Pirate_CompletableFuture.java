package JavaInselBuch.Beispiele.multithreading.InselBeispiele;

import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

class Pirate_CompletableFuture {

  public static void main( String[] arg ) throws Throwable {

    System.setProperty( "java.util.logging.SimpleFormatter.format", "-> %2$s: %5$s %6$s%n");

    // Startet eine asynchrone Aktion, um einen neuen Namen für den Piraten zu erstellen
    String result =
            CompletableFuture.supplyAsync( Pirate_CompletableFuture::newName )
                    // Wendet die "swear" Methode auf den Namen des Piraten an
                    .thenApply( Pirate_CompletableFuture::swear )
                    // Kombiniert das Ergebnis von "drinkRum()" mit dem Ergebnis der vorherigen Aktion
                    .thenCombine( drinkRum(), Pirate_CompletableFuture::combinePiratAndDrinks )
                    // Kombiniert das Ergebnis von "drinkRum()" mit dem Ergebnis der vorherigen Aktion
                    .thenCombine( drinkRum(), Pirate_CompletableFuture::combinePiratAndDrinks )
                    // Behandelt eine Ausnahme und gibt eine alternative Nachricht zurück
                    .exceptionally( e -> "Pirat Guybrush hat den Todesfluch '" +
                            e.getCause().getMessage() + "' nicht überlebt" )
                    .get();
    System.out.println( result );
  }

  // Erstellt einen neuen Namen für den Piraten
  static String newName() {
    Logger.getGlobal().info( Thread.currentThread().getName() );
    return "Pirat Guybrush";
  }

  // Lässt den Piraten fluchen; in manchen Fällen wirft es eine Ausnahme
  static String swear( String pirate ) {
    Logger.getGlobal().info( Thread.currentThread().getName() );
    if ( Math.random() < 0.4 )
      throw new IllegalStateException( "Avada Kedavra" );
    return pirate + " flucht";
  }

  // Simuliert das Trinken von Rum; gibt die Anzahl der Sekunden der aktuellen Uhrzeit zurück
  static CompletableFuture<Integer> drinkRum() throws InterruptedException {
    Logger.getGlobal().info( Thread.currentThread().getName() );
    TimeUnit.SECONDS.sleep( 1 );
    return CompletableFuture.supplyAsync( () -> LocalTime.now().getSecond() );
  }

  // Kombiniert den Namen des Piraten und die Anzahl der getrunkenen Rums
  static String combinePiratAndDrinks( String pirat, int bottlesOfRum ) {
    Logger.getGlobal().info( Thread.currentThread().getName() );
    return pirat + " und trinkt dann " + bottlesOfRum + " Flaschen Rum";
  }
}
