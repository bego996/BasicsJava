package JavaInselBuch.Beispiele.generics;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Generics <T> oder <Type> möglich, T ist die abkürzung.
        //Generics brauchen immer WrapperKlassen.
        //BeispielProgram Vorteil: Keine überladenen Methoden mit primitiven Datentypen mehr nötig :).

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {2.5, 4.6, 5.5};
        Character[] charArray = {'a', 'b', 'c'};


        auslesen(doubleArray);
        System.out.println();
        auslesen(charArray);
        System.out.println();
        auslesen(intArray);
        System.out.println();


        GenClass generic = new GenClass<>(intArray, doubleArray, charArray);
        System.out.println(Arrays.toString(generic.getObject()));
        System.out.println(Arrays.toString(generic.getObject2()));
        System.out.println(Arrays.toString(generic.getObject3()));
        generic.ausgeben();
        System.out.println();

        //Vararg Kontruktor.
        GenClass generic1 = new GenClass<>(doubleArray, 50, 50, 40, 5.4);
        generic1.ausgeben();
        System.out.println();


    }

    public static <T> void auslesen(T[] typeArray) {
        for (T object : typeArray) {
            System.out.println(object.getClass());
            System.out.println(object);
        }
    }
}
