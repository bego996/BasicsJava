package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

public class MonitorTube {
    private final TV tv;

    MonitorTube(TV tv) {
        this.tv = tv;
    }

    void on() {
        System.out.println("Tube is On");
    }

    void off() {
        System.out.println("Tube is off");
    }

    public TV getTv() {
        return tv;
    }
}
