package JavaInselBuch.Beispiele.funktionaleInterfaceUndLamdas.lambdasMitFunktionalInterface;

public class MeinTester {
    public static void main(String[] args) {
        multiplizierer multiplizierer1 = (erste, zweite) -> erste*zweite;
        int summe = multiplizierer1.multipliziere(10,20);
        System.out.println(summe);
        System.out.println(multiplizierer1.multipliziere(50,20));
    }
}
