package JavaInselBuch.Beispiele.multithreading.InselBeispiele;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.*;


//Mit callable anstatt Runable können wir die methode call überschreiben die auch einen Ruckgabewert geben kann, unterschied zu runnable.
public class SorterCallable implements Callable<byte[]> {

    private final byte[] b;

    SorterCallable(byte[] b) {
        this.b = b;
    }

    @Override
    public byte[] call() {
        //while (true) {}  ----Auskommentiert weil nur als testzweck genutzt um eine TimeoutException durch zu eine Dauerschleife zu provozieren.
        Arrays.sort(b);
        return b;

    }

    //Hier der Test des Callables...
    public static void main(String[] args) {
        byte[] bytes = new byte[5000];
        //Kurze methode um das Byte array mit zufälligen werten zu fühlen, länge wird voll ausgenutzt.
        new Random().nextBytes(bytes);
        //Wir erstellen ein Callable und einen Konstruktor unserer SorterCallableKlasse die Callable implementiert und geben in den Parameter den Byte array.
        //Nicht vergessen , wir sortieren das Array in unserer SorterCallable Klasse und deswegen ist am Anfang des Arrays der kleinste Wert.
        Callable<byte[]> c = new SorterCallable(bytes);

        //Wir erstellen einen ThreadPool.
        ExecutorService executor = Executors.newCachedThreadPool();

        //Mit der Executor Methode Submit können wir ein callable übergeben und für diese einen Thread im Pool sucht und executed , mit get() können wir später den rückgabewert des Callables ausgeben lassen.
        //Wir brauchen Future für den Endwert der Rückgabe und es gibt future auch für Runnable, gibt aber nur zurück ob Runnable fertig ist oder nicht.
        //Sobald wir ein callable oder runnable übergeben haben in submit() können wir andere Arbeiten fortsetzten und die Ergebnisse später mit get() abfragen.
        // future hatt unter im try block eine große bedeutung und es gibt mehr methoden als nur get. Um z.b. zu erfragen mit isDone() ob die Arbeit beendet oder gar unterbrochen wurde.
        Future<byte[]> result = executor.submit(c);

        System.out.println(result.isDone());


        //Immer gleiches Muster als Programmierer: Eine Arbeit an den ExecutorService übergeben, dann etwas anderes machen und später zurückkommen um Ergebniss abzuchecken!
        //Hier kann weitergearbeitet werden und bei Bedarf dan der TryCatch block unten genutzt werden um Ergebnisse zu erhalten.

        try {
            //get() wartet bis under Callable fertig abgearbeitet hatt und gibt erst dan das ergebniss zurück, wir speichern es wieder in ein Byte Array um es in der nächsten Zeile auszugeben.
            //byte[] bs = result.get();
            byte[] bs = result.get(5, TimeUnit.SECONDS); //Wenn wir get eine Zeiteinheit übergeben, dann wird nur solange gewarted bis arbeit fertig ist und pfalls nicht dann folgt eine TimeoutException.
            System.out.printf("%d, %d, %d %d %d%n", bs[0], bs[1000], bs[2000], bs[3000], bs[bs.length - 1]);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) { //Diese Exception ist nur nötig wen get mit Zeitangabe genutzt wird.
            System.err.println("5 Sekunden sind um, die Arbeit ist nicht erledigt!");
        }

        System.out.println(result.isDone());

        executor.shutdown();


    }
}
