package JavaInselBuch.CaptainCao.Capture11FortgeschriteneZeichenkettenverarbeitung_tutego_string_;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1NotationInSpaltenUndZeilenUmwandeln {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(parseA1Notation("AA34")));
    }

    private static int[] parseA1Notation(String notationOrigin) {
        //Hier ein neues Feature: Wir klammern die zwei ausdrücke um matcher.group 1 und 2 nutzen zu können. Wir erstellen Groups.
        Pattern pattern = Pattern.compile("^(\\p{Upper}+)(\\p{Digit}+)$");
        Matcher matcher = pattern.matcher(notationOrigin);
        if (matcher.find()) {
            String letter = matcher.group(1);
            String number = matcher.group(2);
            return new int[]{letterOrNumberToIntConverter(letter.toCharArray()),Integer.parseInt(number)};
        } else
            return new int[]{0, 0};
    }

    private static int letterOrNumberToIntConverter(char... letters) {
        int charPuffer = 0;
        if (letters.length == 1) {
            for (int i = 1, c = 65; i <= 26; i++, c++) {
                if (letters[0] == c) {
                    return i;
                }
            }
        } else if (letters.length > 1) {
            //Der int c in der schleife wird in der schleife auf einen char mit dem jeweiligen wert geprüft.
            for (int i = 1, c = 65; i <= 26; i++, c++) {
                if (letters[0] == c) {
                    charPuffer += i;
                    break;
                }
            }
            charPuffer += (letters.length - 1) * 26;
        }
        return charPuffer;
    }
}
