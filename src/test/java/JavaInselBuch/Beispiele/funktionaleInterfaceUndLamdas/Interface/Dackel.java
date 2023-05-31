package JavaInselBuch.Beispiele.funktionaleInterfaceUndLamdas.Interface;

public class Dackel implements HundInterface {
    private int beine = 4;
    int alter;
    private String name;
    int gewicht;

    Dackel(int alter,String name,int gewicht){
        this.alter = alter;
        this.name = name;
        this.gewicht = gewicht;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void bellen() {
        System.out.println("WauWau");
    }

    @Override
    public void fressen() {
        System.out.println("Mampf");
    }
}
