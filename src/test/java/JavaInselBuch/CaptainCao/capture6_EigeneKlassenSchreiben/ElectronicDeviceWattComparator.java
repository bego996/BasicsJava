package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

import java.util.Comparator;

public class ElectronicDeviceWattComparator implements Comparator<ElectronicDevices> {
    @Override
    public int compare(ElectronicDevices o1, ElectronicDevices o2) {
        System.out.println(o1+ " is compared with "+ o2);
        return Double.compare(o1.getWatt(), o2.getWatt());
    }
}
