package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;


import java.util.Arrays;

public class capture4ArrayReverse {
    public static void main(String[] args) {
        double[] numbers = {1,2,3,4,5};
        reverse(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void reverse(double[] numbers){
        for (int i = 0; i < numbers.length/2; i++) {
            double temp = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = temp;
        }
    }
}
