package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

public class LinePrinter {


    public static void line(int len,char symbol) {
        for (int i = 0; i < len; i++) {
            System.out.print(symbol);
        }
    }
    public static void line(int len){
        for (int i = 0; i < len ; i++) {
            System.out.print("-");
        }
    }
    public static void line(String prefix,int len,char symbol,String postfix){
        System.out.print(prefix);
        line(len,symbol);
        System.out.println(postfix);
    }
    public static boolean RightTriangle (double x,double y,double z){
        if (Math.pow(x,2.0) * Math.pow(y,2.0) == Math.pow(z,2.0)||
            Math.pow(x,2.0) * Math.pow(z,2.0) == Math.pow(y,2.0)||
            Math.pow(y,2.0) * Math.pow(z,2.0) == Math.pow(x,2.0)){
            return true;
        }else
            return false;
    }

}
