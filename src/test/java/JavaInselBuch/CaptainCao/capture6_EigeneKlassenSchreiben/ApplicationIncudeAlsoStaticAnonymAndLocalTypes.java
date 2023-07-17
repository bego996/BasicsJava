package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class ApplicationIncudeAlsoStaticAnonymAndLocalTypes {

    //An example of the static inner class with an interface implementation.
    public static class WattComparator implements Comparator<ElectronicDevices>{
        @Override
        public int compare(ElectronicDevices o1, ElectronicDevices o2) {
            System.out.println(o1+ " is compared with "+ o2);
            return Double.compare(o1.getWatt(), o2.getWatt());
        }
    }





    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.on();
        radio.volumeUp();
        System.out.println(radio);

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
        System.out.println(firebox);

        ship.getElectronicDevices().forEach(devices -> System.out.println(devices.isOn()));
        ship.getElectronicDevices().forEach(devices -> System.out.println(devices.getClass()));
        System.out.println();

        ship.holiday();
        ship.getElectronicDevices().forEach(devices -> System.out.println(devices.isOn()));
        System.out.println();

        ElectronicDevices ea1 = new Radio(); ea1.setWatt(5);
        ElectronicDevices ea2 = new Radio(); ea2.setWatt(50);
        Comparator<ElectronicDevices> c = new ElectronicDeviceWattComparator();
        System.out.println(c.compare(ea1,ea2));
        System.out.println(c.compare(ea2,ea1));
        System.out.println(ea1.getWatt());
        System.out.println();
        Ship ship1 = new Ship("VerbrauchFilter Ship");
        Radio radio1 = new Radio();
        radio1.setWatt(10);
        Radio radio2 = new Radio();
        radio2.setWatt(50);
        Radio radio3 = new Radio();
        radio3.setWatt(45);
        ship1.load(radio1); ship1.load(radio2); ship1.load(radio3);
        System.out.println(Arrays.toString(ship1.getElectronicDevices().toArray()));
        System.out.println(ship1.findMostPowerConsumingPowerDevice().getWatt());
        System.out.println();

        System.out.println(ship1.getElectronicDevices().size());
        ship1.removePowerConsumingElectronicDevices();
        System.out.println(ship1.getElectronicDevices().size());
        Consumer<ElectronicDevices> einTest = System.out::println;
        ship1.getElectronicDevices().forEach(einTest);
        System.out.println();


        //The static class usage.
        WattComparator wattComparator = new WattComparator();
        System.out.println(wattComparator.compare(radio1,radio2));
        System.out.println();


        //The local class usage, direct in the main method.
        class WattComparator2 implements Comparator<ElectronicDevices>{
            @Override
            public int compare(ElectronicDevices o1, ElectronicDevices o2) {
                System.out.println(o1+ " is compared with "+ o2);
                return Double.compare(o1.getWatt(), o2.getWatt());
            }
        }
        WattComparator2 testComparator = new WattComparator2();
        System.out.println(testComparator.compare(radio1,radio2));
        System.out.println();


        //The anonym class usage.
        Comparator<ElectronicDevices> testAnonym = new Comparator<>() {
            @Override
            public int compare(ElectronicDevices o1, ElectronicDevices o2) {
                System.out.println(o1+ " is compared with "+ o2);
                return Double.compare(o1.getWatt(), o2.getWatt());
            }
        };
        System.out.println(testAnonym.compare(radio1,radio2));












    }

}
