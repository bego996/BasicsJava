package JavaInselBuch.Beispiele.multithreading.InselBeispiele;

public class UnbehandelteThreadException {
    public static void main(String[] args) throws InterruptedException {
        //Hier ist ein Lambda ausdruck möglich weil eigentlich die run methode vom Paramter Runnable festlegen. (Funktionales Interface). Wir haben dem thread auch gleich einen Namen gegeben.
        Thread thread = new Thread(() ->{
            System.out.println(Thread.currentThread());
            //Wen hier die ArithmeticException geworfen wird dan läuft der Main Thread dennoch weiter danach!
            System.out.println(1/0);
        },"KnallerThread");

        thread.start();
        System.out.println(thread.isAlive());
        Thread.sleep(1000);
        System.out.println(Thread.currentThread());
        System.out.println(thread.isAlive());
        //Mit getState() bekommen wir eine meldung über den aktuellen Zustand des Threads.
        //    NEW: Der Thread wurde erstellt, aber noch nicht gestartet.
        //    RUNNABLE: Der Thread ist entweder in Ausführung oder bereit zur Ausführung, d.h., er hat die CPU-Zeit erhalten oder wartet darauf, sie zu erhalten.
        //    BLOCKED: Der Thread ist blockiert und wartet auf eine Monitor-Sperre, um auf eine bestimmte Ressource zugreifen zu können.
        //    WAITING: Der Thread wartet auf eine andere Aktion, um fortzufahren.
        //    TIMED_WAITING: Der Thread wartet auf eine andere Aktion, jedoch für eine bestimmte Zeitdauer.
        //    TERMINATED: Der Thread ist beendet und nicht mehr aktiv.
        System.out.println(thread.getState());




    }
}
