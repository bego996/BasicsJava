package JavaInselBuch.Beispiele.kapitel6EigeneKlassen;

public class MainTester {
    public static void main(String[] args) {
        Passwort pass1 = new Passwort();
        pass1.assignNewPasswort("","Bego");
        boolean rightPasswort = pass1.check("Beg");
        System.out.println(rightPasswort);
        System.out.println();

        KatzenBaby katzenBaby = new KatzenBaby();
        katzenBaby.setName("Pipi");
        katzenBaby.setAlter(10);
        katzenBaby.laufen();

    }
}
