package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

import java.util.ArrayList;
import java.util.Objects;



public class Ship {
    private final String shipName;
    private ArrayList<ElectronicDevices> electronicDevices = new ArrayList<>();


    public Ship(String shipName) {
        this.shipName = shipName;
    }


    public void load(ElectronicDevices device) {
        Objects.requireNonNull(device);
        electronicDevices.add(device);
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

    public void holiday() {
        electronicDevices.forEach(devices -> devices.off());
    }

    public ArrayList<ElectronicDevices> getElectronicDevices() {
        return electronicDevices;
    }

    public void setElectronicDevices(ArrayList<ElectronicDevices> electronicDevices) {
        this.electronicDevices = electronicDevices;
    }

    @Override
    public String toString() {
        return String.format("[%s has %d Electronic Devices on board. %d of them are on]", shipName, electronicDevices.size(), ElectronicDevices.numberOfElectronicDevicesSwitchedOn(electronicDevices));
    }
}
