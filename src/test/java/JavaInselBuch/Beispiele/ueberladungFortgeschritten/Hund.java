package JavaInselBuch.Beispiele.ueberladungFortgeschritten;

public abstract class Hund {  //Abstract versorgt die unterklassen mit Methoden und lässt kein Object mehr herstellen(garantiert Atributte und Methoden).
    //Attribute
    private String name;
    private int alter;
    private String farbe;
    private boolean istAgresiv;
    int geschwindigkeit = 80;

    //Konstruktor
    public Hund(String name,int alter,String farbe,boolean agressiv){
        this.name = name;
        this.alter = alter;
        this.istAgresiv = agressiv;
        this.farbe = farbe;
    }
    //Konstruktor Überladung.
    public Hund(String name,int alter){
        this.name = name;
        this.alter = alter;
    }
    public Hund(String name){
        this.name = name;
    }
    //Ein leerer Konstruktor pro Klasse möglich.
    public Hund(){
        System.out.println("Leerer Konstruktor");
    }




    //Eigenschaften
    //Hier wurden manche Methoden in deren subklasse überschrieben. Sieht man auch in InteliJ, wenn man auch @Override dazu schreibt.
    public void laufen() {
        System.out.println(name + " läuft "+geschwindigkeit+"kmh schnell");
    }

    public void sitzen() {
        System.out.println(name + " sitzt");
    }

    public void bellen() {
        System.out.println(name + " bellt");
    }
    public void istAgressiv(){
        System.out.println(istAgresiv);
    }



    //Getter und Setter für Kapselung,Atribute müssen auf private sein dafür.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

}
