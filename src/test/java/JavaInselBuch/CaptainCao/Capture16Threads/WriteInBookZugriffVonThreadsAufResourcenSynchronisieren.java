package JavaInselBuch.CaptainCao.Capture16Threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class WriteInBookZugriffVonThreadsAufResourcenSynchronisieren {

  // Die Hauptmethode des Programms
  public static void main( String[] args ) throws InterruptedException {
    // Definition der Klasse FriendshipBook, die das Freundschaftsbuch repräsentiert
    class FriendshipBook {
      private final StringBuilder text = new StringBuilder(); // Ein StringBuilder für den Buchinhalt

      // Methode zum Hinzufügen eines einzelnen Zeichens zum Buchinhalt
      public void appendChar( char character ) {
        text.append( character );
      }

      // Methode zum Hinzufügen einer dekorativen Trennlinie zum Buchinhalt
      public void appendDivider() {
        text.append(
                "\n_,.-'~'-.,__,.-'~'-.,__,.-'~'-.,__,.-'~'-.,__,.-'~'-.,_\n" );
      }

      // Überschreiben der toString-Methode, um den gesamten Buchinhalt als String zurückzugeben
      @Override public String toString() {
        return text.toString();
      }
    }

    // Erstellen eines fair ReentrantLocks für die Synchronisation
    ReentrantLock lock = new ReentrantLock(true);

    // Definition der Klasse Author, die das Verhalten eines Autors repräsentiert
    class Author implements Runnable {
      private final String text; // Der vom Autor zu schreibende Text
      private final FriendshipBook book; // Das Freundschaftsbuch, in das der Autor schreibt

      // Konstruktor für die Author-Klasse
      public Author( String text, FriendshipBook book ) {
        this.text = text;
        this.book = book;
      }

      // Die run-Methode des Autors, die beim Starten des Threads ausgeführt wird
      @Override public void run() {
        lock.lock(); // Das Lock wird erworben, um synchronisierten Zugriff zu gewährleisten
        try {
          // Iteration durch den Text und Hinzufügen von Buchstaben zum Freundschaftsbuch
          for ( int i = 0; i < text.length(); i++ ) {
            book.appendChar( text.charAt( i ) );
            Thread.sleep( 1 ); // Kurze Verzögerung zur Simulation des Schreibens
          }
          book.appendDivider(); // Hinzufügen einer Trennlinie zum Buchinhalt
        }
        catch ( InterruptedException e ) { /* Ignorieren einer Unterbrechung */ }
        finally {
          lock.unlock(); // Das Lock wird freigegeben, unabhängig von Ausnahmen
        }
      }
    }

    // Erstellen eines FriendshipBook-Objekts
    FriendshipBook book = new FriendshipBook();

    // Texte, die von den Autoren geschrieben werden sollen
    String q1 = "Die Blumen brauchen Sonnenschein " +
            "und ich brauch Capatain CiaoCiao zum Fröhlichsein";
    String q2 = "Wenn du lachst, lachen sie alle. " +
            "Wenn du weinst, weinst du alleine";
    String q3 = "Wenn wir plündern, plündern wir alle!";

    // Erstellen und Starten von Threads für die Autoren mit ihren Texten
    new Thread(new Author(q3,book)).start();
    new Thread( new Author( q1, book ) ).start();
    new Thread( new Author( q2, book ) ).start();


    // Pause des Hauptprogramms für 1 Sekunde, um den Autoren Zeit zum Schreiben zu geben
    TimeUnit.SECONDS.sleep( 1 );

    // Ausgabe des gesamten Buchinhalts auf der Konsole
    System.out.println( book );
  }
}
