package JavaInselBuch.CaptainCao.capture10BesondereTypenDerJavaSE;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Comparator;

public class PunkteAbstandZurBrauerei {
    //Implementierte classe mit dem interface comparator um zwei Point Objecte zu vergleichen.
    static class pointComparator implements Comparator<Point> {
        //Hier könnte man auch eine Variable erstellen für den Nullpunkt von Point.
        @Override
        public int compare(Point o1, Point o2) {
            double distanzeToZeroPoiont1 = o1.distanceSq(0, 0);
            double distanzeToZeroPoiont2 = o2.distanceSq(0, 0);
            return Double.compare(distanzeToZeroPoiont1, distanzeToZeroPoiont2);
        }
    }


    public static void main(String[] args) {
        Point[] points = {new Point(7, 8), new Point(1, 2), new Point(5, 6), new Point(3, 4), new Point(-1, -1)};
        Arrays.sort(points, new pointComparator());
        System.out.println(Arrays.toString(points));


    }
}
