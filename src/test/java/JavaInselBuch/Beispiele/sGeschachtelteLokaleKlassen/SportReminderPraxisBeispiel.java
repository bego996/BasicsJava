package JavaInselBuch.Beispiele.sGeschachtelteLokaleKlassen;

import java.util.Timer;
import java.util.TimerTask;

public class SportReminderPraxisBeispiel {

    //Die Lokale Klasse bringt hier den Vorteil dass sie bis auf main(), kein anderer sehen kann.
    public static void main(String[] args) {
        class SportReminderTimerTask extends TimerTask {
            @Override
            public void run() {
                System.out.println("Los, beweg dich!");
            }
        }
        new Timer().scheduleAtFixedRate(new SportReminderTimerTask(),0,2000);
    }
}
