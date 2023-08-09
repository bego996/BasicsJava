package JavaInselBuch.CaptainCao.Capture16Threads;

public class WinkenUndFahneRunnableZweiteLoesung {
    //Lamdba ausdrücke können auf lokale variablen Zugreifen wie hier. es wäre nicht möglich mit ObjektVariablen.
    public static Runnable getPrintingRunnable(String text,int repetitions){ //Diese Methoden sind Fabrikmethoden und sind alternativen zu Konstruktoren.
        return () -> { //Ein Lambda um die run() Methode von Runnable direkt zu überschreiben und ein Runnable zurückzugeben an den Aufrufer der Methode.
            for (int i = 0; i < repetitions ; i++) {
                System.out.printf("%s; %s%n",text,Thread.currentThread());
            }
        };
    }

    public static void main(String[] args) {
        Runnable runnable = getPrintingRunnable("winker",30);
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
