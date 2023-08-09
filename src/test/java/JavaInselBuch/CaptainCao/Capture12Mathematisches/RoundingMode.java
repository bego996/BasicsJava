package JavaInselBuch.CaptainCao.Capture12Mathematisches;

import java.util.Arrays;

public enum RoundingMode {
    CAST,ROUND,FLOOR,CEIL,RINT,UNKNOWN;

    private static RoundingMode detectRoundingMode(double value,int rounded){
        return (int) value == rounded ? RoundingMode.CAST:
                Math.rint(value) == rounded ? RoundingMode.RINT:
                Math.floor(value) == rounded ? RoundingMode.FLOOR:
                Math.ceil(value) == rounded ? RoundingMode.CEIL:
                Math.round(value) == rounded ? RoundingMode.ROUND: RoundingMode.UNKNOWN;
    }
    public static RoundingMode detectRoundingMode(double[] values,int rounded){
        double result = 0;
        for (double value : values) {
            result+=value;
        }
        return detectRoundingMode(result,rounded);
    }
}
