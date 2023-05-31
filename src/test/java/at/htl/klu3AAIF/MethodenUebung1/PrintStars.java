package at.htl.klu3AAIF.MethodenUebung1;

public class PrintStars {
    public static void main(String[] args) {
        printFiveStars();
        printFiveStars(10);

    }
    public static void printFiveStars(){
        System.out.println("*****");
    }
    public static void printFiveStars(int n){
        for (int i = 0; i < n ; i++) {
            System.out.print("*");
        }
    }
}
