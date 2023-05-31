package JavaInselBuch.Beispiele.listArrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<>();
        set.add(15.5);
        set.add(16.4);
        set.add(5.4);
        for (Double i: set) {
            System.out.println(i);
        }
        System.out.println();
        Set immutableSet = Set.of(10.5,12.4,1.1);
        set.addAll(Set.of(10.5,5.4));
        for (Double i: set) {
            System.out.println(i);
        }
        System.out.println();


        //TreeSet sortiert das Set.
        Set<Integer> numbs = new TreeSet<>();
        numbs.add(5);
        numbs.add(10);
        numbs.add(3);
        numbs.add(1);
        for (int i: numbs ) {
            System.out.println(i);
        }
    }
}
