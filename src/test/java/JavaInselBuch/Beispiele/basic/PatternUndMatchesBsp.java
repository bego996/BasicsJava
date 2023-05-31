package JavaInselBuch.Beispiele.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternUndMatchesBsp {
    public static void main(String[] args) {
        String s = new String("abcdabcdabcd");
        Pattern p = Pattern.compile("[a]*[b]*[c]*[a-z]*");
        Matcher m = p.matcher(s);

        if (m.matches()) {
            System.out.println(true);
        }
    }
}
