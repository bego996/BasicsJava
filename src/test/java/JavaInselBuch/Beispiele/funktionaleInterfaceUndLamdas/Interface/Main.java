package JavaInselBuch.Beispiele.funktionaleInterfaceUndLamdas.Interface;

public class Main {
    public static void main(String[] args) {
        //Normale Objecterstellung , Interface enthalten Klasse mit allen Atributen sowie Methoden nach außen sichtbar. (Code bis Zeile 12)
/*
        Labrador molly = new Labrador(5,"molly","weiß");
        Dackel bruno = new Dackel(10,"bruno",6);
        Schäferhund senta = new Schäferhund();
*/
//------------------------------------------------------------------------------------------------------------------------------------
        //Möglichkeit die Methoden einer Klasse nach außen hin unsichtbar zu machen und nur die Methoden sichtbar zu machen
        //die von  unserem Hund Interface vorgegeben wurden. (Code bis Zeile 24)
        HundInterface molly = new Labrador(5,"molly","weiß");
        HundInterface bruno = new Dackel(10,"bruno",6);
        HundInterface senta = new Schäferhund();
        //Ein Array wird von unserem verschieden Klassen Objecten erstellt die , das Interface implementiert haben.
        HundInterface[] hunde = {molly,bruno,senta};
        //Wir können jz mit einer ForEach Schleife die gewünschten Interface Methoden des Arrays ausgeben.
        for (HundInterface hund : hunde) {
        //mit hund.getClass.toString , können wir den KlassenNamen ausgeben.
            System.out.println(hund.getClass().toString());
            hund.bellen();
            hund.fressen();
        }
    }
}
