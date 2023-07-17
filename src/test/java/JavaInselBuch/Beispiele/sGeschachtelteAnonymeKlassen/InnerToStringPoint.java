package JavaInselBuch.Beispiele.sGeschachtelteAnonymeKlassen;

import java.awt.*;

public class InnerToStringPoint {
    //Wir erstellen eine anonyme unterklasse von Point und überschreiben die toString methode.
    public static void main(String[] args) {
        Point point = new Point(10, 12) {
            @Override
            public String toString() {
                return "(" + x + "," + y + ")";
            }
        };

        System.out.println(point);
    }
}
