package JavaInselBuch.Beispiele.multithreading.InselBeispiele;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Mit Thread Pools können wir Threads kontrollieren auch mehrere Pools erstellen.
public class ThreadPoolDemo {
  
  public static void main( String[] args ) throws InterruptedException {
    Runnable r1 = () -> {
      System.out.println( "1.1 " + Thread.currentThread().getName() );
      System.out.println( "1.2 " + Thread.currentThread().getName() );
    };
    
    Runnable r2 = () -> {
      System.out.println( "2.1 " + Thread.currentThread().getName() );
      System.out.println( "2.2 " + Thread.currentThread().getName() );
    };

    Runnable r3 = () -> {
      //Mit getName bekommen wir den Pool sowie desen thread nummer geliefert.
      System.out.println( "3.1 " + Thread.currentThread().getName() );
      System.out.println( "3.2 " + Thread.currentThread().getName() );
    };

    //ExecutorService service erbt vom iinterface Executor und hatt mehr methoden. Wir können anstatt immer einen Thread objekt zu erstellen jedes runnable in diesen Thread Pool von Executor abarbeiten lassen, parallel.
    //Es lässt sich auch die anzahl der threads in einem Pool beschränken.
    //Mit newChachedThreadPool können wächst der Pool
    ExecutorService executor = Executors.newCachedThreadPool();

    executor.execute( r1 );
    executor.execute( r2 );
    executor.execute(r3);

    Thread.sleep( 500 );
    //Mit isShutdown() bekommen wir einen boolean zurück ob der Pool heruntergfahren ist.
    System.out.println(executor.isShutdown());


    executor.execute( r1 );
    executor.execute( r2 );
    executor.execute(r3);

    //Mit shutdown fahren wir den Pool herunter, laufende Threads werden aber nicht abgebrochen, aber neue nicht mehr angenommen.
    executor.shutdown();

    //Mit shutDownNow werden alle runnables gestopt und der Pool heruntergefahren, es wird auch eine Liste von Runabbles zurückgegeben die beendet wurden.
    executor.shutdownNow();



  }
}
