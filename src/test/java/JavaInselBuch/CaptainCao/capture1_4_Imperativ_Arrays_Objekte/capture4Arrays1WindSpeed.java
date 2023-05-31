package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;
import static java.lang.System.out;
public class capture4Arrays1WindSpeed {
    public static void main(String[] args) {
        //WindSpeedAnddirection
        int [] windspeed = {100,150,199};
        int [] windDirection = {50,160,380};
        for (int i = 0; i < windspeed.length; i++) {
            out.print(i < windspeed.length-1 ? "Wind speed "+windspeed[i]+"km/h and wind direction "+windDirection[i]+"°,":
                                               "Wind speed "+windspeed[i]+"km/h and wind direction "+windDirection[i]+"°");
        }
        out.println();

        //GainsIf5Perzent
        int [] dailyGains = {100,150,200,600,800,3000,7000,5000,5050,6000};
        out.println(count5PerzentGains(dailyGains));

        //IsSaltySnookSigned?
        out.println(isProbablyApproaching(new String[]{"Mo","Di","Mi","Di","Mo","Mo","Mo"}));

    }
    public static int count5PerzentGains(int [] gains){
        int amountOfJumps = 0;
        int beginValue = 50;
        char perzent = '%';
        for (int i = 0; i < gains.length ; i++) {
            if (gains[i] >= beginValue*1.05) {
                out.printf("%d -> %d >= +5%s%n", beginValue, gains[i], perzent);
                amountOfJumps++;
            }else {
                out.printf("%d -> %d < +5%s%n", beginValue, gains[i], perzent);
            }
            beginValue = gains[i];
        }
        return amountOfJumps;
    }
    static boolean isProbablyApproaching(String[] signs){
        byte sights = 1;
        boolean Passed = false;
        for (int i = 0; i < signs.length-1 ; i++) {
            if (signs[i].equals(signs[i+1]))
                sights++;
            if (sights == 4) {
                Passed = true;
                break;
            }
        }
        return Passed;
    }
}
