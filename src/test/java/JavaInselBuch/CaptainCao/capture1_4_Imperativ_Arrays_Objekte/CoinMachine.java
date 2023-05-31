package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

import java.math.BigDecimal;

public class CoinMachine {
    public static void main(String[] args) {
        double[] muenzAusgabe0 = {2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};  //Die Münzausgabe wird *100 gerechnet um ein integer zu erhalten, zb. (2€ wird zu 200) (leichter wegen Fließkommazahlen Rundungsproblem)
        int [] zwischenErgebnis0 = new int[muenzAusgabe0.length];//
        final BigDecimal ground = BigDecimal.ZERO;
        System.out.print("Throw an amont of euros in the Machine: ");
        BigDecimal CoinInput0 = new java.util.Scanner(System.in).nextBigDecimal();
        for (int i = 0; i < muenzAusgabe0.length; i++ ) {
            while (CoinInput0.compareTo(ground) > 0) {
                if (CoinInput0.compareTo(BigDecimal.valueOf(muenzAusgabe0[i])) >= 0){
                    CoinInput0 = CoinInput0.subtract(BigDecimal.valueOf(muenzAusgabe0[i]));
                    zwischenErgebnis0[i]++;                    //Der Durchgang einzelner Index wird hier im Array incrementiert.
                } else
                    break;
            }
        }
        for (int i = 0; i < muenzAusgabe0.length ; i++) {      //Ausgabe der Elemente.
            System.out.printf("%d * %.2f€%n",zwischenErgebnis0[i],muenzAusgabe0[i]);
        }

        int[] muenzAusgabe = {200, 100, 50, 20, 10, 5, 2, 1};  //Die Münzausgabe wird *100 gerechnet um ein integer zu erhalten, zb. (2€ wird zu 200) (leichter wegen Fließkommazahlen Rundungsproblem)
        int [] zwischenErgebnis = new int[muenzAusgabe.length];//
        System.out.print("Throw an amont of euros in the Machine: ");
        float CoinInput = new java.util.Scanner(System.in).nextFloat()*100+0.1f;
        int CoinConverted = (int) CoinInput;
        for (int i = 0; i < muenzAusgabe.length; i++ ) {
            while (CoinConverted > 0) {
                if (CoinConverted >= muenzAusgabe[i]){
                    CoinConverted -= muenzAusgabe[i];
                    zwischenErgebnis[i]++;                    //Der Durchgang einzelner Index wird hier im Array incrementiert.
                } else
                    break;
            }
        }
        for (int i = 0; i < muenzAusgabe.length ; i++) {      //Ausgabe der Elemente.
            System.out.printf("%d * %.2f€%n",zwischenErgebnis[i],(float)muenzAusgabe[i]/100);
        }
    }
}
