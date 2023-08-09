package JavaInselBuch.CaptainCao.Capture12Mathematisches;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Fraction extends Number implements Comparable<Fraction> {

    public final int NUMERATOR;
    public final int DEMINATOR;

    public Fraction(int numerator, int deminator) {
        if (deminator == 0) {
            throw new IllegalArgumentException("Nenner darf nicht 0 sein!");
        } else {
            int numeratorPuffer = numerator < 0 ? Math.negateExact(numerator) : numerator;
            int deminatorrPuffer = deminator < 0 ? Math.negateExact(deminator) : deminator;
            BigInteger bigInteger = BigInteger.valueOf(numeratorPuffer).gcd(BigInteger.valueOf(deminatorrPuffer));
            NUMERATOR = numeratorPuffer / bigInteger.intValue();
            DEMINATOR = deminatorrPuffer / bigInteger.intValue();
        }
    }

    public Fraction(int value) {
        this(value,1);
    }

    public Fraction mutiply(Fraction other) {
        return new Fraction(this.NUMERATOR * other.NUMERATOR, this.DEMINATOR * other.DEMINATOR);
    }

    public Fraction reziprocal() {return new Fraction(DEMINATOR,NUMERATOR);}

    @Override
    public int intValue() {
        return NUMERATOR/DEMINATOR;
    }

    @Override
    public long longValue() {
        return (long) NUMERATOR/DEMINATOR;
    }

    @Override
    public float floatValue() {
        return (float) NUMERATOR/DEMINATOR;
    }

    @Override
    public double doubleValue() {
        return (double) NUMERATOR/DEMINATOR;
    }
    @Override
    public int compareTo(Fraction o) {return Double.compare(doubleValue(),o.doubleValue());}

//Kann man auch generieren lassen
    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (!(other instanceof Fraction))
            return false;

        Fraction otherFraction = (Fraction) other;

        return NUMERATOR == otherFraction.NUMERATOR && DEMINATOR == otherFraction.DEMINATOR;
    }

    @Override
    public int hashCode() {
        int result = NUMERATOR;
        result = 31 * result + DEMINATOR;
        return result;
    }

    @Override
    public String toString() {
        return "{Portion = "+NUMERATOR+"/"+DEMINATOR+"}";
    }

    public static void main(String[] args) {
        Fraction Bier = new Fraction(5,10);
        Fraction fraction1 = new Fraction(60,10);
        System.out.println(Bier);
        System.out.println(Bier.hashCode());
        System.out.println(Bier.equals(fraction1));
        System.out.println(Bier.compareTo(fraction1));
        System.out.println(Bier.doubleValue());

    }


}
