package at.htl.klu3AAIF.MethodenUebung1;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] tempArray = {5,1,2,3,4};
        System.out.println(Arrays.toString(tempArray));
        bubbleSort(tempArray);  //Methode mit Counter.
        System.out.println(Arrays.toString(tempArray));
        int[] tempArray1 = {10,8,5,3,1};
        System.out.println();
        System.out.println(Arrays.toString(tempArray1));
        bubbleSortNoCount(tempArray1);  //Methode ohne Counter.
        System.out.println(Arrays.toString(tempArray1));

    }
    public static void bubbleSort(int[] unsortedArray){
        int counter = 0;    //Zähler ist Optional hinzugefügt, um die nötige Anzahl von Durchläufen prüfen zu können.
        boolean run = true;
        for (int i = 0; i < unsortedArray.length && run; i++) {
            counter++;
            run = false;
            for (int j = 0; j < unsortedArray.length-1 ; j++) {
                if (unsortedArray[j] > unsortedArray[j+1] ){
                   int temp = unsortedArray[j];
                   unsortedArray[j] = unsortedArray[j+1];
                   unsortedArray[j+1] = temp;
                    run = true;
                }
            }
        }
        System.out.println("Counter: " + counter);
    }
    public static void bubbleSortNoCount(int[] unsortedArray){ //Langsamere Variante.
        for (int i = 0; i < unsortedArray.length; i++) {
            for (int j = 0; j < unsortedArray.length-1 ; j++) {
                if (unsortedArray[j] > unsortedArray[j+1] ){
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j+1] = temp;
                }
            }
        }
    }
}
