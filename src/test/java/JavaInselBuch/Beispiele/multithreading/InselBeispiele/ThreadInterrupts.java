package JavaInselBuch.Beispiele.multithreading.InselBeispiele;

public class ThreadInterrupts {
    //Mit interrupts kann man einen thread dazu auffordern zu beenden oder je nachdem was man in die runnable prorammiert. Wird üblicherweiße in einer while schleife abgefragt wie unten, ob ein interuppt anfragt.
    public static void main(String[] args) throws InterruptedException {
        Runnable killingMeSoftly = () -> {
            System.out.println("Es gibt ein Leben nach dem Tod");

            while (!Thread.currentThread().isInterrupted()){
                System.out.println("Und er läuft und er läuft und er läuft.");

                try {
                    //Die Methoden sleep() , join()  und wait() lösen alle eine Interupted Exception aus wenn sie von einem Interuppt unterbrochen werden, wichtig!
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    //Hier wird nach der Exception mit der methode interrupt() der Thread unterbrochen und dies ist nötig weil allein durch den code in Zeile 27 ohne dem interupt im Catch Block nur die Flag zurückgesezut werden würde.
                    Thread.currentThread().interrupt();
                    System.out.println("Unterbrechung in sleep()");
                }
            }//End while
            System.out.println("Das Ende");
        };

        Thread thread = new Thread(killingMeSoftly);
        thread.start();
        Thread.sleep(3500);
        //Wir können in dem Interface mit den statischen methoden isInterrupt() (prüft ob Thread unterbrochen ist), interrupt() (unterbricht den Thread wenn auch im catch block ausgeführt) ,
        // interrupted() hingegen prüft genauso wie die erste Methode ob ein interrupt flag gesetzt ist , und wen ja , dan setzt diese methode die flag zurück, das tut die erste methode nicht und
        //beendet in diesem fall die while schleife.
        thread.interrupt();

    }
}
