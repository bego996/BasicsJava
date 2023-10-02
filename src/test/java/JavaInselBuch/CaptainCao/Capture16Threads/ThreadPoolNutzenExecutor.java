package JavaInselBuch.CaptainCao.Capture16Threads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolNutzenExecutor {

    public static void main(String[] args) throws InterruptedException {

        // Definition einer inneren Klasse "CrewMember", die das Runnable-Interface implementiert
        class CrewMember implements Runnable {

            private final String actualGift;

            // Konstruktor der inneren Klasse, der den Namen des Geschenks von "Bony" (vermutlich ein Charakter im Kontext des Codes) erhält
            CrewMember(String giftFromBony) {
                actualGift = giftFromBony;
            }

            // Implementierung der run-Methode des Runnable-Interfaces
            @Override
            public void run() {
                try {
                    // Zufällige Wartezeit zwischen 1 und 5 Sekunden
                    int randomWait = new Random().nextInt(1, 5);

                    // Ausgabe, dass das Geschenk verteilt wird und wie lange gewartet wird
                    System.out.println(actualGift + " In Verteilung..." + randomWait + " Sekunden Wartezeit...");

                    // Warten für die zufällige Zeit
                    TimeUnit.SECONDS.sleep(randomWait);

                    // Ausgabe, dass das Geschenk verteilt wurde und wie lange es gedauert hat
                    System.out.println(actualGift + " wird verteilt! " + randomWait + " Sekunden sind um!");

                    // Ausgabe von Thread-Informationen (Name) und Zeilenumbruch
                    System.out.println(Thread.currentThread() + " " + Thread.currentThread().getName());
                    System.out.println();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // Erstellung eines Iterators für die Namen der Crewmitglieder
        Iterator<String> crewNames = Arrays.asList("Paul", "Charlie", "Fritz").iterator();

        // Erstellung eines ThreadPoolExecutor-Objekts mit einer Cache-Arbeitsgruppe (dynamische Größe)
        ExecutorService threadPool = Executors.newCachedThreadPool(r -> {
            Thread thread = new Thread(r);

            // Hinzufügen eines UncaughtExceptionHandler für den Thread, um unbehandelte Ausnahmen auszugeben, ist wenn man execute() anstatt submit() verwendet. submit() wird verwendet wenn man einen Rückgabewert erwartet und ececute ist void.
            //execute: Die execute-Methode wird keine Ausnahme direkt an den Aufrufer weitergeben. Wenn ein Thread eine Ausnahme wirft, wird sie im ExecutorService behandelt und in der Regel auf die Standardausgabe oder einen UncaughtExceptionHandler des ExecutorService geschrieben.
            //submit: Die submit-Methode kann Ausnahmen als ExecutionException im Aufrufer werfen, wenn der ausgeführte Thread eine Ausnahme wirft. Du kannst diese Ausnahme abfangen und die ursprüngliche Ausnahme durch e.getCause() abrufen.
            thread.setUncaughtExceptionHandler((t, e) -> System.err.println("Unbehandelte Exception im Thread " + t.getName() + " " + e.getMessage()));

            // Setzen des Namens des Threads auf den nächsten Namen aus dem Iterator
            thread.setName(crewNames.next());
            return thread;
        });

        // Array von Geschenken
        String[] gifts = {"apfel", "marshmallow", "pineapple", "orange", "eggs", "bonbons", "cashews"};

        // Schleife zur Durchführung der Geschenkübergabe an die Crewmitglieder
        for (int i = 0; i < gifts.length; i++) {
            // Zufällige Verzögerung zwischen 1 und 3 Sekunden, bevor das Geschenk übergeben wird
            int bonyDelay = new Random().nextInt(1, 3);

            // Ausgabe, dass das Geschenk übergeben wird und wie lange die Verzögerung ist
            System.out.println(gifts[i] + " wird an die Crew übergeben... mit " + bonyDelay + " Sekunden Verzögerung...");

            // Warten für die zufällige Verzögerungszeit
            TimeUnit.SECONDS.sleep(bonyDelay);

            // Ausführen des CrewMember-Runnables im ThreadPool
            threadPool.execute(new CrewMember(gifts[i]));

            // Ausgabe, dass das Geschenk übergeben wurde und Thread-Informationen (Name)
            System.out.println(gifts[i] + " übergeben!");
            System.out.println(Thread.currentThread() + " " + Thread.currentThread().getName());
            System.out.println();
        }

        // Beenden des Threadpools
        threadPool.shutdown();
    }
}


