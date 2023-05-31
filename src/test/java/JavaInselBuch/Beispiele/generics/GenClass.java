package JavaInselBuch.Beispiele.generics;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Die Klasse muss den Generixc kürzel enthalten um davon objekte erzeugen zu können. <T> in unserem Fall.
public class GenClass <T>{

    T[] object;
    T[] object2;
    T[] object3;
    //Alles was in die <> eingefügt wird ist ein Generic.Alle Wrapperklassen möglich. zb. Object,Type(oder nur T),Integer usw...
    List<T> chain = new ArrayList<>();


    public GenClass(T[] daten, T[] daten2, T[] daten3) {
        this.object = daten;
        this.object2 = daten2;
        this.object3 = daten3;
        chain.addAll(List.of(object));
        chain.addAll(List.of(object2));
        chain.addAll(List.of(object3));
    }

    @SafeVarargs
    public GenClass(T[] daten, T... folgeDaten) {
        chain.addAll(List.of(daten));
        chain.addAll(List.of(folgeDaten));
    }

    public void ausgeben() {
        System.out.println(chain);
        System.out.println(chain.size());
    }


    public T[] getObject() {
        return object;
    }

    public void setObject(T[] datentyp) {
        this.object = datentyp;
    }

    public T[] getObject2() {
        return object2;
    }

    public void setObject2(T[] object2) {
        this.object2 = object2;
    }

    public T[] getObject3() {
        return object3;
    }

    public void setObject3(T[] object3) {
        this.object3 = object3;
    }

    public List<T> getChain() {
        return chain;
    }

    public void setChain(List<T> chain) {
        this.chain = chain;
    }
}
