package JavaInselBuch.Beispiele.hashMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Eine Hashmap kann immer zwei Wete speichern : den Key und den Inhalt.
        Map map = new HashMap<>();
        map.put("Apfel",111);
        map.put("Birne",123);
        map.put("Kirsche",452);

        System.out.println(map.get("Apfel"));
        System.out.println(map.containsValue(123));
        map.replace("Kirsche",500);


        System.out.println();
        //Da man die forEach Schleife nicht bei Hashmaps nutzen kann .Verwandet man sie in eine Set Liste.
        Set<String> values = map.keySet();
        for (String i:values) {
            System.out.println("Die Frucht "+i+ " hatt den Wert " + map.get(i));
        }
        System.out.println();
        map.remove("Apfel");
        for (String i:values) {
            System.out.println("Die Frucht "+i+ " hatt den Wert " + map.get(i));
        }

    }
}
