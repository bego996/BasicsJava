package JavaInselBuch.Beispiele.funktionaleInterfaceUndLamdas.Interface;

public class Labrador implements HundInterface {
    int alter;
    String name;
    String farbe;

    public Labrador(int alter,String name,String farbe) {
        this.alter = alter;
        this.name = name;
        this.farbe = farbe;
    }

    @Override
    public void bellen() {
        System.out.println("wufwuf");
    }

    @Override
    public void fressen() {
        System.out.println("MampfMampf");
    }
}
