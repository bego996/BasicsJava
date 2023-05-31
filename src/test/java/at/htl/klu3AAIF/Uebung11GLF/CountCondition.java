package at.htl.klu3AAIF.Uebung11GLF;


import java.util.Arrays;

public class CountCondition {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int[] randomNumbers = new int[25];
        for (int i = 0; i < randomNumbers.length ; i++) {
            randomNumbers[i] = new java.util.Random().nextInt(10,51);
        }
        for (int i = 0; i < randomNumbers.length ; i++) {
            if (randomNumbers[i]%2 == 0 && randomNumbers[i]%3 != 0){
                count++;
                sb.append("data[").append(i).append("]=").append(randomNumbers[i]).append(",");
            }
        }
        System.out.println(Arrays.toString(randomNumbers));
        System.out.printf("%s%ncount: %d",sb,count);
    }
}
