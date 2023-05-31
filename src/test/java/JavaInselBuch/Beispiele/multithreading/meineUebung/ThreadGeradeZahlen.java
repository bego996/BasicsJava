package JavaInselBuch.Beispiele.multithreading.meineUebung;

public class ThreadGeradeZahlen implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 28; i +=3) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

