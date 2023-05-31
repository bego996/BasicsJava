package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

import java.awt.*;

public class capture4FindCinema {
    public static void main(String[] args) {
        Point[] points = {new Point(10, 20), new Point(12, 2), new Point(44, 4)};
        System.out.println(minDistance(points,3));
        System.out.println(minDistanceP(points,3));
    }

    static double minDistance(Point[] points,int size){
       final Point actualPosition = new Point(0,0);
       double minPoint = Double.MAX_VALUE;
        for (int i = 0; i < size ; i++) {
            minPoint = Math.min(actualPosition.distance(points[i]), minPoint);
        }
        return minPoint;
    }
    static Point minDistanceP(Point[] points,int size){
        final Point actualPosition = new Point(0,0);
        Point minPoint = points[0];
        for (int i = 0; i < size ; i++) {
           if (minPoint.distance(actualPosition) > points[i].distance(actualPosition))
               minPoint = points[i];
        }
        return minPoint;
    }
}
