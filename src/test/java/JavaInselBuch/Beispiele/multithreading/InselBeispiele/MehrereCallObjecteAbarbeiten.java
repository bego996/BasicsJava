package JavaInselBuch.Beispiele.multithreading.InselBeispiele;

import java.util.*;
import java.util.concurrent.*;

public class MehrereCallObjecteAbarbeiten {
     static class firstCallable implements Callable<int[]> {
        int[] list;

        firstCallable(int[] list) {
            this.list = list;
        }

        @Override
        public int[] call() throws Exception {
            Arrays.sort(list);
            return list;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] a = new int[5000];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(0,1000);
        }
        Callable<int[]> first = new firstCallable(a);
        Callable<int[]> second = new firstCallable(a);
        Callable<int[]> third = new firstCallable(a);
        //Alle Callables oben stammen von einer Klasse, testhalber.
        Collection<Callable<int[]>> callables = new ArrayList<>();
        callables.add(first);
        callables.add(second);
        callables.add(third);

        //Wir bauen wieder einen Thread Pool auf.
        ExecutorService sheduler = Executors.newCachedThreadPool();

        //Wenn wir mehrere Callable Objekte abarbeiten lassen wollen können wir mit invokeAll() von Future dies tun. Es gibt insgesamt noch 3 weitere solcher Methoden, mit unterschiedlichen funktionen.
        List<Future<int[]>> results = sheduler.invokeAll(callables,2,TimeUnit.SECONDS);

        sheduler.shutdown();

        //Trycatch wieder nötig um ergebnisse durch lambda auszugeben. get() wartet wieder auf das ergebniss wenn keine TimeUnit angegeben.
        results.forEach((result) -> {
            try {
                //Wir lesen nur index 500 aus aus der aktuellen future Liste.
                System.out.println(result.get()[500]);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Hier");
    }
}
