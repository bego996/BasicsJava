package JavaInselBuch.Beispiele.ueberladungFortgeschritten;

public class Chiwava extends Hund {
    private boolean istLeicht;
    int geschwindigkeit = 120;

    //Konstruktor angepasst um die atributte der superklasse nutzen zu können.
    public Chiwava(String name,int alter,String farbe,boolean agressiv,boolean istLeicht){
        super(name,alter,farbe,agressiv);
        this.istLeicht = istLeicht;
    }
    //Annotation mit @Override wen man methoden von anderen Klassen,in unserem Fall Superklasse,überschreibt.
    @Override
    public void bellen() {
        super.bellen();
        System.out.println(this.getName() + " jault");
    }
    @Override
    public void laufen(){
        System.out.println(this.getName() + " läuft "+this.geschwindigkeit+"kmh schnell");
    }








    //Getter mit Eigener variante, verätt die Wahrheit nicht(Beispiel)(Kapselung).
    public boolean getIstLeicht() {
        return istLeicht;
    }

    public void setIstLeicht(boolean istLeicht) {
        this.istLeicht = istLeicht;
    }
}
