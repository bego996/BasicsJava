package at.htl.klu1AAIF;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class AllgemeineUebungen {

    public static void main(String[] args) {


        int wdh = 5;
        int binär = 0b11 * 11;
        int j = 5, k = 10;
        int[] array1 = {10, 90, 120};                       //Array Variante mit fixer belegung dessen Index.
        int[] array2 = new int[10];                         //Array Variante dessen Indexlänge nur bekannt ist und man diese im Nachhinein noch deklarieren muss.
        long current = System.currentTimeMillis();
        long days = current / 86_400_000L;
        double GD = 10. + .11;
        double hochZahl = Math.pow(5, 2);
        double random = Math.random();                      //Methode Random, kann nur mit double aufgerufen werden und erzeugt eine Zufallszahl im Bereich 0.0-1.0.
        var x = 5;
        String p1 = "h", p2 = "k";
        final var res = p1 + p2;
        String[] array3 = {"Bego", "Hamida", "Enisa"};


 /*     deziZuBinär((int) 3.0);
        System.out.println(array1[1] / 2);
        System.out.println((wdh + wdh) * 2);
        System.out.println(++j);
        System.out.println(j++);
        System.out.println();
        System.out.println(wdh -= -wdh);
        System.out.println(j *= 5 + 3);
        System.out.println(wdh *= k);
        System.out.println(Math.IEEEremainder(5.5, 0.5));
        System.out.println(binär);
        System.out.println(days);
        System.out.println(current);
        System.out.println(GD);
        System.out.println(hochZahl);
        System.out.println(random);
        System.out.println(x);
        System.out.println(res);
        System.out.println(geradeIndexSumme(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("Der Name des Familienmitglieds lautet : " + familienHierarchie(array3, 0));
        System.out.println("Der geringste Wert beträgt " + minWert(array1));
        System.out.println("Der Mittelwert beträgt " + mittelWert(array1));
        System.out.printf("Der Name des Familienmitglieds lautet : %s%nDer Name des zweiten mitglieds lautet : %s%n", familienHierarchie(array3, 2), familienHierarchie(array3, 0));
        System.out.format("Eine Ganzzahl: %d, Eine Flieskommazahl: %f, Eine Gleitkommazahl: %g, Eine Zeichenkette(String): %s, Ein Zeilenumbruch: %nHier!%n", 5, 5.5, 10.5, "Bego");
        System.out.println(Double.valueOf(1.7));
        System.out.println(maxWert(array1));
        ifPalindrome("radar");
        deziZuBinär((int) 1.0);
        decrementArray(array1, 5);
        umfangUfläche();
        multiplizierer(15, 10);
        celsiusInFahreneinheit(55);
        setzeArray(array1, 3, 5, 10);


        //Grafische Eingabeaufforderung erzeugen aus dem javax.swing packet.
        String input = javax.swing.JOptionPane.showInputDialog("Eingabe");
        System.out.println(input);


        //Scanner(Eingabeaufforderung) initialisieren.
        System.out.println("Wie alt bist du ? ");
        double value = new java.util.Scanner(System.in).nextDouble();
        System.out.printf("%s also? %nIch bin %d JAhre alt", value, 25);


        Scanner sc = new Scanner(System.in);    //2.te Möglichkeit einen Scanner zu erzeugen.
        System.out.println("Gib deine Anwort ein , nur Einzelbuchstaben sind erlaubt: ");
        String a = sc.next();
        char b = a.charAt(0);
        switch (b) {                            //Kontrollstruktur switch erstellen, die auch mit boolean arbeitet.
            case 'a','A':
                System.out.println("Richtige eingabe");
                break;
            case 'b','B':
                System.out.println("Weit daneben");
                break;
            default:
                System.out.println("Komplett daneben...");
        }
        System.out.print("Gib den heutigen Tag ein und ich sage dir ob du arbeiten musst:");
        String actuallDay = new Scanner(System.in).nextLine();
        switch (actuallDay){
            case "Montag","Dienstag","Mittwoch","Donnerstag","Freitag" -> System.out.println("Work Day!");
            case "Samstag","Sontag" -> System.out.println("Free time!");
            default -> System.err.print("Das ist kein Wochentag, versuche es nochmal:");
        }

        //Zufahlsgenerator erzeugen mit der Methode Random.
        Random zufall = new Random();
        for (int i = 0; i < array2.length ; i++) {
            array2[i] = zufall.nextInt();}


        //Kopfgesteuerte while Schleife erzeugen.
        while (wdh <= 10) {
            System.out.println(wdh);
            wdh++;}


        //Fußgesteuerte while Schleife erzeugen.
        do {
            System.out.print(wdh);
            wdh++;
        } while (wdh < 10);


        int zufallsZahl = (int) (Math.random() * 5);
        int eingabe;
        do {
            System.out.print("Welche Zahl denke ich mir zwischen 1-5:");
            eingabe = new java.util.Scanner(System.in).nextInt();
            if (eingabe < zufallsZahl) {
                System.out.println("Meine Zahl ist Größer!");
            } else if (eingabe > zufallsZahl) {
                System.out.println("Meine Zahl ist kleiner!");
            }
        }while (eingabe != zufallsZahl);
        System.out.println("Gut geraten!");

        down1(10);
        down2(10);
*/      System.out.print("Gib einen operator ein:");
        char operator = new Scanner(System.in).next().toLowerCase().charAt(0);
        System.out.print("Gib die erste Zahl ein:");
        int zahl1 =  new Scanner(System.in).nextInt();
        System.out.print("Gib die zweite Zahl ein:");
        int zahl2 = new Scanner(System.in).nextInt();
        switch (operator){
            case '+' -> System.out.printf("%d",zahl1+zahl2);
            case '-' -> System.out.printf("%d",zahl1-zahl2);
            case '*' -> System.out.printf("%d",zahl1*zahl2);
            case '/' -> System.out.printf("%f",(float) (zahl1/zahl2));
            default  -> System.err.println("Type an valid operator in the input!");
        }
    }


    /*    private static String digitToText(int ziffer) {         //Methode mit Rückgabewert erzeugen. /*private ist ein Sichtbarkeitsmodifikator/*static steht für eine Klassenunabhängige Methode.
            String[] array = {"null","eins","zwei","drei"};     // *void würde eine Methode ohne Rückgabewert erzeugen, das heisst: die variable wird nicht abgelegt sondern nur ausgewertet.
            return array[ziffer];
        }
        private static void ifPalindrome(String number) {
            String original = number;
            StringBuilder reverse = new StringBuilder();        //Stringbuilder wird erzeugt,der eine Zeichenkette zusammensetzt mit der Methode *append.
            int length = original.length();                     //Hier wird die Länge eines Strings ermittelt und in einen integer gespeichert.
            for (int i = length - 1; i >= 0; i--)               //Erzeugen einer for-Schleife, die bei jedem Durchlauf die Zählervariable decrementiert.
                reverse.append(original.charAt(i));             //Zeichenkette wird zusamengesetzt aus einem vom String in char umgewandelten Datentyp.
            if (original.equals(reverse.toString())){           //.equals wird anstatt Vergleichsoperatoren wie zb. >= angewendet, gilt für Zeichenketten.
                System.out.println("Entered string is a palindrome.");
            } else
                System.out.println("Entered string is not a palindrome.");
        }
        public static void deziZuBinär (int dezimalZahl){
            StringBuilder sb = new StringBuilder();
            while (dezimalZahl > 0){                            //Verschachtelung von while Schleifen und if Anweisungen.
                if (dezimalZahl%2 == 0){
                    sb.append("0");
                }else
                    sb.append("1");
                dezimalZahl = dezimalZahl/2;
            }
            System.out.println(sb.reverse());                   //Mit reverse werden Zeichenketten gespiegelt ausgegeben.
        }

        public static String multiZeichen (int anzahl, char zeichen,int multi){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < anzahl ; i++) {
                sb.append(zeichen*multi);

            }
            return sb.toString();
        }
        public static void celsiusInFahreneinheit (int c){
            double F = c * 1.8 + 32;
            System.out.println("Die Umwandlung beträgt : " + F + "°F");
        }
        public static void umfangUfläche (){
            Scanner scanner = new Scanner(System.in);           //Möglichkeit einen Scanner zu initialisieren.
            System.out.print("Gib den Radius an : ");
            double  r = scanner.nextInt();
            double U = (2 * r) * 3.14;
            double F = ((2 * r) * (2 * r) * 3.14) / 4;
            System.out.printf("Der Umfang beträgt: %gcm%nDie Fläche beträgt: %gcm²%n",U,F);
        }
        public static String familienHierarchie (String [] namen,int eingabe){
            String keinWert = "a";
            for (int i = 0; i < namen.length ; i++) {
                if (eingabe == i){
                    keinWert = namen[i];
                }
            }
            return keinWert ;
        }
        public static int maxWert (int [] eingabe){
            int max = Integer.MIN_VALUE;                        //Der Integer wird auf seinen Maximalen wert deklariert.
            for (int i = 0; i < eingabe.length; i++) {
                if (eingabe[i] > max ){
                    max = eingabe[i];
                }
            }
            return max;
        }
        public static int minWert (int [] eingabe){
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < eingabe.length ; i++) {
                if (eingabe[i] < min){
                    min = eingabe[i];
                }
            }
            return min;

        }
        public static float mittelWert (int [] eingabe){
            int summe = 0;
            for (int i = 0; i < eingabe.length ; i++) {
                summe = eingabe[i++];

            }
            return (float) summe / eingabe.length;
        }
        public static void multiplizierer (int eingabe,int eingabe2) {
            if (eingabe < eingabe2){
                System.out.println(eingabe * eingabe2);
                }
            else{
                System.out.println("Die erste Zahl muss kleiner sein!");
                }
        }
        public static void setzeArray(int[] a,int anfang,int ende,int wert) {
            for (int i = anfang; i <= ende; i++) {
                a[i] = wert;
            }
            System.out.println(Arrays.toString(a));
        }
        public static int geradeIndexSumme (int[] array){
            int summe = 0;
            for (int i = 0; i < array.length ; i++) {
                if (array[i]%2 == 0 ){
                   summe += array[i];
                }
            }
            return summe;
        }
        public static void decrementArray (int[] array,int decrement){
            for (int i = 0; i < array.length ; i++) {
                array[i] = array[i] -decrement;
            }
            System.out.println(Arrays.toString(array));
        }
    }
    */
    static void down1(int n) {
        if (n <= 0)
            return;
        System.out.print(n + ",");
        down1(n - 1);
    }
    static void down2(int n) {
        if (n <= 0)
            return;
        down2(n - 1);
        System.out.print(n + ",");
}
    }