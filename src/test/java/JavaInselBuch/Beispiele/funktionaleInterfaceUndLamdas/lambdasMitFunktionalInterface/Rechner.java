package JavaInselBuch.Beispiele.funktionaleInterfaceUndLamdas.lambdasMitFunktionalInterface;
@FunctionalInterface  //Mit @ deklarieren wenn Interface vorhanden.
public interface Rechner {
    //Merken: Ein Funktionales Inteface darf nur eine Methode haben.
    //Von interfaces kann man sich keine Objekte erstellen.(Gegenspieler von Objektorientierung.)
    //Wenn es mehrer methoden hatt dan nennt man es nicht mehr Funktional Interface.
    //Es kann alles Verändert werden wie in normalen Methoden.
//----------------------------------------------------------------------------------------------------------------------
    int rechne(int zahl1, int zahl2);
}
