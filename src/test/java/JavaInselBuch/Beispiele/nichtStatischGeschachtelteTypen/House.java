package JavaInselBuch.Beispiele.nichtStatischGeschachtelteTypen;

public class House {
    private String owner = "Ich";

    //Ein exemplar von room hatt zugriff auf alle Eigenschaften von der äuserenKlasse auch private eigenschaften.
    class Room{
        void ok(){
            System.out.println(owner);
        }
        //Statische Methoden sowie variablen sind in der inneren nicht erlaubt, folge : Compilerfehler.
        //static void error(){}
    }

    public static void main(String[] args) {
        House house = new House();
        Room room = house.new Room();
        //Zeite alternative zum erzeugen.
        Room r = new House().new Room();
    }
}
