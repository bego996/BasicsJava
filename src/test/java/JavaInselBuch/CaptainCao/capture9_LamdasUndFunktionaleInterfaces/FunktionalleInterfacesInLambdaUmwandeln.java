package JavaInselBuch.CaptainCao.capture9_LamdasUndFunktionaleInterfaces;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.*;

public class FunktionalleInterfacesInLambdaUmwandeln {
    //Comsumer: etwas wird consumiert aber nicht zurückgegeben.
    //Predicate: Ein test wird vorgenommen, ein wert kommt rein und ein boolean zurück.
    //Supplier : Etwas wird produziert und zurückgegeben , aber keine eingabe erwartet.
    //Function : Etwas wird transormiert, ein wert kommt hinein und ein wert hinaus:
    //Operator: Besondere funciton bei der der eingabe sowie ausgbaetyp immer gleich sind, unterschied zu Function.



        //Teil1
    public static <T> void main(String[] args) {
        //Lambdas können verwendet werden überall wo funktionale interfaces verwendet werden. ForeachSchleifen,Threads und Runnable,Streams,Eventhandler.
        Runnable runnable = () -> System.out.println("Ein runnable!");
        ActionListener actionListener = (e) -> System.out.println(e.getActionCommand());
        Supplier<String> supplier = () -> "sdd";
        Consumer<Point> consumer = (Point a) -> System.out.println(a.getLocation());
        Comparator<Rectangle> comparator = (o1, o2) -> o1.x - o2.x;

        Rectangle first = new Rectangle();
        first.setBounds(5,10,50,100);
        Rectangle second = new Rectangle(10,15,100,200);
        System.out.println(comparator.compare(first,second));

        System.out.println(supplier.get());
        runnable.run();
        Point point = new Point(5,10);
        consumer.accept(point);
        System.out.println();

        //Teil2
        double a = 5.5, b = 10.2;
        DoubleSupplier supplier1 = () -> a*b;
        System.out.println(supplier1.getAsDouble());
        System.out.println();

        LongToDoubleFunction longToDoubleFunction = (long value) -> value;
        System.out.println(longToDoubleFunction.applyAsDouble(567984L));
        System.out.println();

        String test = "Ein test ";
        UnaryOperator<String> unaryOperator = (o1) -> o1;
        System.out.println(unaryOperator.apply(test.trim()));





    }
}