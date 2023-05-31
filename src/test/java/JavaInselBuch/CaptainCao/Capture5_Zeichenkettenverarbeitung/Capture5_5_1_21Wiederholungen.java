package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5_5_1_21Wiederholungen {
    public static void main(String[] args) {
        String a = null;
        String b = "";
        String c = "a";
        String d = "";
        repeatingStrings("BegoBego");


    }
    public static void repeatingStrings(String input){System.out.println(prepareRepeatingStrings(input));}
    public static String prepareRepeatingStrings(String str){
        int trueIndex = lengthToSearch(str);
        if (trueIndex == 0)
            return null;
        String buffer = "";
        char mainSign = str.charAt(0);
        if (trueIndex == 1)
            return String.valueOf(mainSign);
        else if (trueIndex == str.length()){
            for (int i = 3; i < str.length() ; i+=2) {
                buffer = str.substring(0,i).repeat(str.length()/i);
                if (buffer.equals(str))
                    return buffer.substring(0,i);
            }
        }else {
            for (int i = 2; i <= str.length()/2 ; i++) {
                buffer = str.substring(0,i).repeat(str.length()/i);
                if (buffer.equals(str))
                    return buffer.substring(0,i);
            }
        }
        return null;
    }
    public static int lengthToSearch(String txt){
        if (txt.length() > 1) {
            char mainSign = txt.charAt(0);
            String buffer = "";
            buffer = String.valueOf(mainSign).repeat(txt.length());
            if (buffer.equals(txt))
                return 1;
            buffer = txt.substring(1);
            if (!buffer.contains(Character.toString(mainSign)))
                return 0;
            if (txt.length() % 2 == 1)
                return txt.length();
            else
                return txt.length() / 2;
        }else
            return 0;
        }
    }

