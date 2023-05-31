package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

import java.util.Arrays;

public class Capture4BildVergroesern {
    public static void main(String[] args) {
        int[][] graustufen = {{1,2,3,4},
                              {5,6,7,8}};
        int[][] result = magnify(graustufen,3);
        printarray(result);
    }
    public static int[][] magnify(int[][] array,int factor){
        int[][] arrayConverter = new int[array.length*factor][array[0].length*factor];
        for (int row = 0; row < arrayConverter.length ; row++) {
            int [] rows = arrayConverter[row];
            for (int col = 0; col < rows.length ; col++) {
                arrayConverter[row][col] = array[row/factor][col/factor];
            }
        }
        return arrayConverter;
    }
    public static void printarray(int[][] array){
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
