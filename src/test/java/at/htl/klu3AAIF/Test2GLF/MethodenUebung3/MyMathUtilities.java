package at.htl.klu3AAIF.Test2GLF.MethodenUebung3;

import at.htl.klu3AAIF.Uebung5Arrays.HTLUtilities;

import java.util.Arrays;

public class MyMathUtilities {
    public static void main(String[] args) {
        int[] glfValues = HTLUtilities.getPoints(25);
        System.out.println(Arrays.toString(glfValues));
        System.out.println(Arrays.toString(getSAM2(glfValues)));
        System.out.println(Arrays.toString(getHV1(glfValues)));
        System.out.println(Arrays.toString(getSAM2(glfValues,0,getAverage(glfValues))));
        System.out.println(getAverage(glfValues));
        System.out.println(Arrays.toString(getSAM2(glfValues,getAverage(glfValues)-1,getAverage(glfValues)+1)));
    }


    public static int[] getM2(int[] array){
        int[] minMaxArray = {Integer.MAX_VALUE,Integer.MIN_VALUE};
        for (int value:array){
            if (value < minMaxArray[0])
                minMaxArray[0] = value;
            if (value > minMaxArray[1])
                minMaxArray[1] = value;
        }
        return minMaxArray;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int value:array) {
            sum += value;
        }
        return (double)sum/ array.length;
    }


    public static int[] getSAM2(int[] array){
        int[] SAM2 = new int[4];
        for (int value:array) {
            SAM2[0] += value;
            SAM2[1]++;
            SAM2[2] = getM2(array)[0];
            SAM2[3] = getM2(array)[1];
        }
        return SAM2;
    }


    public static int[] getSAM2(int[] array,double elementFrom,double elementTo) {
        int[] SAM2 = new int[4];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value >= elementFrom && value <= elementTo) {
                SAM2[0] += value;
                SAM2[1]++;
                min = Math.min(min,value);
                max = Math.max(max,value);
            }
        }
        SAM2[2] = min;
        SAM2[3] = max;
        return SAM2;
    }


    public static double[] getSAM3(double[] array){
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double[] SAM2 = new double[5];
        for (double value : array) {
            min = Math.min(value, min);
            max = Math.max(value,max);
            SAM2[0] += value;
            SAM2[1]++;
            SAM2[2] = min;
            SAM2[3] = max;
        }
        SAM2[4] = SAM2[0]/SAM2[1];
        return SAM2;
    }


    public static double[] getSAM3(double[] array,double elementFrom,double elementTo){
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double[] SAM2 = new double[5];
        for (double value : array) {
            if (value >= elementFrom && value <= elementTo) {
                min = Math.min(value, min);
                max = Math.max(value, max);
                SAM2[0] += value;
                SAM2[1]++;
                SAM2[2] = min;
                SAM2[3] = max;
            }
        }
        SAM2[4] = SAM2[0]/SAM2[1];
        return SAM2;
    }


    public static int[] getHV1(int[] array){
        int min = getM2(array)[0];
        int max = getM2(array)[1];
        int[] amountValues = new int[max-min+1];
        for (int i = 0; i < array.length; i++) {
            amountValues[array[i]-min]++;
        }
        return amountValues;
        }


    public static int[] getHV1(int[] array,int elementFrom,int elementTo){
        int[] amountValues = new int[elementTo-elementFrom+1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= elementFrom && array[i] <= elementTo) {
                amountValues[array[i] - elementFrom]++;
            }
        }
        return amountValues;
    }
}

