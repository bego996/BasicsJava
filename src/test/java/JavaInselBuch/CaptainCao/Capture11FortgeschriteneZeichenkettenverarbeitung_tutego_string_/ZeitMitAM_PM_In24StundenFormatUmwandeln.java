package JavaInselBuch.CaptainCao.Capture11FortgeschriteneZeichenkettenverarbeitung_tutego_string_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZeitMitAM_PM_In24StundenFormatUmwandeln {
    public static void main(String[] args) {
        System.out.println(zeitConverter("Wir überfallen den Hafen um 9:00 pm und treffen uns auf der Amüsiermeile um 11:20 AM und danach um 1:59 a.m."));
    }

    public static String zeitConverter(String zeichenkette) {
        //Matcher matcher = Pattern.compile("1*[0-9]*:[0-5]*[0-9] (a.m.|AM)").matcher(zeichenkette);
        //return matcher.replaceAll(matchResult -> convertAM(matchResult.group(1)));


        //Noch kompakter und gleiche logik wie eine Zeile weiter.
        //Pattern pattern = Pattern.compile("(\\d{1,2}:\\d{2})\\s?(a\\.m\\.|p\\.m\\.|AM|PM)", Pattern.CASE_INSENSITIVE);

        Pattern pattern = Pattern.compile("(\\d{1,2}:\\d{2}) (a\\.m\\.|AM)|(\\d{1,2}:\\d{2}) (PM|pm)");
        Matcher matcher = pattern.matcher(zeichenkette);
        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
            String time = matcher.group();
            if (time.endsWith("PM") || time.endsWith("pm")){
                String convertedTimeFromPM = convertPM(time);
                matcher.appendReplacement(sb,convertedTimeFromPM);
            }else {
                //group(1) nimmt die gefundendene zeichenkette vor dem leerzeichen der gesamten zeichenkette
                String convertedTime = convertAM(time);
                matcher.appendReplacement(sb, convertedTime);
            }
        }
        matcher.appendTail(sb);
        return sb.toString();

    }

    private static String convertAM(String time) {
        if (time.equals("12:00")) {
            return "00:00 Uhr";
        } else if (time.startsWith("12")) {
            return "00" + time.substring(2,5) + " Uhr";
        }else {
            return "0" + time.substring(0,4) + " Uhr";
        }
    }
    private static String convertPM(String time){
        if (time.startsWith("12:00")){
            return "12:00 Uhr";
        } else if (time.startsWith("12")) {
            return "12"+time.substring(2,5)+" Uhr";
        }else {
            String chainToWhitespace = time.substring(0,time.indexOf(" "));
            if (chainToWhitespace.length() == 4){
                return Integer.parseInt(time.substring(0, 1)) + 12 + time.substring(1,4) +" Uhr";
            }else
                return Integer.parseInt(time.substring(0, 2)) + 12 + time.substring(2,5) +" Uhr";
        }
    }
}

