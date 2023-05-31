package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5SumOfTheDigits {
    public static void main(String[] args) {
        System.out.println(digitSum(515.5f));
    }
    public static int digitSum(float value){return digitSum(String.valueOf(value));}
    public static int digitSum(String value){
        int quersumme = 0;
        char[] buffer = value.replace(".","").toCharArray();
        for (char sign:buffer) {
            quersumme += Character.getNumericValue(sign);
        }
        return quersumme;
    }
}
