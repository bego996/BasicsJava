package at.htl.klu3AAIF.DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDates {
    public static void main(String[] args) {
        LocalDate date1 = calcRandomDate();
        LocalDate date2 = calcRandomDate();
        System.out.println(date1);
        System.out.println(date2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.M.yyyy");
        System.out.println();
        boolean isbefore = date1.isBefore(date2);
        System.out.printf("Datum 1: %s, Datum 2: %s",isbefore?date1.format(formatter):date2.format(formatter),isbefore?date2.format(formatter):date1.format(formatter));



    }
    public static LocalDate calcRandomDate(){
        LocalDate start = LocalDate.of(2000,1,1);
        LocalDate end = LocalDate.of(2099,12,31);
        long startEpochDay = start.toEpochDay();
        long endEpochDay = end.toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(startEpochDay, endEpochDay);
        return LocalDate.ofEpochDay(randomDay);
    }
}
