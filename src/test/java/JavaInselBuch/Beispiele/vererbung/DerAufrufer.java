package JavaInselBuch.Beispiele.vererbung;

public class DerAufrufer {
    public static void main(String[] args) {
        Schaefer erster = new Schaefer("Joki",10,"Grau",true,true);
        Schaefer zweiter = new Schaefer("Joki0",5,true,20);

        Chiwava erster0 = new Chiwava("Chipi",10,"Rot",false,false);

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
        erster0.istAgressiv();
        System.out.println(erster0.getIstLeicht());
        erster0.setIstLeicht(true);

    }
}
