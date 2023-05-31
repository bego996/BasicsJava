package AlltagsTools;


public class VersicherungsZinsBerechner {
    public static void main(String[] args) {

        System.out.print("Gib die Monatliche Einlage für deine Versicherung ein:");
        final int einlageFix = new java.util.Scanner(System.in).nextInt()*12;
        System.out.print("Gib deine Vertragsdauer an:");
        final int vertragsD = new java.util.Scanner(System.in).nextInt();
        System.out.print("Gib den Jährlichen Aktiv-zinssatz deiner Versicherung ein,in Prozent:");
        final double zinssatzA = new java.util.Scanner(System.in).nextDouble()/100+1;
        System.out.print("Gib eventuelle, Jährliche Bearbeitungsgebühren deiner Versicherung in Prozent an:");
        final double zinssatzB = new java.util.Scanner(System.in).nextDouble()/100;
        double einlageVar = einlageFix;

                for (int i = 1; i <= vertragsD ; i++) {
                double ergebnisFinal = ((einlageVar - (einlageVar * zinssatzB)) * (zinssatzA));
                System.out.print("("+i+")"+(float)einlageVar+"€"+" -> "+(float)ergebnisFinal+"€"+" = "+"+");
                System.out.println((float)(ergebnisFinal-einlageVar)+"€"+" ("+(float)(((ergebnisFinal-einlageVar)/einlageVar)*100)+"%)");
                einlageVar = ergebnisFinal + einlageFix;
            }
        }
    }

