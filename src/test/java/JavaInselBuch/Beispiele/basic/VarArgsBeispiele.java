package JavaInselBuch.Beispiele.basic;

public class VarArgsBeispiele {
    public static void main(String[] args) {
        double[] arra = {1,2,3,4};
        System.out.println(avg(1,2,3,4,5));
        System.out.println(avg(5,arra));

    }
    public static double avg(int ed,double... array){ //Variable Parameter müssen immer am Ende stehen.
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        return  sum/array.length;
    }
}

