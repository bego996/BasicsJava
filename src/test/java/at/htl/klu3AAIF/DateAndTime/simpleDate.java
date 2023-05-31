package at.htl.klu3AAIF.DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class simpleDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println("Jahr: " + today.getYear());
        System.out.println("Monat: " + today.getMonthValue());
        System.out.println("Tag: " + today.getDayOfMonth());
        System.out.println();
        LocalDate birthday = LocalDate.of(1996, 1, 4);
        System.out.println(birthday);
        DateTimeFormatter formatter0 = DateTimeFormatter.ofPattern("dd'.'MM'.'yyyy");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd'.'M'.'yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd'.'M'.'yy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd'/'M'/'yyyy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd'.'MMMM' 'yyyy");
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("dd'.'MMM' 'yyyy");
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("EEEE','dd'.'MMMM' 'yyyy");


        System.out.println(birthday.format(formatter0));
        System.out.println(birthday.format(formatter1));
        System.out.println(birthday.format(formatter2));
        System.out.println(birthday.format(formatter3));
        System.out.println(birthday.format(formatter4));
        System.out.println(birthday.format(formatter5));
        System.out.println(birthday.format(formatter6));
        System.out.println();
        if (!birthday.equals(LocalDate.now())) {
            System.out.println("Ich bin heute nicht geboren!");
            System.out.println(birthday);
            System.out.println(LocalDate.now());
        }
        System.out.println();
        LocalDate first = LocalDate.of(1996, 4, 5);
        LocalDate second = LocalDate.of(1996, 4, 5);
        DateTimeFormatter formatterFirst = DateTimeFormatter.ofPattern("yyyy'/'MM'/'dd");
        DateTimeFormatter formatterSecond = DateTimeFormatter.ofPattern("dd'.'M'.'yyyy");
        System.out.println(first.format(formatterFirst));
        System.out.println(second.format(formatterSecond));
        if (first.equals(second)) {
            System.out.printf("Das Datum '%s' ist gleich dem datum '%s'", first.format(formatterFirst), second.format(formatterSecond));
        }
        System.out.println();
        System.out.println();
        LocalDate todayPlus15 = today.plusDays(15);
        DateTimeFormatter formatterActual = DateTimeFormatter.ofPattern("dd'.'M'.'yyyy");
        System.out.println(todayPlus15.format(formatterActual));
        todayPlus15 = today.plus(15, ChronoUnit.DAYS);
        System.out.println(todayPlus15.format(formatterActual));
        //h)
        LocalDate today2 = todayPlus15.minus(15, ChronoUnit.DAYS);
        System.out.println(todayPlus15.minusDays(15).equals(today2));
        System.out.println();
        //i)
        DateTimeFormatter birthdayChanged = DateTimeFormatter.ofPattern("dd. MMMM yyyy");
        System.out.println("Mein 18. Geburtstag ist am " + birthday.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.GERMANY) + " " + birthday.plusYears(18).format(birthdayChanged));
        //j)
        System.out.println();
        if (!today.isBefore(birthday.plusYears(27))) {
            System.out.println("Der Geburtstag war heuer bereits!");
        } else
            System.out.println("Der Gebutstag kommt heuer noch!");

        //k)
        System.out.println();
        LocalDate test = LocalDate.of(2023, 5, 15);
        if (today.isAfter(test)) {
            System.out.println("Der 15. Mai ist bereits vorbei!");
        } else
            System.out.println("Der 15 Mai kommt heuer erst!");

        //l)
        String[] dateChain = new String[]{"20221005", "05.10.2022", "5.10.2022", "5/10/22", "5.Oktober 2022"};
        DateTimeFormatter formatterNew = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter formatterNew1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter formatterNew2 = DateTimeFormatter.ofPattern("d.MM.yyyy");
        DateTimeFormatter formatterNew3 = DateTimeFormatter.ofPattern("d/MM/yy");
        DateTimeFormatter formatterNew4 = DateTimeFormatter.ofPattern("d.MMMM yyyy");
        LocalDate first0 = LocalDate.parse(dateChain[0], formatterNew);
        LocalDate first1 = LocalDate.parse(dateChain[1], formatterNew1);
        LocalDate first2 = LocalDate.parse(dateChain[2], formatterNew2);
        LocalDate first3 = LocalDate.parse(dateChain[3], formatterNew3);
        LocalDate first4 = LocalDate.parse(dateChain[4], formatterNew4);

        System.out.println(first0.format(formatterSecond));
        System.out.println(first1.format(formatterSecond));
        System.out.println(first2.format(formatterSecond));
        System.out.println(first3.format(formatterSecond));
        System.out.println(first4.format(formatterSecond));


    }
}

