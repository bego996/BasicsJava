package JavaInselBuch.CaptainCao.capture10BesondereTypenDerJavaSE;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Store {
    public final Point ZERO_LOCATION_BEER = new Point(0, 0);
    private Point location;
    private String name;

    public Store(){}
    public Store(Point stores, String name) {
        this.location = stores;
        this.name = name;
    }

    public Store setLocation(Point location) {
        this.location = location;
        return this;
    }

    public Store setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Point getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return String.format("Store [name=%s],[location=%s]",name,location);
    }

    //A static method to sort the stores in contrast to the center location.
    public static List<Store> findStoresAround(Collection<Store> stores, Point center){
        List<Store> stores1 = new ArrayList<>(stores);
        //An anonymous class with comparator implementation.
        Comparator<Store> storeComparator = (o1, o2) -> {
            double firstStoreToLocation = o1.location.distanceSq(center);
            double secondStoreToLocation = o2.location.distanceSq(center);
            return Double.compare(firstStoreToLocation,secondStoreToLocation);
        };
        stores1.sort(storeComparator);
        return stores1;
    }


    public static void main(String[] args) {
        List<Store> someStoresToCompare = new ArrayList<>();
        Store store = new Store(new Point(5,5),"Donut");
        Store store3 = new Store(new Point(6,6),"Bakers");
        Store store4 = new Store(new Point(15,20),"Survivors");
        //Hier haben wir kaskadiert ein objekt erstellt und wir brauchen eigenlich dafür nur einen leeren konstruktor.
        Store store2 = new Store().setName("Chipie").setLocation(new Point(10,3));
        someStoresToCompare.add(store);
        someStoresToCompare.add(store3);
        someStoresToCompare.add(store4);
        someStoresToCompare.add(store2);
        System.out.println(someStoresToCompare);
        System.out.println();
        //Call of the static method findStoresAround() to sort the list.
        someStoresToCompare = Store.findStoresAround(someStoresToCompare,new Point(20,20));
        someStoresToCompare.forEach(System.out::println);
    }
}
