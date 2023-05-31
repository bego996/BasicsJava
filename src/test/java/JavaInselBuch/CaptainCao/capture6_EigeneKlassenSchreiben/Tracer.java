package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

public class Tracer {
    private static boolean isTraceOn = false;

    public static void trace(String info) {
        if (isTraceOn)
            System.out.println(info);
    }
    public static void trace(String format,Object... args) {
        if (isTraceOn){
            System.out.printf(format,args);
        }
    }
    public static void on() {
        isTraceOn = true;
    }
    public static void off() {
        isTraceOn = false;
    }
}
