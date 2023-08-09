package JavaInselBuch.CaptainCao;


import JavaInselBuch.CaptainCao.Capture12Mathematisches.Fraction;
import JavaInselBuch.CaptainCao.Capture12Mathematisches.RoundingMode;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        /*
        Comparator<String> comparator = Comparator.naturalOrder();
        System.out.println(comparator.compare("a","ä"));
        System.out.println(comparator.compare("ä","a"));
        System.out.println();
        char a = '.';
        System.out.println((int) a);
        System.out.println( Math.floor(2.6));
        System.out.println();

        Comparator<Object> collator = Collator.getInstance(Locale.GERMAN);
        System.out.println(collator.compare("a","ä"));
        System.out.println(collator.compare("ä","a"));

        BigDecimal bigDecimal = BigDecimal.valueOf(15.557777777777777777777777777777);
        System.out.println(bigDecimal);

         */
        Fraction fraction = new Fraction(500,5);
        Fraction fraction2 = new Fraction(40,5);
        System.out.println(fraction.mutiply(fraction2).NUMERATOR);
        System.out.println(fraction.mutiply(fraction2).DEMINATOR);
        System.out.println(fraction.reziprocal().NUMERATOR);
        System.out.println(fraction.reziprocal().DEMINATOR);





    }
}


