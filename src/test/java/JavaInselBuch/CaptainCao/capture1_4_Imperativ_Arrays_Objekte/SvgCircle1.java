package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

import java.util.Random;
import java.util.Scanner;

public class SvgCircle1 {
    public static void main(String[] args) {

//SvgCircle

        int x = 100,y = 110;
        Random r =  new Random();   //random() erzeugt eine Zahl zwischen (0.0)&Max(1.0) und nextDown() erzeugt die Zählerzahl.
        int n = r.nextInt(20,40);              //Diese Formel erzeugt eine Zufallszahl im Bereich 1.0-20.0 und sie entnimmt die Variable oben.
        double rnd1 = java.util.concurrent.ThreadLocalRandom.current().nextDouble(20);//Erzeugt einen Random Generator sowie oben (Kürzer).
        System.out.print("Gib die x Koordinaten an : ");
        int xNeueKordinate = new Scanner(System.in).nextInt();
        System.out.print(xNeueKordinate + " ist die Neue x Koordinate..\nGib jetzt die y Koordinate ein:");
        int yNeueKordinate = new Scanner(System.in).nextInt();
        System.out.println(yNeueKordinate + " ist die Neue y Kordinate..\n");
        System.out.printf("<svg height= %s width= %s>\n <circle cx= %s cy= %s r= %s/>\n</svg>%n",400,1000,xNeueKordinate,yNeueKordinate,n);
        System.out.println();
        System.out.println(n);

//Bottle Share

        System.out.print("Number of bottles in total?: ");
        int bootles = new Scanner(System.in).nextInt();
        if (bootles%2 == 0){
            System.out.println(bootles/2 + " for the Captain!");
        }else
            System.out.printf("Less than the half of bootles for the Captain!%n%d for the all Crew members!%n",bootles);
        System.out.print("Number of Crew members?: ");
        boolean t = true,f = false;
        int crewAnzahl = new Scanner(System.in).nextInt();
        System.out.print("Fair share without reminder?.. ");
        if (bootles%crewAnzahl == 0){
            System.out.println(t);
        }else
            System.out.println(f);

//Index checker

        System.out.print("Tip the first number from a Range of 0 - 100 in: ");
        String ersteZahl = new Scanner(System.in).next();   //Hier wird ein Integer als String definiert.
        System.out.println(ersteZahl);
        System.out.print("Tip the second number of a Range of 0 - 100 in: ");
        String zweiteZahl = new Scanner(System.in).nextLine();
        if (ersteZahl.charAt(0) == zweiteZahl.charAt(0) || (ersteZahl.charAt(1) == zweiteZahl.charAt(1)) || //charAt(?) gibt die Zahl in der Kette aus.
           (ersteZahl.charAt(0) == zweiteZahl.charAt(1) || (ersteZahl.charAt(1) == zweiteZahl.charAt(0)))){
            System.out.println("Erste Zahl:  "+ersteZahl + " Zweite Zahl: "+zweiteZahl + " =" + true);
        }else
            System.out.println(false);}}
