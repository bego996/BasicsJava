package at.htl.klu3AAIF.DateAndTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class SimpleDateTime {
    public static void main(String[] args) {
        //a
        LocalTime present = LocalTime.now();
        System.out.println(present.toString());
        System.out.println();
        //b
        System.out.println("Stunden: " + present.getHour());
        System.out.println("Minuten: " + present.getMinute());
        System.out.println("Sekunden: " + present.getSecond());
        System.out.println("Nanosekunden: " + present.getNano());
        System.out.println();
        //c
        LocalTime lessonsBegin = LocalTime.of(7,50);
        System.out.println(lessonsBegin);
        System.out.println();
        //d
        LocalDateTime firstMoonLanding = LocalDateTime.of(1969,7,21,3,56,30);
        DateTimeFormatter one = DateTimeFormatter.ofPattern("dd.M.yyyy HH:mm");
        DateTimeFormatter two = DateTimeFormatter.ofPattern("dd.M.yyyy HH:m:ss");
        DateTimeFormatter three = DateTimeFormatter.ofPattern("dd.MMMM yy 'um' H:mm");
        DateTimeFormatter four = DateTimeFormatter.ofPattern("yyyy/MM/dd H'h' mm'm'");
        DateTimeFormatter five = DateTimeFormatter.ofPattern("EEEE','dd'.'MMMM yyyy H:mm 'Uhr'");
        System.out.println(firstMoonLanding.format(one));
        System.out.println(firstMoonLanding.format(two));
        System.out.println(firstMoonLanding.format(three));
        System.out.println(firstMoonLanding.format(four));
        System.out.println(firstMoonLanding.format(five));
        System.out.println();
        //e
        LocalDateTime now1 = LocalDateTime.now();
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now1.equals(now2));
        System.out.println();
        //f
        String[] dateTimeChain = {"20221005 102537123","05.10.2022 10:25:37,123","5.10.2022 10 h 25 min 37 s 123 ms","5/10/22 10-25-37,123","5. Oktober 2022 10:25:37.123"};
        DateTimeFormatter formatterNew = DateTimeFormatter.ofPattern("yyyyMMdd HHmmssSSS");
        DateTimeFormatter formatterNew1 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss,SSS");
        DateTimeFormatter formatterNew2 = DateTimeFormatter.ofPattern("d.MM.yyyy HH 'h' mm 'min' ss 's' SSS 'ms'");
        DateTimeFormatter formatterNew3 = DateTimeFormatter.ofPattern("d/MM/yy HH-mm-ss,SSS");
        DateTimeFormatter formatterNew4 = DateTimeFormatter.ofPattern("d. MMMM yyyy HH:mm:ss.SSS");
        DateTimeFormatter finalFormatter = DateTimeFormatter.ofPattern("dd.M.yyyy HH:mm:ss,MM");
        LocalDateTime first = LocalDateTime.parse(dateTimeChain[0],formatterNew);
        LocalDateTime second = LocalDateTime.parse(dateTimeChain[1],formatterNew1);
        LocalDateTime third = LocalDateTime.parse(dateTimeChain[2],formatterNew2);
        LocalDateTime fourth = LocalDateTime.parse(dateTimeChain[3],formatterNew3);
        LocalDateTime fifth = LocalDateTime.parse(dateTimeChain[4],formatterNew4);
        System.out.println(first.format(finalFormatter));
        System.out.println(second.format(finalFormatter));
        System.out.println(third.format(finalFormatter));
        System.out.println(fourth.format(finalFormatter));
        System.out.println(fifth.format(finalFormatter));
        System.out.println();
        //g
        LocalDateTime nowExtended = now1.plus(55, ChronoUnit.MINUTES);
        DateTimeFormatter extendFormat = DateTimeFormatter.ofPattern("dd.M.yyyy HH:mm:ss,SSS");
        System.out.println(nowExtended.format(extendFormat));
        System.out.println();
        //h
        LocalDateTime nowExtended2 = now1.plus(6, ChronoUnit.HOURS);
        DateTimeFormatter extendFormat2 = DateTimeFormatter.ofPattern("EEEE, dd.MM.yy HH:mm");
        System.out.println(nowExtended2.format(extendFormat2));
        System.out.println();
        //i
        System.out.println(now1.plus(1,ChronoUnit.DAYS).minus(24,ChronoUnit.HOURS));
        System.out.println(now1);
        if (now1.plus(1,ChronoUnit.DAYS).minus(24,ChronoUnit.HOURS).equals(now1)){
            System.out.println("Die beiden Daten sind Gleich!");
        }


    }
}
