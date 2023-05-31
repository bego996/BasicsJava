package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

import java.util.function.Consumer;

public class Application {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.on();
        radio.volumeUp();

        IceMashine iceMashine = new IceMashine();
        iceMashine.on();

        TV tv = new TV();
        tv.on();

        Firebox firebox = new Firebox();

        Ship ship = new Ship("CaptainCaos Crew");
        ship.load(radio);
        ship.load(iceMashine);
        ship.load(tv);
        ship.load(firebox);
        System.out.println();

        ship.getElectronicDevices().forEach(devices -> System.out.println(devices.isOn()));
        ship.getElectronicDevices().forEach(devices -> System.out.println(devices.getClass()));
        System.out.println();

        ship.holiday();
        ship.getElectronicDevices().forEach(devices -> System.out.println(devices.isOn()));













    }

}
