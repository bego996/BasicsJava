package JavaInselBuch.CaptainCao.Capture16Threads;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AmTischMitCaptainTeilnehmenMitSemaphoresynchronisiren {
    public static void main(String[] args) throws InterruptedException {
        // Erstelle eine Semaphore mit 4 Genehmigungen für den Tisch
        Semaphore tableChangeSignaler = new Semaphore(4);

        // Innere Klasse "Guest", die das Runnable-Interface implementiert
        class Guest implements Runnable {
            public final String guestName;
            //public final int hasSecondsToWait;
            //public final int hasTimeToSitAndDrink;

            public Guest(String guestName) {
                this.guestName = guestName;
            }

            /*// Konstruktor für Gast mit Name, Wartezeit und Sitzzeit
            public Guest(String guestName, int hasSecondsToWait, int hasTimeToSitAndDrink) {
                this.guestName = guestName;
                this.hasSecondsToWait = hasSecondsToWait;
                this.hasTimeToSitAndDrink = hasTimeToSitAndDrink;
            }*/

            @Override
            public void run() {
                System.out.println(guestName + " wartet auf einen Platz am Tisch");
                try {
                    // Zeitmessung starten
                    //long start = System.currentTimeMillis();

                    // Feste Sitzplatz-Wartezeit von 5 Sekunden
                    TimeUnit.SECONDS.sleep(5);

                    // Zeitmessung beenden
                    //long end = System.currentTimeMillis();

                    /* TODO: Uncomment this section to interrupt threads that wait too long
                    if ((end - start) / 1000 > hasSecondsToWait) {
                        Thread.currentThread().interrupt(); // Thread unterbrechen
                    }
                    */

                    // Genehmigung für den Tisch erhalten
                    tableChangeSignaler.acquire();

                    // Platz am Tisch bekommen
                    System.out.println(guestName + " hat einen Platz am Tisch bekommen");

                    // Zeit zum Sitzen und Trinken
                    TimeUnit.SECONDS.sleep(6);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                    //System.err.println(guestName + " hat zu lange warten müssen und ist abgebraust!");
                } finally {
                    // Genehmigung für den Tisch freigeben
                    tableChangeSignaler.release();

                    // Tisch verlassen
                    System.out.println(guestName + " hat den Tisch verlassen!");
                }
            }
        }

        // Erstelle eine Liste von Namen ohne Präfixe
        List<String> names = new ArrayList<>(Arrays.asList("Hook", "Barabas", "Nugget", "BlackEye", "Chrackie", "Cloud", "Proud", "Loud"));

        // Füge Präfixe "Admiral" und "Commander" für jeden Namen hinzu, es bleibt auch der standard name ohne präfixe enthalten.
        for (int i = 0, len = names.size(); i < len; i++) {
            Collections.addAll(names, "Admiral " + names.get(i), "Commander " + names.get(i));
        }

        // Erstelle einen ExecutorService mit 4 Threads
        ExecutorService scheduler = Executors.newScheduledThreadPool(4);

        // Führe für jeden Namen einen Thread (Guest) im ExecutorService aus
        names.forEach((name) -> scheduler.execute(new Guest(name)));

        /*// Erstelle vier Gäste mit verschiedenen Eigenschaften
        Guest firstGuest = new Guest("Hook", 11, 10);
        Guest secondGuest = new Guest("Barabas", 2, 13);
        Guest thirdGuest = new Guest("Nugget", 12, 12);
        Guest fourthGuest = new Guest("BlackEye", 4, 15);

        // Führe die Gäste im ExecutorService aus
        scheduler.execute(firstGuest);
        scheduler.execute(secondGuest);
        scheduler.execute(thirdGuest);
        scheduler.execute(fourthGuest);
        */

        // Beende den ExecutorService nachdem die Aufgaben erledigt sind
        scheduler.shutdown();
    }
}

