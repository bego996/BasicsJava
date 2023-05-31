package at.htl.klu3AAIF.Test2GLF;

public class Aufgabe6 {
    public static void main(String[] args) {
        System.out.printf("c = %.2f%n",calcMissingEdge(10,15,0));
        System.out.printf("b = %.2f",calcMissingEdge(0,4,5));
    }
    public static double calcMissingEdge(int a, int b, int c){
        double pythagoras = 0;
        if (a == 0)
            pythagoras = Math.sqrt((Math.pow(c,2))-(Math.pow(b,2)));
        else if (b == 0)
            pythagoras = Math.sqrt((Math.pow(c,2))-(Math.pow(a,2)));
        else if (c == 0)
            pythagoras = Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
        return pythagoras;
    }
}
