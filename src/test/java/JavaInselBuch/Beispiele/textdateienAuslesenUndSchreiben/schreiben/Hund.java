package JavaInselBuch.Beispiele.textdateienAuslesenUndSchreiben.schreiben;

public class Hund {  //Abstract versorgt die unterklassen mit Methoden und lässt kein Object mehr herstellen(garantiert Atributte und Methoden).
    //Attribute
    private int alter;
    private String name;
    private String art;
    private String fellFarbe;

    //Konstruktor
    public Hund(String name, int alter, String farbe,String art){
        this.name = name;
        this.alter = alter;
        this.art = art;
        this.fellFarbe = farbe;
    }


    public void bellen() {
        System.out.println(name + " bellt");
    }


    public String getFellFarbe() {return fellFarbe;}
    public void setFellFarbe(String fellFarbe) {this.fellFarbe = fellFarbe;}
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
    public String getArt() {return art;}
    public void setArt(String art) {this.art = art;}
}
