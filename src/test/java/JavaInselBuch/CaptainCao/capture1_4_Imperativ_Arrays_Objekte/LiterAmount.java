package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;


public class LiterAmount {
    public static void main(String[] args) {
        System.out.print("Enter quantity in liters: ");
        float literUmwandlung = new java.util.Scanner(System.in).nextFloat();
        float mlMin = 0.001F,clMin = 0.1F,literMin = 1.0F,literWertLeer; //Initialisierung könnte mann sich mit dem casting
        int literEndWert = 0;                                                                     //beispiel unten ersparen.
        if (literUmwandlung >= mlMin && literUmwandlung < clMin){           //Längerer Code..
            literWertLeer = literUmwandlung*1000;
            literEndWert = (int) literWertLeer;
            System.out.printf("%dml%n",literEndWert);
        } else
        if (literUmwandlung >= clMin && literUmwandlung < literMin){
            System.out.printf("%dcl%n",(int) (literUmwandlung * 100));  //Verkürzter Code..
        } else
        if (literUmwandlung >= 1.0){
            System.out.printf("%dl%n", (int) literUmwandlung);      //Bei If Abfragen, am besten mit diesem(höchsten Wert) anfangen..
        }else
            System.err.print("Value to small to display!");
    }
}




