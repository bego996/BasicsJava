package JavaInselBuch.Beispiele.multithreading.InselBeispiele;

import java.time.LocalDate;

class JoinTheThread {

  public static void main( String[] args ) throws InterruptedException {

    class JoinerRunnable implements Runnable {
      public int result;

      @Override
      public void run() {
        result = LocalDate.now().getDayOfYear();
      }
    }

    class JoinerRunnable2 implements Runnable{
      public int result;
      @Override
      public void run() {
        result = LocalDate.now().getDayOfMonth();
      }
    }

    JoinerRunnable runnable = new JoinerRunnable();
    JoinerRunnable2 runnable2 = new JoinerRunnable2();
    Thread thread = new Thread( runnable );
    Thread thread2 = new Thread(runnable2);
    //Hier können wir die priorität des Threads angeben von 1 bis 10(Max)Der Sheduler(Planer) kann dan entscheiden welchem Thread er bevorzugen soll wenn dieser auch Rechenzeit wartet. Default einstellung ist 5.
    thread.setPriority(1);
    thread2.setPriority(Thread.MAX_PRIORITY);
    thread.start();
    thread2.start();
    //Wenn wir hier auf beide Threads mit join warten , dann ist die reichenfolge egal und wir warten auf den langsamsten.
    thread.join();
    thread2.join();
    System.out.println( runnable.result );
    System.out.println(runnable2.result);
    System.out.println(thread2.getPriority());
  }
}
