package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5CountStringParts {
    public static void main(String[] args) {
        System.out.println(countMatches("bensteinengel","en"));
    }
    public static int countMatches(String text,String sign){
        if (text == null || text.length() == 0 || sign == null || sign.length() == 0)
            return 0;
        int count = 0;
        for (int index = 0 ; (index = text.indexOf(sign,index)) != -1; index += sign.length()){
            count++;
        }
        return count;
    }
}
