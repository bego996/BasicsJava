package JavaInselBuch.CaptainCao.Capture12Mathematisches;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZahlFuerZahlUberDasTelefon {
    private static BigInteger completeNumber(int... numbers){
        StringBuilder chain = new StringBuilder();
        for (int number : numbers) {
            chain.append(number);
        }
        return new BigInteger(chain.toString());
    }

    public static void main(String[] args) {
        System.out.println(completeNumber(15,16,17,888));

    }
}
