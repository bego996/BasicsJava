package JavaInselBuch.Beispiele.dateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, Month.JANUARY,15);
        System.out.println(date);

        LocalTime time = LocalTime.of(16,16,5);

        System.out.println(time);

        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = ldt.plusMonths(2).plusDays(10).minusSeconds(15);
        System.out.println(ldt);
        System.out.println(ldt2);
        System.out.println(ldt.toLocalDate().isLeapYear());
        System.out.println(ldt.isBefore(ldt2));
        System.out.println(Duration.between(ldt,ldt2).toHours());
        //Formatiert das Datum.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd. MMMM YYY H:m:s").withLocale(Locale.GERMANY);
        System.out.println(ldt.format(formatter));

        long begin = System.nanoTime();
        for (int i = 0; i < 500000 ; i++) {
            double x = Math.sin(i);
        }
        long ende = System.nanoTime();
        System.out.println(ende - begin);


    }
}
