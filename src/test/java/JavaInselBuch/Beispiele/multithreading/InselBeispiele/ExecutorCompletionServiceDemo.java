package JavaInselBuch.Beispiele.multithreading.InselBeispiele;

import java.util.List;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorCompletionServiceDemo {
  public static void main( String[] args ) {
    //Der Vorteil gegebnüber des Future Objects um Werte einzusammeln wenn sie fertig sind ist, dass man mit Completionservice<> ein runnable oder callable dessen werte erst einsammeln wenn sie fertig sind. Die werte werden in einem Queue gesammelt.

    ExecutorService executor = Executors.newCachedThreadPool();
    CompletionService<Integer> completionService = new ExecutorCompletionService<>( executor );
    List.of( 5,4, 3, 2, 1 ).forEach( duration -> completionService.submit( () -> { //Hier erstellen wir eine Liste mit 5 callable objecten die einen wert nach einer bestimmten zeit zurückgeben also, 1,2,3,4,5. Es wird an das Queue von CompletionService oben gegeben.
      TimeUnit.SECONDS.sleep( duration ); //Hier schlafen die Threads für ihre oben angegebene zahl , für 5 sind es fünf sekunden.
      return duration; //Die Zahl mit dessen zeitwert in Sekunden wird zurückgegeben ins Queue.
    } ) );


    for ( int i = 0; i < 5; i++ ) { //Wit iterieren über die Queue länge von completion Service und können fertige Werte entnehmen und aus dem Que entfernen lassen oder auch eine Zeitbeschränkung angeben mit z. B. pool()..
      try {
        System.out.println( completionService.take().get() ); //Hier entnehmen wir die fertigen werte. es gibt neben take() die die Werte einsammelt dioe fertig sind auch pool() etc..
      }
      catch ( InterruptedException | ExecutionException e ) {
        e.printStackTrace();
      }catch (NullPointerException e){
        System.out.println("null");
      }
    }
    executor.shutdown(); //Den executor immer herunterfahren nach der Arbeit.

    System.out.println("Hier"); //Hier ist wichtig anzumerken das der Main Thread hier nicht parallel zum Thread Pool oben ausgeführt wird. Es ist jedoch möglich wenn man für diese Zeile einen eigenen thread erstellt , der wiederum parallel mit dem Pool läuft.


  }
}
