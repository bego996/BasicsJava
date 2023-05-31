package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5WoerterUnterstreichen {
    public static void main(String[] args) {
        printUnderLine("Das ist so weil dass So ist so das.","das");
    }
    public static void printLine(int length){
        for (int i = 0; i < length ; i++)
            System.out.print('-');
    }
    public static void printFreeRoom(int length){
        for (int i = 0; i < length ; i++) {
            System.out.print(' ');
        }
    }
    public static void printUnderLine(String text,String search) {
        if ((text != null && !text.isEmpty()) && (search != null && !search.isEmpty())) {
            System.out.println(text);
            for (int index = 0,lastindex = 0;
                 (index = text.toUpperCase().indexOf(search.toUpperCase(),index)) != -1;
                  index+=search.length(),lastindex = index) {

                printFreeRoom(index-lastindex);
                printLine(search.length());
                //System.out.print(" ".repeat(index-lastindex)+"-".repeat(search.length())); @Alternativersatz für die Methodenschleifen.
            }
        }
        else
            System.out.println(text);
    }
}
