package at.htl.klu3AAIF.Test2GLF;

public class aufgabe4 {
    public static void main(String[] args) {
        System.out.println(getWeekday(1));
        System.out.println(getWeekday(2));
        System.out.println(getWeekday(3));
        System.out.println(getWeekday(4));
        System.out.println(getWeekday(5));
        System.out.println(getWeekday(6));
        System.out.println(getWeekday(7));
        System.out.println(getWeekday(0));
        System.out.println(getWeekday(8));

    }
    public static String getWeekday(int day){
        String[] weekdays = {"Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samstag","Sonntag"};
        String output = "";
        for (int i = 1; i <= 7 ; i++) {
            if (day < 1 || day >7){
                output = "Wochentag-Index nicht gültig!";
                break;
            }
            else if ( day == i) {
                output = weekdays[i-1];
                break;
            }


        }
        return output;
    }
}
