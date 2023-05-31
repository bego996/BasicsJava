package JavaInselBuch.Beispiele.basic;

import java.util.Arrays;

public class MehrdimensionaleArrays {
    public static void main(String[] args) {
        int [][] c = new int[3][3];
        int[][] a = new int[3][];
        int[][] b = {{1,2,3,4},
                {4,5,6},
                {7,8,9}};
        for (int i = 0; i < 3; i++) { //Ermitlung der Spaltengröße des Arrays "a".
            a[i] = new int[i+1]; // Ergibt beim ersten Durchlauf a[0] = 1 , also die spalten größe usw..
        }
        for (int i = 0; i < c.length ; i++) { //Initialisieren des Arrays "c" , als sudoku 3*3 Matrize.
            for (int j = 0; j < c[i].length; j++) {
                switch (i) {
                    case 0 -> c[i][j] = j + 1;
                    case 1 -> c[i][j] = j + 4;
                    case 2 -> c[i][j] = j + 7;
                }
            }
        }
        System.out.println(Arrays.toString(b[0])+"\n"+Arrays.toString(b[1])+"\n"+Arrays.toString(b[2]));
        System.out.println(b.length);
        System.out.println(b[0].length);
        System.out.println(Arrays.toString(a[0])+"\n"+Arrays.toString(a[1])+"\n"+Arrays.toString(a[2]));
        System.out.println(Arrays.toString(c[0])+"\n"+Arrays.toString(c[1])+"\n"+Arrays.toString(c[2]));
    }
}
