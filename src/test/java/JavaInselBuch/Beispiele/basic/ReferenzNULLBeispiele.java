package JavaInselBuch.Beispiele.basic;


import java.awt.*;

import static java.lang.System.out;

public class ReferenzNULLBeispiele {
    public static void main(String[] args) {
        //Möglichkeit zu überprüfen ob Ein Dialog abgebrochen wurde oder keine eingabe erfolgte.NullPointerException überschreiben.
        //Funktioniert nur beim Referenztyp "String".
        String eingabe = javax.swing.JOptionPane.showInputDialog("Eingabe:");
        if (eingabe != null && !eingabe.isEmpty())  //Wenn Eingabe auf ein Objekt verweist && nicht leer ist!
            out.println("Eingabe: "+eingabe);
        else                                        //Bei abbruch oder keiner Eingabe.
            out.println("Abbbruch oder keine Eingabe");

        //(==) or (!=) Testet ob auf ein Referenzobjekt gezeigt wird (Die Identität die selbe ist)...
        Point a = new Point(10,10);
        Point b = a;//b zeigt auf ein Referenzobjekt.
        out.println(a);
        b.x = 20;   //Das Referenzobjekt auf das b zeigt, verändert sich mit!
        out.println(a);
        out.println(b);
        Point c = new Point(10,10);//c ist ein eigenes Objekt obwohl es den Gleichen inhalt wie a hatt!
        out.println(a == b);
        out.println(a == c);
        out.println(b == c);

        //equals() or !equals(), testet hingegen auf Gleichwertigkeit von Objekten..
        out.println(a.equals(c));
        out.println(a.equals(b));



    }
}
