package JavaInselBuch.CaptainCao.Capture16Threads;

import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionsAuffangen {
    public static void main(String[] args) throws MalformedURLException {
        //Das ist nützlich um festzulegen was bei unbehalndelten exceptions passieren sollen ohne das die JVM im schlimmsten Fall abstürzt.
        //Diese zwei Threads geben unbehandelte ausnahmen an den globalen Unchaugt Exception Handler wir brauchen um einen globalen handler zu erstellen Thread.setDefaultUncaughtExceptionHandler()
        //Der globale Handler gilt für alle Threads in der main Methode , pfalls diese nicht mit einem lokalen versehen werden.
        Thread.setDefaultUncaughtExceptionHandler((t,e) -> System.err.println("Unbehandelte ausnahme im Thread "+t.getName()+";"+e.getMessage()));
        Thread fuerGlobalHandler = new Thread(() -> System.out.println(1/0));
        fuerGlobalHandler.start();
        Thread fuerGlobalHanler2 = new Thread(() -> System.out.println(1/0));
        fuerGlobalHanler2.start();

        //Hier definieren wir einen lokalen handler und somit hatt dieser thread nichts mehr mit dem globalen von oben zu tun. Thread.UncaughtExceptionHandler()
        Thread.UncaughtExceptionHandler lokalHandler = (t, e) -> System.out.println(t +" ------------ "+ e.getMessage());
        Thread fuerLokalHandler = new Thread(() -> {throw new RuntimeException("Unbehandelte Ausnahme!");});
        fuerLokalHandler.setUncaughtExceptionHandler(lokalHandler);
        fuerLokalHandler.start();

        //Hier definieren wir einen weiteren lokalen handler und somit hatt dieser thread nichts mehr mit dem globalen von oben zu tun. Thread.UncaughtExceptionHandler()
        //Dieser Ignoriert jedoch die Ausnahme und gibt auch keine Meldung zurück. Keine Ausgabe auf der Konsole!
        Thread.UncaughtExceptionHandler lokalHandler2 = (t, e) -> {};
        Thread fuerLokalHandler2 = new Thread(() -> System.out.println(1/0),"Third");
        fuerLokalHandler2.setUncaughtExceptionHandler(lokalHandler2);
        fuerLokalHandler2.start();

        //Main Thread ausgeben
        System.out.println(Thread.currentThread());
        //Hier wird wieder unsel globaler handler aufgerufen weil main throws *Exception enthält. Dadurch gibt die main Methode die exception an die Jvm weiter.
        new URL("captain");
    }
}
