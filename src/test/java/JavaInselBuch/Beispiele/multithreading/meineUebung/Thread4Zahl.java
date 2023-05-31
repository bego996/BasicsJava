package JavaInselBuch.Beispiele.multithreading.meineUebung;

public class Thread4Zahl implements Runnable {
    @Override
    public void run() {
        rekursivMethode(10);
    }
    public void rekursivMethode(int zahl) {
        if (zahl == 0) {
            return;
        }
        System.out.print( zahl + " ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        rekursivMethode(zahl - 1);
        System.out.print(zahl + " ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
