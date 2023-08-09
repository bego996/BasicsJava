package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

import java.awt.Polygon;
import java.util.Random;

public class BermudaTriangle {
    public static void main(String[] args) {
        java.awt.Polygon bermuda = new java.awt.Polygon();
        bermuda.addPoint(10, 40);
        bermuda.addPoint(20, 5);
        bermuda.addPoint(40, 20);
        final int dimension = 50;
        final String Octupus = "X";
        final String Rainbow = ".";
        for (int y = 0; y < dimension; y++) {
            for (int x = 0; x < dimension; x++)
                System.out.print(createRandomTriangle().contains(x, y) ? Octupus : Rainbow);
            System.out.println();
        }
    }

    public static Polygon resetWithRandomTriangle(Polygon polygon) {
        polygon.reset();
        polygon.addPoint(10, 15);
        polygon.addPoint(10, 30);
        polygon.addPoint(30, 7);
        return polygon;
    }

    public static Polygon createRandomTriangle() {
        Polygon poly = new Polygon();
        Random rg = new Random();
        poly.addPoint(rg.nextInt(50), rg.nextInt(50));
        poly.addPoint(rg.nextInt(50), rg.nextInt(50));
        poly.addPoint(rg.nextInt(50), rg.nextInt(50));
        return poly;
    }
}

