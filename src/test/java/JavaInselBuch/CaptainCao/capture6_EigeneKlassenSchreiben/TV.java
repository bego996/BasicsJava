package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

public class TV extends ElectronicDevices {
    private final MonitorTube monitorTube = new MonitorTube(this);

    @Override
    void on() {
        System.out.println("Tv is on.");
        super.on();
        monitorTube.on();
    }

    @Override
    void off() {
        System.out.println("Tv is off.");
        super.off();
        monitorTube.off();
    }

    @Override
    public String toString() {
        return String.format("TV[On?=%s]", isOn());
    }
}
