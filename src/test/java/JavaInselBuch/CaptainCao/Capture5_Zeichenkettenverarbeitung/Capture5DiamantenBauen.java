package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

import java.util.Scanner;

public class Capture5DiamantenBauen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gib die Breite des gewünschten Diamanten ein: ");
        int inputWidthHeight = sc.nextInt();
        System.out.println();
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cba = "ZYXWVUTSRQPOMNLKJIHGFEDCBA";
        StringBuilder sb = new StringBuilder();
        int middle = inputWidthHeight/2;
        printDiamond(6);

    }
    public static void printFreeRoom(int radiusMinusSigns){
        for (int i = 0; i < radiusMinusSigns ; i++)
            System.out.print(" ");
    }
    public static void printDiamondCores(char start,char stop){
        if (start == stop) {
            System.out.print(start);
            return;
        }
        System.out.print(start);
        printDiamondCores((char) (start +1),stop);
        System.out.print(start);
    }
    public static void printDiamond(int diameter){
        if (diameter < 1)
            return;
        int radius = diameter/2;
        for (int rad = radius; rad >= -radius ; rad--) {
            int radiusRevurve = Math.abs(rad);
            printFreeRoom(radiusRevurve);
            printDiamondCores('A',(char) ('A'+radius-radiusRevurve));
            System.out.println();
        }
    }
}
