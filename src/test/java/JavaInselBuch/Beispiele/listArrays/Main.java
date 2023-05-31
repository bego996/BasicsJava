package JavaInselBuch.Beispiele.listArrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(5);
        primeNumbers.add(6);

        List<Boolean> signs = new ArrayList<>();
        signs.add(true);
        signs.add(false);

        List<Character> chars = new ArrayList<>();
        chars.add('a');
        chars.add('i');

        List<String> chains = new ArrayList<>();
        chains.add("Text");
        chains.add("Datei");

        List<Object> objects = new ArrayList<>();
        objects.add('s');
        objects.add("sas");
        objects.add(15);


        System.out.println(primeNumbers.get(1));
        for (int i = 0 ; i < primeNumbers.size(); i++) {
            System.out.println(primeNumbers.get(i));
        }
        primeNumbers.remove(0);
        System.out.println(primeNumbers.contains(6));

        for (Object i: objects) {
            System.out.println(i.getClass());
        }
        System.out.println();
        objects.remove(objects.indexOf('s'));
        //ForEach schleife mit Lambda für Funktonal interfaces.
        objects.forEach(System.out::println);

    }
}
