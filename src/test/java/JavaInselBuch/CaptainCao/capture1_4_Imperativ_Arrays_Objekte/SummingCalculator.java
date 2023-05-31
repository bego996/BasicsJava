package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

public class SummingCalculator {
    public static void main(String[] args) {



       int ganzZahl = Integer.MAX_VALUE;
       int ausgabe  = 1;
       while (ganzZahl > 9) {
           ganzZahl /= 10;
           ausgabe++;
       }
        System.out.println(ausgabe);



       final int repetitions = 10;
        for (int i = 1; i <= repetitions; i++) {
            for (int j = 1; j <= repetitions; j++)
                System.out.print(j <= repetitions / 2 ? "><>  " : "<><  ");
            System.out.println();
        }
    }
}


/*

     final int ergebniss = 555;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        int i1 = i * 100 + j * 10 + k;
                        int i2 = j * 100 + k * 10 + l;
                        if (i1 + i2 == ergebniss) {
                            System.err.printf("%d + %d = %d%n", i1, i2, ergebniss);
                        }}}}}}}




        int heightInput = new java.util.Scanner(System.in).nextInt();
        int weightInput = new java.util.Scanner(System.in).nextInt();
        for (int i = 0; i < heightInput ; i++) {
            for (int j = 0; j < weightInput ; j++)
                System.out.print((i+j) % 2 == 0 ? "_": "#");
                    System.out.println();
                    {

         int widthInputThree =  new java.util.Scanner(System.in).nextInt();
        for (int i = 1, j = widthInputThree;
                 i <= widthInputThree;
                 j--,i+=2){
            for (int k = 1; k < (j-1) ; k++)
                System.out.print(" ");
                for (int l = 0; l < i; l++)
                    System.out.print(Math.random() < 0.90 ? "*":"o");
            System.out.println();
        }






        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.printf("%d * %d = %d%n", j, i, (j * i));
            System.out.println();
        }


//Beutezüge summieren.

        final int End_Of_Input = 0;
        int adierrerVariable = 0;
        int input = 0;
        do {
            input = new java.util.Scanner(System.in).nextInt();
            adierrerVariable += input;
        } while (input != End_Of_Input);
        System.out.printf("summe = %d", adierrerVariable);

//Iteration berechnen.

        double t = Math.random() * 10;
        System.out.println(t);
        while (t != 0) {
            System.out.printf("%64s%n", Long.toBinaryString(Double.doubleToLongBits(t)));
            if (t >= 1) {
                System.out.println(--t);
            } else
                System.out.println(t *= 2);
        }

//Permutation ohne Wiederholungen.
        StringBuilder sb = new StringBuilder();
        int eingabe = new java.util.Scanner(System.in).nextInt();
        final int fakultät = eingabe;
        long premutation = eingabe;
        if (eingabe < 0) {
            System.err.println("Number must not be negative!");
        } else if (eingabe >= 0 && eingabe <= 2) {
            System.out.printf("%d! = %d", eingabe, eingabe);
            return;
        }
        while (eingabe > 1) {
            sb.append(eingabe + " * ");
            premutation *= (--eingabe);
            Math.multiplyExact(premutation, eingabe);
        }
        System.out.printf(fakultät + "!" + " = " + sb.toString() + "1" + " = " + premutation);
        System.out.println();

//Prüfe ob fakultät.

        System.out.print("Enter a number: ");
        int permutationEingabe = new java.util.Scanner(System.in).nextInt();
        final int permutationAusgabe = permutationEingabe;
        int zähler = 1;
        while (permutationEingabe > 1) {
            permutationEingabe /= ++zähler;
            if (permutationEingabe == 1) {
                System.out.println(permutationAusgabe + " = " + zähler + "!");
            } else if (permutationEingabe < 1) {
                System.err.println(permutationAusgabe + " is not a factorial!");
            }
        }

        int zaehler = 5;
        for (int i = 1; i <= zaehler; i++) {
            for (int ident = 0; ident < (zaehler-i);ident++)
                System.out.print(" ");
                for (int j = 1; j <= i; j++)
                    System.out.printf("%d%d", i, i);

                    System.out.println();

*/


