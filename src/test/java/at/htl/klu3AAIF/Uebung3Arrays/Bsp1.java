package at.htl.klu3AAIF.Uebung3Arrays;

import java.util.Arrays;

public class Bsp1 {
public static void main(String[] args) {
    int[] data = new int[100];
    int[] data2 = new int[24];
    int[] data3 = new int[30];
    int[] data4 = new int[30];

    Arrays.fill(data2, 2);
    for (int element : data2) {
        System.out.print(element);
    }

    System.out.println();
    for (int i = 0; i < data.length; i++) {
        data[i] = (int) Math.pow(1+i,2);
    }

    for (int i = 0; i < data3.length ; i++) {
        data3[i]=  3 * i +1;
    }

    for (int i = 0; i < data4.length; i++) {
        data4[i] = i%2 == 0 ? i+1-i:        // 1 möglich
                   i%2 == 1 ? i-i-1:null;   //-1 möglich
    }

    System.out.println(Arrays.toString(data));
    System.out.println(Arrays.toString(data2));
    System.out.println(Arrays.toString(data3));
    System.out.println(Arrays.toString(data4));
    }
}
