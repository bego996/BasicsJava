package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

public class Firebox extends ElectronicDevices {

    public Firebox() {
        on();
    }

    @Override
    void off() {
        System.out.println("Firebox lässt sich nicht abschalten!");
    }
}
