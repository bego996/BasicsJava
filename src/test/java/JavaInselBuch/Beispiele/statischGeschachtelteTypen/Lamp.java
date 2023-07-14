package JavaInselBuch.Beispiele.statischGeschachtelteTypen;

public class Lamp {
    static String name = "Latifa";
    int watt = 1985;

    //Statische unterklasse. Es sind keine Objekte von äußeren Typen notwendig um exemplare von statischen typen zu erzeugen. die statische Klasse ist wie ein unterpaket und sie kann keine objektvariable von oben auslesen.
    //Um an eine statische eigenschaft durch die äußere klasse zugrreifen zu können muss ein objekt erstellt werden mit "äusereKlasse.InnereKlasse();".
    //Die statische Klasse muss einen anderen namen als die äußere haben.
    //Die statische Klasse besitzt Zugriff auf alle äußeren statischen eigenschaften.
    static class Bulb{
        //Eine private statische innereKlasse ist wie eine normale private statische variable. Abstract auch erlaubt.
        int test = 5;
        void output(){
            System.out.println(name);
            //cannot make a static reference of the non-static field watt!
            //System.out.println(watt);
        }
    }
    public static void main(String[] args) {
        Bulb bulb = new Lamp.Bulb();
        bulb.output();
        int a = bulb.test;
    }
}

//Die class datei auf der Festplatte heist auch "äußererTypt$InnererTyp.class"
