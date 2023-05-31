package JavaInselBuch.Beispiele.basic;

public class RekursiveMethoden {
    public static void main(String[] args) { //Stackoverflow möglich bei tiefer verschachtelung der Rekursion. Lösung : JVM Schalter (Java Insel).
        test(0);
        down1(5);
        down2(5);


    }
    static void down1(int n) { //Endrekursion
        if (n <= 0)
            return;
        System.out.print(n + ",");
        down1(n - 1);
    }
    static void down2(int n) { //Rekursion
        if (n <= 0)
            return;
        down2(n - 1);
        System.out.print(n + ",");
    }
    static void test(int number){ //Rekursion
        if (number == 3) {
            return;
        }
        number++;
        System.out.println(number);
        test(number);
        System.out.println(number);
    }
}
