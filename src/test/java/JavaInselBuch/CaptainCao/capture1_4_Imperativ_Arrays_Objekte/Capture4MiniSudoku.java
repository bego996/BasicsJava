package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

public class Capture4MiniSudoku {
    public static void main(String[] args) {
        int[][] sudokuCube = {{1,2,3},{4,5,6},{7,8,8}};
        for (int i = 0; i < sudokuCube.length ; i++) {
            for (int j = 0; j < sudokuCube[i].length ; j++) {
                switch (i) {
                    case 0 -> {if (sudokuCube[i][j] != j+1) {System.out.println("missing: "+(j+1));}}
                    case 1 -> {if (sudokuCube[i][j] != j+4) {System.out.println("missing: "+(j+4));}}
                    case 2 -> {if (sudokuCube[i][j] != j+7) {System.out.println("missing: "+(j+7));}}
                }}}}}
