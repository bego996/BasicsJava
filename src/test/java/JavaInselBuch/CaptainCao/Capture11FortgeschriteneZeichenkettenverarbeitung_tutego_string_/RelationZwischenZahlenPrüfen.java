package JavaInselBuch.CaptainCao.Capture11FortgeschriteneZeichenkettenverarbeitung_tutego_string_;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RelationZwischenZahlenPrüfen {
    public static void main(String[] args) {
        System.out.println(prüfer("4 < 4 > 2 > 1 = 1"));
    }

    private static boolean prüfer(String chain) {
        boolean canPasse = false;
        List<String> list = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\d+|[<>=]+").matcher(chain);
        while (matcher.find()) {
            list.add(matcher.group());
        }
        if (list.size() == 1 && list.get(0).matches("\\d")) {
            return true;
        } else if (list.size() >= 3) {
            for (int i = 1; i < list.size() - 1; i+=2) {
                switch (list.get(i)) {
                    case "<" -> canPasse = Integer.parseInt(list.get(i - 1)) < Integer.parseInt(list.get(i + 1));
                    case "=" -> canPasse = Integer.parseInt(list.get(i - 1)) == Integer.parseInt(list.get(i + 1));
                    case ">" -> canPasse = Integer.parseInt(list.get(i - 1)) > Integer.parseInt(list.get(i + 1));
                }
            }
        }
        return canPasse;
    }
}

