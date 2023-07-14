package JavaInselBuch.Beispiele.nichtStatischGeschachtelteTypen;

public class FurnishedHouse {
    String s = "House";

    class Room {
        //Nicht statische Klassen, können beliebeig geschachtelt werden.
        String s = "Room";

        class Chair {
            String s = "Chair";

            //Eine Methode in der Chair Klasse.
            void output() {
                //Wir brauchen die this referenz um auf die gewünschten äußeren Klassen zugreifen zu können.
                System.out.println(s);
                System.out.println(this.s);
                System.out.println(Chair.this.s);
                System.out.println(Room.this.s);
                System.out.println(FurnishedHouse.this.s);
            }
        }
    }


    public static void main(String[] args) {
        //Hier müssen wir von ganz oben bis ganz unten, objecte erstellen um die methode der verschachtelsten Klasse aufzurufen.
        new FurnishedHouse().new Room().new Chair().output();
        System.out.println();

        //Hier erstellen wir Objekte von den Inneren Typen und brauchen immer den äußeren.
        FurnishedHouse h = new FurnishedHouse();
        FurnishedHouse.Room r = h.new Room();
        FurnishedHouse.Room.Chair c = r.new Chair();
        c.output();
    }
}
