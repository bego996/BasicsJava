package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

import java.util.ArrayList;

public class ElectronicDevices {
    private boolean isDeviceOn;

    private double watt;

    public ElectronicDevices() {
    }

    public static int numberOfElectronicDevicesSwitchedOn(ArrayList<ElectronicDevices> devices) {
        int onCounter = 0;
        for (ElectronicDevices device : devices) {
            if (device.isOn())
                onCounter++;
        }
        return onCounter;
    }

    void on() {
        this.isDeviceOn = true;
    }

    void off() {
        this.isDeviceOn = false;
    }

    boolean isOn() {
        return isDeviceOn;
    }
    public double getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    @Override
    public String toString() {
        return "ElektronicDevice[watt= " +watt/1000+"kW]";
    }
}