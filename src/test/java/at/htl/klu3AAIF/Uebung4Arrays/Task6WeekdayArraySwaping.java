package at.htl.klu3AAIF.Uebung4Arrays;

import java.util.Arrays;

public class Task6WeekdayArraySwaping {
    public static void main(String[] args) {
        String[] weekdays = {"Monday","Tuesday","Wednesday","Thirstday","Friday","Saturday","Sunday"};
        for (int i = 0; i < weekdays.length/2 ; i++) {
            String temp = weekdays[i];
            weekdays[i] = weekdays[weekdays.length-1-i];
            weekdays[weekdays.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(weekdays));
    }
}
