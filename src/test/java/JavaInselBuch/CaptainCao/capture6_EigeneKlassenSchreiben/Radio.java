package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

public class Radio extends ElectronicDevices {
    private final ElectronicDevices electronicDevices = new ElectronicDevices();
    int volume;
    private double frequency;
    private double minFrequenzy;
    private double maxFrequenzy;
    private Modulation modulation;

    //Kontruktor
    public Radio() {
    }

    public Radio(double frequency) {
        this.frequency = frequency;
    }

    public Radio(String senderName) {
        this.frequency = stationNameToFrequenzy(senderName);
    }


    //Methoden
    private void changeVolume(int preferedVolume) {
        if (preferedVolume >= 0 && preferedVolume <= 100)
            volume = preferedVolume;
    }

    void volumeUp() {
        if (volume < 100)
            volume++;
    }

    void volumeDown() {
        if (volume < 100)
            volume--;
    }


    public static double stationNameToFrequenzy(String senderName) {
        double senderFrequenzy = 0.0;
        if (senderName == null)
            return senderFrequenzy;
        switch (senderName) {
            case "Walking the Plank" -> senderFrequenzy = 98.3;
            case "Prirate Party" -> senderFrequenzy = 50.6;
            case "Drunken Pirats" -> senderFrequenzy = 10.8;
        }
        return senderFrequenzy;
    }

    public void setModulation(Modulation modulation) {
        this.modulation = modulation;
        if (this.modulation == Modulation.FM) {
            minFrequenzy = 87.5;
            maxFrequenzy = 108;
        } else if (this.modulation == Modulation.AM) {
            minFrequenzy = 148.5;
            maxFrequenzy = 26.1;
        }
    }

    public Modulation getModulation() {
        return modulation;
    }

    public void setMinFrequenzy(double minFrequenzy) {
        this.minFrequenzy = minFrequenzy;
    }

    public void setMaxFrequenzy(double maxFrequenzy) {
        this.maxFrequenzy = maxFrequenzy;
    }



    @Override
    public String toString() {
        return super.toString() +String.format("%nRadio[volume=%d,frequency=%.1f,is %s,Modulation=%s", volume, frequency, electronicDevices.isOn() ? "On" : "Off", modulation);
    }
}
