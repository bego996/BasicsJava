package at.htl.klu3AAIF.Uebung11GLF;

public class Task1_4 {
    public static void main(String[] args) {
        int[] array1 = {5,10,2,6,8,7};
        System.out.println(FindMin(array1));
        System.out.println(FindMax(5,4,6));
        System.out.println(getRandomValue(70,90));
        System.out.println(nextWeekDay("monday"));
    }
    public static int FindMin(int[] array){
        int minValue = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < minValue)
                minValue = value;
        }
        return minValue;
    }
    public static int FindMax(int... values){
        int maxValue = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > maxValue)
                maxValue = value;
        }
        return maxValue;
    }
    public static int getRandomValue(int minValue,int maxValue){
        int randomGenerator = new java.util.Random().nextInt(minValue,maxValue+1);
        return randomGenerator;
    }
    public static String nextWeekDay(String day){
        String output = "";
        String[] days = {"Monday","Tuesday","Wednesday","Thurstday","Friday","Saturday","Sunday"};
        for (int i = 0; i < days.length ; i++) {
            if (days[i].equalsIgnoreCase(day) && i < days.length-1) {
                output = days[i + 1];
                break;
            }
            else if (days[i].equalsIgnoreCase(day))
                output = days[0];
        }
        return output;
        }
    }

