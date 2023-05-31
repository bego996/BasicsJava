package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;



public class Capture5ichereUebermittlungTwice {
    public static void main(String[] args) {
        System.out.println(isEveryCharacterTwice("aaaibbaa"));
    }
    public static int isEveryCharacterTwice(String str){
        if (str.length() % 2 == 1 )
            return 0;
        else {
            int i = 0;
            while (i < str.length()-1){
                if (str.charAt(i) != str.charAt(i+1))
                   return -(i+1);
                i +=2;
            }
        }
        return 1;
    }
}
