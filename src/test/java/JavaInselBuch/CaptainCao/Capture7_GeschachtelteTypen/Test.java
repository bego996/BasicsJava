package JavaInselBuch.CaptainCao.Capture7_GeschachtelteTypen;


import JavaInselBuch.CaptainCao.Capture8_Exceptions.IlegalWattException;
import JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben.Radio;
//Wir können wie hier ein statischen import machen, enums sind standartmäßig static. Oder ein enum import, oder eine vollständige qualifizierung.
import static JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben.Radio.Modulation.*;

public class Test {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setModulation(FM);
        System.out.println(radio);
        try {
            radio.setWatt(0);
        }catch (IlegalWattException e){
            System.out.println("Aufgefangen!");
        }finally {
            System.out.println("Weiter gehts!");
        }
    }
}
