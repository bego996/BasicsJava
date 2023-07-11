package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

import java.util.function.Predicate;

public class HighWattConsumerFilter implements Predicate<ElectronicDevices> {
    public static double MAXIMUM_POWER_CONSUMPTION = 50;

    @Override
    public boolean test(ElectronicDevices v) {
        return v.getWatt() >= MAXIMUM_POWER_CONSUMPTION;
    }
}

