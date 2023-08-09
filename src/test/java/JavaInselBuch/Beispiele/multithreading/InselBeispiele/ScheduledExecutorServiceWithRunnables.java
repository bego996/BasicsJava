package JavaInselBuch.Beispiele.multithreading.InselBeispiele;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceWithRunnables {
  //Diese Methode kann man nutzen wenn wiederholende Aufgaben und Zeitsteuerung bei dem abarbeiten von Threads im Pool nutzen will.
  //Im Vergleich zu manueller Thread-Erstellung und Zeitplanung bietet der ScheduledExecutorService also eine effiziente und benutzerfreundliche Möglichkeit, Aufgaben zu planen und auszuführen, insbesondere wenn es um periodische oder zeitverzögerte Aufgaben geht.

  public static void main( String[] args ) {
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);

    scheduler.scheduleAtFixedRate(() -> System.out.println( "Tata" ), 1, 2, TimeUnit.SECONDS);
    scheduler.scheduleAtFixedRate(() -> System.out.println( "Another Task" ), 1, 2, TimeUnit.SECONDS);
    scheduler.scheduleAtFixedRate(() -> System.out.println( "Yet Another Task" ), 1, 5, TimeUnit.SECONDS);
    scheduler.scheduleAtFixedRate(() -> System.out.println( "Fourth Task" ), 1, 5, TimeUnit.SECONDS);


    try {
      // Warte bis alle Aufgaben abgeschlossen sind oder ein Timeout erreicht wird
      if (!scheduler.awaitTermination(10, TimeUnit.SECONDS)) {
        // Hier könntest du weitere Maßnahmen ergreifen, wenn das Warten zu lange dauert
        System.out.println("Das Warten auf die Aufgaben wurde beendet.");
      }
    } catch (InterruptedException e) {
      // Hier könntest du auf die Unterbrechung reagieren
      e.printStackTrace();
    }

    scheduler.shutdown();
  }
}