package at.htl.klu3AAIF.Uebung5Arrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String [] weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        String [] copyweekdays = new String[weekdays.length];
        for (int i = 0; i < copyweekdays.length ; i++) {
            copyweekdays[i] = weekdays[i];
        }
        System.out.println(Arrays.toString(copyweekdays));
        System.out.println(Arrays.toString(weekdays));

        weekdays = new String[]{"Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samstag","Sonntag"};
        System.out.println(Arrays.toString(weekdays));
        System.out.println(Arrays.toString(copyweekdays));
    }
}
