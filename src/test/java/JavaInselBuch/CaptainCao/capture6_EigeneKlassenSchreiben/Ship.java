package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

import java.util.*;
import java.util.function.Predicate;


public class Ship {
    private final String shipName;
    private ArrayList<ElectronicDevices> electronicDevices = new ArrayList<>();

    public Ship(String shipName) {
        this.shipName = shipName;
    }


    public void load(ElectronicDevices device) {
        Objects.requireNonNull(device);
        electronicDevices.add(device);
        Comparator<ElectronicDevices> refresher = new ElectronicDeviceWattComparator();
        electronicDevices.sort(refresher);
        if (device instanceof Radio) {
            if (((Radio) device).volume != 0) {
                System.out.println("Radio wurde hinzugefügt!");
            }
        } else if (device instanceof IceMashine) {
            System.out.println("Eis Maschine wurde hinzugefügt!");
        } else if (device instanceof TV) {
            System.out.println("TV wurde hinzugefügt.");
        } else if (device instanceof Firebox) {
            System.out.println("Firebox wurde hinzugefügt");
        }
    }
    //Meine Lösung um mit der Methode von unten , die Geräte mit zu viel Stromverbrauch vom Schiff zu entfernen. Funktioniert, aber es geht knackiger. Die Klasse HighWattConsumerFilter wurde von mir hier verwendet.
    /*public void removePowerConsumingElectroDevice(){
        Predicate<ElectronicDevices> filter = new HighWattConsumerFilter();
        electronicDevices.removeIf(filter);
    }*/


    //Hier ist die knackigere Variante von oben. Wir können eine lokale Klasse gleich in der Methode erstellen und setzen den macimalen Watt wert gleich in die Methode(Speichersparung). darübher hinaus wird auch gleich am ende der Methode mithilfe unseres erstellen
    //Predicates , das von der lokalen klasse ,ein objectk erstellt und mit dem Predicate geprüft und gegebenfalls wird dann auch das Gerät entfernt. Wir Sparen und die erstellung einer eigenen Klasse außerhalb. Trotztem funktioniert alles gleich wie oben.
    // Zu beachten: sollte das prädicat in anderen Methoden verwendet werden , ist unsere obere Variante besser geignet um wiederum platz zu sparen.
    public void removePowerConsumingElectronicDevices() {
        class IsPowerConsumingElectronicDevice implements Predicate<ElectronicDevices> {
            final double MAXIMUM_POWER_CONSUMPTION = 50;
            @Override public boolean test( ElectronicDevices electronicDevice ) {
                return electronicDevice.getWatt() >= MAXIMUM_POWER_CONSUMPTION;
            }
        }
        electronicDevices.removeIf( new IsPowerConsumingElectronicDevice() );
    }


    public void holiday() {
        electronicDevices.forEach(devices -> devices.off());
    }

    public ArrayList<ElectronicDevices> getElectronicDevices() {
        return electronicDevices;
    }

    public ElectronicDevices findMostPowerConsumingPowerDevice() {
        Comparator<ElectronicDevices> comparator = new ElectronicDeviceWattComparator();
        Collection<ElectronicDevices> electronicDevices1 = electronicDevices;
        return Collections.max(electronicDevices1, comparator);
    }

    public void setElectronicDevices(ArrayList<ElectronicDevices> electronicDevices) {
        this.electronicDevices = electronicDevices;
    }

    @Override
    public String toString() {
        return String.format("[%s has %d Electronic Devices on board. %d of them are on]", shipName, electronicDevices.size(), ElectronicDevices.numberOfElectronicDevicesSwitchedOn(electronicDevices));
    }
}
