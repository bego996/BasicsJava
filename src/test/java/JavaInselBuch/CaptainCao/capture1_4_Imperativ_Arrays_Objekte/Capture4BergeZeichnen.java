package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

public class Capture4BergeZeichnen {
    public static void main(String[] args) {
        int[] altitudesOrigin = {0,1,1,2,2,3,3,3,4,5,4,3,2,2,1,0};
        int[] altitudes = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        int[] altitudes2 = {0,1,2,3,4,4,5,4,4,3,2,1,0};
        amplitudesToMountainExtended(altitudes);
        amplitudesToMountainExtended(altitudesOrigin);
        amplitudesToMountain(altitudes);
        amplitudesToMountain(altitudes2);

    }
    public static char mountainSign (){return '*';}
    public static char mountainSign (int[] altitudes, int index){
        int previous = index == 0 ? 0 : altitudes[index-1];
        int current = altitudes[index];
        int next = index < altitudes.length-1 ? altitudes[index+1] : -1;
        if (previous < current && current > next)
            return '^';
        if (current < next)
            return '/';
        if (current > next)
            return '\\';
        // if (current == next)
        return '-';
    }

    public static void amplitudesToMountain(int[] amplitude){
        int maxAmplitude = amplitude[0];
        for (int maxValue:amplitude) {
            if (maxValue > maxAmplitude) maxAmplitude = maxValue;
        }
        for (int mountainTop = maxAmplitude; mountainTop >= 0; mountainTop--) {
            if (mountainTop < 10) {
                System.out.print(mountainTop + " ");
            }
            else
                System.out.print(mountainTop);
            for (int actuallHeight:amplitude ) {
                if (actuallHeight == mountainTop){
                    System.out.print(mountainSign());
                }
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
    public static void amplitudesToMountainExtended(int[] amplitude){
        int maxAmplitude = amplitude[0];
        for (int maxValue:amplitude) {
            if (maxValue > maxAmplitude)
                maxAmplitude = maxValue;
        }
        for (int mountainTop = maxAmplitude; mountainTop >= 0; mountainTop--) {
            if (mountainTop < 10) {
                System.out.print(mountainTop + " ");
            }
            else
                System.out.print(mountainTop);
            for (int i = 0; i < amplitude.length ; i++) {
                if (mountainTop == amplitude[i]) {
                    System.out.print(mountainSign(amplitude, i));
                }
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
}
