package JavaInselBuch.Beispiele.multithreading.testUebung;

public class Main {
    public static void main(String[] args) {
        //Multithreading
        //Website -> Programm -> DB
        //Es können mehrere Threads gleichzeitig abarbeiten. Wenn zb auf einer Website mehrere anfragen zugleich zum abarbeiten sind.
        //Es gibt immer ein Hauptprogramm , den "Main Thread".

        //Erste möglichkeit einen Thread zu erstellen.
        //Eine Klasse erstellen die von Thread erbt und dan dessen run Methode Überschreiben.
        MyThread thread = new MyThread();
        //Thread.start() benutzen für Multithreading und nicht Thread.run
        thread.start();
        System.out.println("Hier!");
        System.out.println("Hier2!");

        //Zweite Möglichkeit einen Thread zu erstellen.
        //Wir implementieren in einer eigenen Klasse das Interface "Runnable" und überschreiben derren Methode.
        //Zuerst ein Runnable Object erstellen und danach einen Thread erstellen, dem wir unser runnable übergeben.
        //Die 2.te option wird meist in der Praxis verwendet. Siehe Klasse ThreadMaker und Main2.
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        System.out.println("Hier4");
        thread2.start();
        System.out.println("Hier3!");



    }
}
