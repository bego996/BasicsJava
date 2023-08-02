package JavaInselBuch.CaptainCao.Capture11FortgeschriteneZeichenkettenverarbeitung_tutego_string_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SchreiendeTexteentschaerfen {
    public static void main(String[] args) {
        System.out.println(silentShoutingWords("BEGO ist Hier, sag HALLo."));
    }
    public static String silentShoutingWords(String word){
        Pattern pattern = Pattern.compile("\\p{Upper}{3,}");
        Matcher matcher = pattern.matcher(word);
        return matcher.replaceAll(matchResult -> matchResult.group().toLowerCase());
        //Der einzeiler für oben...
        //return Pattern.compile("\\p{Upper}{3,}")
        // .matcher(word)
        // .replaceAll(matchResult -> matchResult.group().toLowerCase());
    }
}
