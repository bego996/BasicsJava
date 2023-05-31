package JavaInselBuch.Beispiele.funktionaleInterfaceUndLamdas.Interface;

public class Schäferhund implements HundInterface {
    @Override
    public void bellen() {
        System.out.println("Wu Wu");
    }

    @Override
    public void fressen() {
        System.out.println("Mampffff");
    }
}
