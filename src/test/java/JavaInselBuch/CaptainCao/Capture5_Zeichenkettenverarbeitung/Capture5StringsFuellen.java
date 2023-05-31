package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5StringsFuellen {
    public static void main(String[] args) {
        System.out.println(mixStrings("Putenknacker!","\uD83D\uDC7B"));
    }
    public static String mixStrings(String str,String pattern){
        StringBuilder sb = new StringBuilder();
        if (str == null || str.isEmpty())
            return sb.toString();
        if (pattern == null || pattern.isEmpty())
            return sb.append(str).toString();
        for (int i = 0; i < str.length() ; i++) {
            sb.append(i < str.length()-1 ? str.charAt(i)+pattern : str.charAt(i));
        }
        return sb.toString();
    }
}
