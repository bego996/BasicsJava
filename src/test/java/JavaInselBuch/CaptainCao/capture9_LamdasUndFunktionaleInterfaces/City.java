package JavaInselBuch.CaptainCao.capture9_LamdasUndFunktionaleInterfaces;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class City {
    public final String name;
    public final int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public static void main(String[] args) {
        List<City> cityTour = new ArrayList<>();
        City g = new City("Gotham (Cathedral)", 8_000_000);
        City m = new City("Metropolis (treasure Garden)", 1_600_000);
        City h = new City("Hogsmead (Shoping Street)", 1_124);
        Collections.addAll(cityTour, g, m, h);
        Consumer<City> cityConsumer = (city) -> System.out.println(city.name);
        cityTour.forEach(cityConsumer);
        System.out.println();

        Predicate<City> smallTownFilter = city -> city.population <= 10000;
        //Auch möglich (verkürzt) das Predicate object nicht zu erstellen sondern gleich : cityTour.removeIf(city -> city.population <= 10000);
        cityTour.removeIf(smallTownFilter);
        //Hier wird nur ausgelesen mit einer schleife.
        cityTour.forEach(cityConsumer);
        System.out.println();

        UnaryOperator<City> textRemover = city -> new City(city.name.substring(0, city.name.indexOf(" (")), city.population);
        //Hier auch möglich wie oben , dass Interface object nicht zu erstellen sondern direct reinzuschreiben.
        //Auch möglich mit Pattern regex alles zu schreiben anstatt mit der substring methode.
        cityTour.replaceAll(textRemover);
        //Wieder nur auslesen.
        cityTour.forEach(cityConsumer);
        System.out.println();

        //Hier wird der Text konvertiert mit beistrich ausgegeben.
        Consumer<City> convertedCityText = (city) -> System.out.println(city.name+","+city.population);
        cityTour.forEach(convertedCityText);
    }
}
