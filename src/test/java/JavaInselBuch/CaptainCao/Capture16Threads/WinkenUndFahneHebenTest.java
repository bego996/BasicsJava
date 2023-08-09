package JavaInselBuch.CaptainCao.Capture16Threads;

import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class WinkenUndFahneHebenTest {
    public static void main(String[] args) {
        Runnable fahneHeben = () -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("Fahne " + Thread.currentThread());
            }
        };
        Runnable winken = new WinkenMiRunnable();
        Thread linkeHand = new Thread(winken, "Linke Hand");
        Thread rechteHand = new Thread(fahneHeben, "Rechte Hand");
        linkeHand.start();
        rechteHand.start();
        System.out.println(Thread.currentThread());

        //Das unten nur testhalber um im TaskManager zu sehen wieviel Threads laufen und um den Arbeitsspeicher zu beobachten.
        /*
        Runnable[] runnables = new Runnable[400000];
        Arrays.fill(runnables, fahneHeben);
        Thread[] threads = new Thread[runnables.length];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnables[i]);
        }
        for (Thread thread : threads) {
            thread.start();
        }

         */


    }
}

