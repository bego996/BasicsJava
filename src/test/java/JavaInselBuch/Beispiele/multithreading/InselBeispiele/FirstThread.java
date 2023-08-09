package JavaInselBuch.Beispiele.multithreading.InselBeispiele;

import java.util.concurrent.TimeUnit;

public class FirstThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new DateCommand(),"Erster Thread");
        thread.start();

        Thread thread2 = new Thread(new CounterCommand(),"Zweiter Thread");
        thread2.start();

        System.out.println(thread.getName());
        System.out.println(thread2.getName());
        System.out.println(thread.getState());
        System.out.println(thread2.getState());



        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){}

        System.out.println("Hier");

        //Wir können Timeunit oder oben ohne verwenden um den Main Thread schlaffen zu lassen.
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){}

        System.out.println("Hier");
    }

}
