package JavaInselBuch.CaptainCao.Capture11FortgeschriteneZeichenkettenverarbeitung_tutego_string_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUndPatternsUndMatcher {
    public static void main(String[] args) {
        String zeichen = "Ing. Dr. Bego Jukic... let's go!";
        Pattern pattern = Pattern.compile("\\d{8}.*");
        Pattern pattern1 = Pattern.compile("^[\\d\\D]{5,10}$");
        Pattern pattern2 = Pattern.compile("^[a-zA-Z]*[.?,!]$");
        Pattern pattern3 = Pattern.compile("^\\D+$");
        Pattern pattern4 = Pattern.compile("^[\\d\\D]*(Prof\\.|Dr\\.|Dr\\. med\\.|Dr\\.h\\.c\\.|Ing\\.)[\\d\\D]*$");
        Matcher matcher = pattern.matcher(zeichen);
        Matcher matcher1 = pattern1.matcher(zeichen);
        Matcher matcher2 = pattern2.matcher(zeichen);
        Matcher matcher3 = pattern3.matcher(zeichen);
        Matcher matcher4 = pattern4.matcher(zeichen);
        if (matcher4.matches()) {
            System.out.println("ist ein Match");

        }
        else
            System.out.println("kein match");
    }
}
