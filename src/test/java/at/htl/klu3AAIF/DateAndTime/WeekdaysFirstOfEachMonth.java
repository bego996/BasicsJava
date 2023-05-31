package at.htl.klu3AAIF.DateAndTime;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class WeekdaysFirstOfEachMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.next();
        for (int i = 1; i <= 12 ; i++) {
            System.out.printf("1.%d -> %s%n",i, LocalDate.of(Integer.parseInt(year),i,1).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.GERMANY));
        }
        scanner.close();
    }
}
