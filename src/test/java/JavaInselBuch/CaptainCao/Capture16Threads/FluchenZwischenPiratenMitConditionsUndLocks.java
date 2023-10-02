package JavaInselBuch.CaptainCao.Capture16Threads;


import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FluchenZwischenPiratenMitConditionsUndLocks {
    public static void main(String[] args) {

        // Ein Lock und eine Condition werden erstellt, um Threads zu synchronisieren
        Lock resourceLocker = new ReentrantLock();
        Condition condition = resourceLocker.newCondition();

        // Definition der Insulter-Klasse als innere Klasse, die Runnable implementiert
        class Insulter implements Runnable {
            private final String[] insults;
            private final String captainName;

            public Insulter(String[] insults, String captainName) {
                this.captainName = captainName;
                this.insults = insults;
            }

            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        resourceLocker.lock();  // Lock wird erworben
                        Thread.sleep(ThreadLocalRandom.current().nextInt(1000));  // Zufällige Wartezeit
                        Thread.currentThread().setName(captainName);  // Name des Threads wird gesetzt
                        String name = Thread.currentThread().getName();
                        int rndInsults = ThreadLocalRandom.current().nextInt(insults.length);
                        System.out.println(name + ": " + insults[rndInsults]);  // Beleidigung wird ausgewählt und ausgegeben
                        condition.signal();  // Ein anderes wartendes Thread wird aufgeweckt
                        condition.await();   // Dieser Thread wartet, bis er erneut aufgeweckt wird
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();  // Interrupt-Status des Threads wird wieder gesetzt
                    } finally {
                        resourceLocker.unlock();  // Lock wird freigegeben
                    }
                }
            }
        }

        // Beleidigungsarrays für beide Kapitäne
        String[] insults1 = {
                "Trollop", "You have the manners of a trump",
                "You fight like a cow cocky", "Prat",
                "Your face makes onions cry",
                "You are so full of s**t, the toilet’s jealous"
        };
        String[] insults2 = {
                "Wazzock", "I've spoken with rats more polite than you",
                "Chuffer", "You make me want to spew",
                "Check your lipstick before you come for me",
                "You are more disappointing than an unsalted pretzel"
        };

        // ScheduledExecutorService zur Ausführung der Insulter-Threads
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // Zwei Insulter-Threads werden gestartet
        scheduler.execute(new Insulter(insults1, "Captain Hook"));
        scheduler.execute(new Insulter(insults2, "Captain Barabas"));

        try {
            // Das Hauptprogramm wartet bis zu 10 Sekunden auf das Beenden der Threads
            if (!scheduler.awaitTermination(10, TimeUnit.SECONDS)) {
                System.err.println("Genug beleidigt für heute!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Alle Threads werden beendet
        scheduler.shutdownNow();
    }
}


