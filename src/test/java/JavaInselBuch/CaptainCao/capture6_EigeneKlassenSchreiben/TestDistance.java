package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

import JavaInselBuch.Beispiele.funktionaleInterfaceUndLamdas.Interface.HundInterface;
import JavaInselBuch.CaptainCao.capture10BesondereTypenDerJavaSE.Distances;

import java.awt.*;

public class TestDistance {
    public static void main(String[] args) {
        Distance oneKm = Distance.ofMeter(1000);
        Distance someMeter = Distance.ofKilometer(2);
        System.out.println(someMeter.kilometer());
        System.out.println(someMeter.meter());
        System.out.println();

        //Statische Methoden vom interface können nur mit einem Objekt von Interface genutzt werden.
        Distance distance = Distance.ofKilometer(500);


        DistanceImplementation distanceImplementation = new DistanceImplementation(1000);
        System.out.println(distanceImplementation.kilometer());

        System.out.printf("2 km = %d km, %d m%n",someMeter.kilometer(),someMeter.meter());
        System.out.printf("1000 m = %d km, %d m%n",oneKm.kilometer(),oneKm.meter());


    }
}
