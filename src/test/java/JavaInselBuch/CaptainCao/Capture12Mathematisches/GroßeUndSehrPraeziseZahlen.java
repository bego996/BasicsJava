package JavaInselBuch.CaptainCao.Capture12Mathematisches;

import java.math.BigInteger;

public class GroßeUndSehrPraeziseZahlen {
    public static void main(String[] args) {
        long a = Long.MAX_VALUE;
        long b = 15;
        long result = checkForNumberOverlap(a,b);
        System.out.println(result);



    }
    private static long checkForNumberOverlap(long first,long second){
        BigInteger first0 = BigInteger.valueOf(first);
        BigInteger second0 = BigInteger.valueOf(second);
        BigInteger result = first0.add(second0).divide(BigInteger.TWO);
        return result.longValue();
    }
}
