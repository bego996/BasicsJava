package JavaInselBuch.Beispiele.basic;

public class wrapperKlassen {
    public static void main(String[] args) {
        //Funktioniert mit allen Datentypen. Vorteil: man kann die Methoden und Interfaces der Wrapperklassen danach nutzen.
        //NAchteil: Langsamer als primitive Datentypen. Trotztem verlangen manche Klassen oder Projekte , Wrapperklassen.
        int unboxed = 10;
        Integer autoBoxed = unboxed;
        System.out.println(autoBoxed);
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed);


    }
}
