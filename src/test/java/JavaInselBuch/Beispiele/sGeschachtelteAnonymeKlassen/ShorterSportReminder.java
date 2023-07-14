package JavaInselBuch.Beispiele.sGeschachtelteAnonymeKlassen;

import java.util.Timer;
import java.util.TimerTask;


//Hier ein beispiel von schon vorher mit einer lokalen klasse umgesetzt nur ist hier eine anonyme Klasse bestens geignet , weil wir den Timer nur einmal benutzen.
public class ShorterSportReminder {
    public static void main( String[] args ) {
        //Hier wird die anonyme Klasse erstellt. Auch möglich in anderen szenarien die klasse in ein Objekt zu speichern oder variable.
        new Timer().scheduleAtFixedRate(new TimerTask() {
                                            @Override public void run() {
                                                System.out.println( "Los, beweg dich, du faule Wurst!" );
                                            }
                                        },0 ,1000 );
    }
}
