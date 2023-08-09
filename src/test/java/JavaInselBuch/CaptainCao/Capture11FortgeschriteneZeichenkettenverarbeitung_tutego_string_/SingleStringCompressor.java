package JavaInselBuch.CaptainCao.Capture11FortgeschriteneZeichenkettenverarbeitung_tutego_string_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SingleStringCompressor {
    public static void main(String[] args) {
        System.out.println(compress("~~~!!---+++...-.+!~"));
        System.out.println(decompress(compress("~~~!!---+++...-+.!~")));
    }

    private static String compress(String input){
        //Erweiterbar um chars im pattern. Das ist meine Variante.
        Matcher matcher = Pattern.compile("-+|\\.+|\\++|!+").matcher(input);
        //Hier selbe Logik wie oben , nur kompakter und mit einer Backrefence \\1* bedeuted : Die erste Gruppe , jedes Zeichen kann kein oder mehrmal vorkommen. Wir prüfen alle nicht Ziffern der Ascci-Tabelle.
        Matcher matcher1 = Pattern.compile("([!-/:-~])\\1*").matcher(input);
        StringBuffer sb = new StringBuffer();
        while (matcher1.find()){
            matcher1.appendReplacement(sb,String.format("%c%s",matcher1.group().charAt(0),matcher1.group().length() == 1 ? "" : matcher1.group().length()));
        }
        matcher1.appendTail(sb);
        return sb.toString();
    }
    private static String decompress(String input){
        Matcher matcher = Pattern.compile("(\\p{ASCII})(\\p{Digit}+)").matcher(input);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()){
            matcher.appendReplacement(sb,String.format("%s",matcher.group(1).repeat(Integer.parseInt(matcher.group(2)))));
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}
