package JavaInselBuch.Beispiele.multithreading.InselBeispiele;

import java.util.concurrent.*;

public class sheduledExecutorServiceWithCallables {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);

        // Definiere mehrere Callable-Aufgaben
        Callable<String> task1 = () -> "Callable Task 1 has finished!";
        Callable<String> task2 = () -> "Callable Task 2 has finished!";
        Callable<String> task3 = () -> {
            Thread.sleep(2000); // Simuliere eine längere Berechnung
            return "Callable Task 3 has finished!";
        };

        // Plane die Ausführung der Callable-Aufgaben mit Future-Objekten
        ScheduledFuture<String> future1 = scheduler.schedule(task1, 1, TimeUnit.SECONDS);
        ScheduledFuture<String> future2 = scheduler.schedule(task2, 2, TimeUnit.SECONDS);
        ScheduledFuture<String> future3 = scheduler.schedule(task3, 3, TimeUnit.SECONDS);

        try {
            // Warte auf die Ergebnisse der Callable-Aufgaben
            String result1 = future1.get();
            String result2 = future2.get();
            String result3 = future3.get();

            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Beende den ScheduledExecutorService
        scheduler.shutdown();

    }
}
