package AlltagsTools;

public class SummierenVonBeträgen {
    public static void main(String[] args) {

        final double End_Of_Input = 0;
        double adierrerVariable = 0;
        double input = 0;
        do {
            input = new java.util.Scanner(System.in).nextDouble();
            adierrerVariable += input;
        } while (input != End_Of_Input);
        System.out.printf("summe = %g€", adierrerVariable);
    }
}
