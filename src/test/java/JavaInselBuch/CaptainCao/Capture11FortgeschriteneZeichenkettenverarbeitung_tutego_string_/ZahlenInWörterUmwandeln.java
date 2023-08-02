package JavaInselBuch.CaptainCao.Capture11FortgeschriteneZeichenkettenverarbeitung_tutego_string_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ZahlenInWörterUmwandeln {
    public static void main(String[] args) {
        textNumberFilter("150 bootles of beer make 200 Captain CiaoCiao's happy for 1 years or for 35 years maybe or 1000 years.");
    }

    public static void textNumberFilter(String text){
        //Hier nutzen wir eine Hilfsklasse um den string zu initialisieren.
        String[] numbersFromZeroToThousand = NumberInWordsHilfsKlasse.NUMBERS_FROM_ZERO_TO_THOUSAND;
        Pattern p = Pattern.compile("[0-9][0-9][0-9]+|[0-9]+");
        Matcher m = p.matcher(text);

        //Hier die kürzere Variante für den Pattern von oben. Bedeuted: die zahl 0-9 kann einmal oder mehrmals vorkommen.
        Pattern p2 = Pattern.compile("\\d+");
        Matcher m2 = p2.matcher(text);

        //Wir parsen das String matchresult in einen integer um ihn als array index der vorgefertigten zahlen liste nutzen zu können.
        System.out.println(m.replaceAll(matchResult -> numbersFromZeroToThousand[Integer.parseInt(matchResult.group())]));
        //Der zweite kürzere matcher.
        System.out.println(m2.replaceAll(matchResult -> numbersFromZeroToThousand[Integer.parseInt(matchResult.group())]));

        //Noch eine Variante mit zwei anderen matcher() methoden in dem Musterbeispiel Ordner.
    }
}
