package JavaInselBuch.Beispiele.multithreading.testUebung;

public class ThreadMaker {
    //Aufgabe: Code bekommen und im Hiuntegrund ausführen.
    //Methode erstellen die das runnable Interface verlangt und ausführt.
    public static void lassImHintergrundLaufen(Runnable runnable){
        //Wir erstellen einen neuen Thread und übergeben unser Runnable Interface, danach mit Thread.start wird der Thread ausgeführt..
        Thread thread = new Thread(runnable);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void lassZweiImHintergrundLaufen(Runnable runnable){
        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
