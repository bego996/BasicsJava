package JavaInselBuch.Beispiele.Vererbung;

public class Chiwava extends Hund {
    private boolean istLeicht;

    public Chiwava(String name,int alter,String farbe,boolean agressiv,boolean istLeicht){
        super(name,alter,farbe,agressiv);
        this.istLeicht = istLeicht;
    }


    //Getter mit Eigener variante, verätt die Wahrheit nicht(Beispiel)(Kapselung).
    public boolean getIstLeicht() {
        return true;
    }

    public void setIstLeicht(boolean istLeicht) {
        this.istLeicht = istLeicht;
    }
}
