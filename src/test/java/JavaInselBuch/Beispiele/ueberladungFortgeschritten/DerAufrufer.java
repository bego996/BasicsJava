package JavaInselBuch.Beispiele.ueberladungFortgeschritten;

public class DerAufrufer {
    public static void main(String[] args) {
        Schaefer erster = new Schaefer("Joki",10,"Grau",true,true);
        Schaefer zweiter = new Schaefer("Joki0",5,true,20);
        //Mit abstract einfach Chiwava erstellen.
        Chiwava erster0 = new Chiwava("Chipi",10,"Rot",true,false);

        //Neu
        Hund chiwava = new Chiwava("Dogi",12,"Grau",false,true); //Nach abstract können wir Ein Object vom Typ Chiwava erstellen anstatt von Hund.
        //Hund test = new Hund(6,5,"fd"); Nicht mehr möglich weil Oberklasse abstract ist. (Wir brauchen keine Oberklassen Objecte mehr erstellen).

        erster.laufen();
        System.out.println(erster.getName());
        erster.istAgressiv();
        erster.kannKaempfen();

        zweiter.laufen();
        zweiter.kannKaempfen();
        System.out.println(zweiter.getAlter());
        System.out.println(zweiter.getMaxAlter());
        System.out.println(zweiter.getFarbe());

        erster0.sitzen();
        System.out.println();
        erster0.istAgressiv();
        System.out.println();
        System.out.println(erster0.getIstLeicht());
        System.out.println();
        erster0.setIstLeicht(true);
        System.out.println();
        erster0.bellen();

        erster0.laufen();

        //Neu
        chiwava.bellen();
        chiwava.istAgressiv();
        System.out.println();
        //SpezialInfo : Jese Klasse erbt von der Klasse Object. Diese kann auch überschrieben werden.



    }
}
