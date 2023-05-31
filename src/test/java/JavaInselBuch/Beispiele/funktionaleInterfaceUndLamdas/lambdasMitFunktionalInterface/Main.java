package JavaInselBuch.Beispiele.funktionaleInterfaceUndLamdas.lambdasMitFunktionalInterface;

public class Main {
    public static void main(String[] args) {
        //Lamda-Ausdruck = Abkürzung, um eine Implementierung eines
        //Funktional Interfaces zu definieren.
        //Schnelle Implementierungen von Interfaces. Ab Java 8 möglich.
        //Funktioniert nur mit Functional Interfaces.
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
        Implementierung von anonymen Klassen. (Code bis Zeile 19)
        Rechner adierrer = new Rechner() { //Wenn alles fertig geschrieben dan ,mit mauszeiger auf Rechner zeigen und Lamdas implementieren.Siehe Abkürzung unten.
            @Override                      //Die Interface methode muss überschrieben werden.
            public void addiere() {
                System.out.println(5+10);
            }
        };
        adierrer.addiere(); //Ausführen der Funktion, mit dem Objekt der Anonymen Klasse.
*/
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Abkürzung für die Implementierung Oben mit Lamdas.(Ohne Rückgabewert beim Interface) (Code bis Zeile 25)
/*
        Rechner addieren = () -> System.out.println(15+5); //Ein Lambda!
        Rechner multipliziere = () -> System.out.println(15*5);
        addieren.addiere();
        multipliziere.addiere();
*/
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Noch tiefere Abkürzung mit Lamdas bei Parameterübergabe des FunktionalInterfaces.(Mit Rückgabe beim Interface)(Code bis Zeile 39)
/*
        Rechner addieren = (zahlen) -> System.out.println(zahlen + 10);
        //Abkürzung für Oben (Klammern weg)
        Rechner addieren1 = zahlen -> System.out.println(zahlen + 10);
        //Abkürzung für Oben (Parameter Namen umbenannt)
        Rechner addieren2 = umbenannt -> System.out.println(umbenannt + 10);
        addieren.addiere(10);
        addieren1.addiere(10);
        addieren2.addiere(10);
*/
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Das selbe wie Oben , nur das Mehrere Parameter im Interface vorhanden sind.
        //Zu Beachten , dass die Übergabe die Richtige Reihenfolge enthält und das Wieder Klammern gesetzt werden bei Parametern.
/*
        Rechner addieren = (ersteZ,zweiteZ) -> System.out.println(ersteZ+zweiteZ+5);
        addieren.addiere(10,5);

*/
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Diesmal Lambdas mit Rückgabewert(Methode des Interfaces mit Rückgabewert).(Code bis Zeile 52)
        Rechner addieren = (zahl1, zahl2) -> zahl1+zahl2+5;
        Rechner dividiere = (divisor,divident) -> divisor/divident+5;
        int summe = addieren.rechne(10,5);
        double summe0 =  dividiere.rechne(20,7);
        System.out.println(summe);
        System.out.println(summe0);
    }
}
