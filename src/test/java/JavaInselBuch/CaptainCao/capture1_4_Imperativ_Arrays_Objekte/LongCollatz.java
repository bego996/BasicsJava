package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

public class LongCollatz {
    public static void main(String[] args) {
        System.out.println(longColatz(longColatzMax(7)));


    }


    public static String longColatz(int n) {
        StringBuilder sb = new StringBuilder();
        System.out.print(n);
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
                sb.append("," + n);
            } else if (n % 2 == 1) {
                n = n * 3 + 1;
                sb.append("," + n);
            }
        }
        return sb.toString();
    }

    public static int longColatzMax(int n) {
        int min = Integer.MIN_VALUE;
        if (n > min)
            min = n;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
                if (n > min)
                    min = n;
            } else if (n % 2 == 1) {
                n = n * 3 + 1;
                if (n > min)
                    min = n;
            }
        }
        return min;
    }
}


