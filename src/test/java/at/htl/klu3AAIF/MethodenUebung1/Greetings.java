package at.htl.klu3AAIF.MethodenUebung1;

import java.time.LocalTime;

public class Greetings {
    public static void main(String[] args) {
        System.out.println(sayHello(-1));
        sayHello();
    }

    public static String sayHello(int hour) {
        String StringOutput = "";
        if (hour < 0 || hour > 23) {
            StringOutput = "falsche Zeitangabe";
        }
        else {
            switch (hour) {
                case 0, 1, 2, 3, 4, 5 -> StringOutput = "Es ist Nacht";
                case 6, 7, 8, 9, 10 -> StringOutput = "Guten Morgen";
                case 11, 12, 13, 14 -> StringOutput = "Mahlzeit";
                case 15, 16, 17, 18, 19, 20, 21, 22, 23 -> StringOutput = "Gute Nacht";
            }
        }
        return StringOutput;
    }
    public static void sayHello(){
        System.out.println(sayHello(LocalTime.now().getHour()));
    }
}
