package JavaInselBuch.Beispiele.funktionaleInterfaceUndLamdas.Interface2;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //FunktionaIntefaces unterscheiden sich nur in ihrem PAramatern und Rückgabetypen, dass macht sie einzigartig.
        //Anonyme Klasse mit Lambda erstellt.
        Lebewesen Elefant = (a, b) -> System.out.println(a+ " immer " + b);
        Elefant.macheEtwas("Der elefant macht","Töroo");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Wir erstellen uns ein Funktion Inteface. Wie Parameter aufgebaut sind und wie die Interfaces heißen steht in der Java doc. In unserem Fall Einfach "Funcion".
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Viel kürzer als Methoden in Objektorientierung.
        Function<Integer,Integer> addTwoFunktion = number -> number + 2;
        Function<Integer,Integer> multThree = number -> number * 3;
        System.out.println(addTwoFunktion.apply(5));

        //Wir verbinden beide funktionen miteinander. Meine Art..
        System.out.println(multThree.apply(addTwoFunktion.apply(5)));
        //Noch eine Möglichkeit..
        System.out.println(addTwoFunktion.andThen(multThree).apply(5));
        //Die umgekehrte Methode zu oben..
        System.out.println(multThree.andThen(addTwoFunktion).apply(6));
        //Hier wird mit .compose der zweiten Funktion ein Wert übergeben anstatt der ersten mit .andThen..
        System.out.println(addTwoFunktion.compose(multThree).apply(6));

        //Eine kleine Übung : Wir verketten zwei Funktionen miteinander.Die erste wandelt einen Integer in einen Double um und die zweite Wandelt den Double in einen String um.
        Function<Integer,Double> konvertierenDurchDividieren = zahl -> (double) zahl / 5;
        //Abekürzte form Objext::toString; anstatt zb. zahl1 -> zahl1.toString
        Function<Double,String > konvertiereZuString = Object::toString;
        String result = konvertierenDurchDividieren.andThen(konvertiereZuString).apply(8);
        System.out.println(result);
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Erstellen eines Comsumer Interface und generell Praktische Anwendung von Funktions..
        Consumer<String> einTest = text -> System.out.println(text+"!");
        einTest.accept("Hallo");

        //Praktische Anwendungen
        List<String> students = List.of("Peter","Bego","Mani");

        //Eine verkürze for EachSchleife der students , vobei jeder einelnen student dem Consumer übergeben wird und ein Rufzeichen dazuhängt :).
        students.forEach(einTest);
        System.out.println();

        //Kürzeste variante. Wir sparen uns dabei sogar die erstellung eines Consumer Interfaces :)
        students.forEach(s -> System.out.println(s+"!"));
        System.out.println();

        //Große Version der ForEach Schleife
        for (String s:students) {
            einTest.accept(s);
        }
        System.out.println();
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Erstellen eines Predicate Interface und nutzung mit streams(Akzepriert einen Belibiegen Parameter Wert <T> und gibt einen Boolean zurück).
        //Ohne streams einzelne abfrage. "Mani" wird mit index 2 geprüft.
        Predicate<String> sudentTest = student -> student.startsWith("M");
        Boolean b = sudentTest.test(students.get(2));
        System.out.println(b);
        System.out.println();
        //Mit streams kommt die Liste in einen neuen modus und bekommt neue methoden.
        //anyMatch testet ob ein Element aus dem Stream die bedingung erfüllt und gibt wahr oder Falsch zurück  weil Predicate.
        Boolean b1 = students.stream().anyMatch(sudentTest);
        System.out.println(b1);
        System.out.println();
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Erstellen eines Supplier Interfaces.
        //Einfache Lieferanten für Werte.
        //Liefert einen Rückgabewert <T> und enthält aber keinen Parameter. Weil keine Parameter enthalten kann man im Lambda einfach eine () einsetzen.
        Supplier<Double> random1000 = () -> Math.random() * 1000;
        System.out.println(random1000.get());
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Es gibt auch Interfaces für primitive Datentypen (Siehe Java Doc zu Funktions)
        //Bi. F.I. können zb. auch zwei Parameter annehmen.
    }
}
