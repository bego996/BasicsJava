package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

public class LinePrinterDemo extends LinePrinter {
    public static void main(String[] args) {
        line(10);
        System.out.println();
        line(5,'x');
        System.out.println();
        line("        ",5,'x',"      ");
        System.out.println();
        System.out.print(RightTriangle(4,2,8));
    }
}
