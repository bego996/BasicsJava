package JavaInselBuch.Beispiele.sGeschachtelteLokaleKlassen;

//Lokale klassen werden in Anweisungsblöcken erzeugt von Methoden,Konstruktoren und initialisierungsblöcken.
//Lokale schnittstellen sind nicht möglich!

public class NSA {
    //Test das es nicht funktioniert.
    public void test(){
        System.out.println("Versuche diese methode mit der lokalen klasse zu nutzen.");
    }

    public static void main(String[] args) {
        final int PRISM = 1;
        int tempora = 2;
        //Gibt es keinen Schreibzugriff wie hier, ist sie effektiv final für die lokale klasse und kann nur dann ausgelesen werden von lokal.
        //tempora++;


        class Snowden{
            //Liegt die innere klasse in einer statischen Methode wie hier, kann sie auf keine Objektmethoden von außen zugreifen.
            Snowden(){
                System.out.println(PRISM);
                //Wenn die variable tempora final ist dann kann man sie augeben. Es reicht wenn mann tempora nicht oben ausliesst und dies wie oben auskommentiert z. b.
                System.out.println(tempora);
            }
        }
        new Snowden();
        Snowden snowden = new Snowden();
        //Hier ein beispiel dass man die Objektmethode test() mit einem Objekt von Snowden nicht nutzen kann!
        //snowden.test();
    }
}
