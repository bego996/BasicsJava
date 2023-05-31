package JavaInselBuch.Beispiele.ueberladungFortgeschritten;

public class Schaefer extends Hund {
    boolean kannKaempfen;
    int maxAlter;

    public Schaefer(String name,int alter,String farbe,boolean agressiv,boolean kannKaempfen){
        super(name,alter,farbe,agressiv);
        this.kannKaempfen = kannKaempfen;
    }
    //Um super nutzen zu können muss ein Konstruktor in der Superklasse erstellt werden.Und die Parameter in der Subklasse müssen alle zuerst enthalten wie die aus der Superklasse.(Vererbung).
    public Schaefer(String name,int alter,boolean kannKaempfen,int maxAlter){
        super(name,alter);
        this.kannKaempfen = kannKaempfen;
        this.maxAlter = maxAlter;
    }




    //Eigenschaften
    public void kannKaempfen(){
        System.out.println(kannKaempfen);
    }



    //Getter uns setter.
    public void setKannKaempfen(boolean kannKaempfen) {
        this.kannKaempfen = kannKaempfen;
    }

    public int getMaxAlter() {
        return maxAlter;
    }

    public void setMaxAlter(int maxAlter) {
        this.maxAlter = maxAlter;
    }
}
