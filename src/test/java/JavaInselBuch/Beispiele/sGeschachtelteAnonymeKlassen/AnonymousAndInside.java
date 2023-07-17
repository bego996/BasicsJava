package JavaInselBuch.Beispiele.sGeschachtelteAnonymeKlassen;

import java.awt.*;

public class AnonymousAndInside {

    //Exemplarinitialisierungblöcke innerhalb anonymer Klassen.
    public static void main(String[] args) {
        java.awt.Point p = new Point(){
            {
                x = (int) (Math.random()*1000);
                y = (int) (Math.random()*1000);
            }
        };
        System.out.println(p.getLocation());


        //Die variante nennt sich auch doppelklammerinitialisierung und ist nützlich wenn datenstrukturen oder hyraiersche opbjecte initialisiert werden sollen.
        //hier wird das super() schon beim initialiesieren genutzt und muss nicht extra genannt werden. Die anonyme klasse gibt den x wert von der oberklasse aus , weil keine änderung an der statt fand.
        System.out.println(new java.awt.Point(-1,0){{
                y = (int) (Math.random()*1000);
            }}.getLocation());
    }
}


//aNONYMEkLASSEN HABEN SEIT DER EINFÜHRUNG VON LAMBDAS AN BEDEUTUNG VERLOREN, Lambdas FOLGen in kapitel 13...