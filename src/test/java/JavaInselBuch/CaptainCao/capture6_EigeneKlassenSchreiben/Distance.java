package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

import java.awt.*;

interface Distance {
    int meter();

    default int kilometer() {
        return meter() / 1000;
    }

    static Distance ofMeter(int value) {
        return new DistanceImplementation(value);
    }

    static Distance ofKilometer(int value) {
        return new DistanceImplementation(value * 1000);
    }
}

