package JavaInselBuch.Beispiele.basic;

public class pointMethUebung {
    public static void main(String[] args) {


        java.awt.Point p = new java.awt.Point();
        p.x = 1;
        p.y = 2 + p.x;

        java.awt.Point player = new java.awt.Point(60,60);
        java.awt.Point door = new java.awt.Point();
        door.setLocation(60,100);
        System.out.println(player.distance(door));
        System.out.println(door);
        System.out.println(player);
        long size = new java.io.File("file.txt").length();
        System.out.println(size);

    }
}
