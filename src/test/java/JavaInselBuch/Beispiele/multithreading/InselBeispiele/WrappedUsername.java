package JavaInselBuch.Beispiele.multithreading.InselBeispiele;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class WrappedUsername {


    //dieses Beispiel zeigt wie man ein callable mit rückgabe oder auch Runnable ohne Rückgabe mit einem FutureTask ummanteln kann um dadurch wie hier: den Rückgabewert zu bearbeiten sobald er bereit steht
    // und plus dazu noch eine Meldung auszugeben wenn diese Aufgabe erledigt ist im ThreadPool! wichtig wieder merken , wir nutzten kein Thread Objekt mehr , weil wir mit ExecutionService einen Thread Pool aufbauen.
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<String> username = () -> System.getProperty("user.name"); //getProperty(*) gibt den Namen des Computers aus, also meinen "bego".
        FutureTask<String> wrappedUsername = new FutureTask<>(username) {
            @Override
            protected void done() { //Hier bekommen wir Meldung automatisch wenn der Thread fertig gearbeitet hatt.
                try {
                    System.out.printf("done: isDone = %s, isCancelled = %s%n", isDone(), isCancelled());
                    System.out.println("done: get = " + get()); //get() ist eine Methode von TimerTask und wartet bis ergebnis fertig ist.
                } catch (InterruptedException | ExecutionException e) { /* Ignore */ }
            }

            @Override
            protected void set(String s) { //Diese überschreiben ist optional um den Rückgabewert nochmal zu bearbeiten.
                //System.out.println("set: " + s);
                super.set(s.toUpperCase());
            }
        };
        ExecutorService scheduler = Executors.newCachedThreadPool(); //Erstellen vom Thread Pool.
        scheduler.submit(wrappedUsername);
        //System.out.println("main: " + wrappedUsername.get());
        scheduler.shutdown();

        //Die ausgabe bei der Konsole ist immer durcheinander. Es wird zuerst set() dann done() aufgerufen.
    }
}
