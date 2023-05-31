package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5CaptainInTheMiddle {
    public static void main(String[] args) {
        System.out.println(isCaoCaoInTheMiddle("kkkCaoCaok"));
        System.out.println(isCaptainInMiddle("BambooCiaoCiaoBambooo"));

    }
    public static boolean isCaoCaoInTheMiddle(String text){ //Meine Methode
        String cap = "CaoCao";
        int index1 = text.indexOf('o');
        int index2 = text.indexOf('o',index1+1);
        return text.length() - 1 - index2 == text.indexOf(cap.charAt(0));
    }
    public static boolean isTextMiddle(String text,String middle){ //Buch Methode
        if (middle.length() > text.length())
            return false;
        int start = (text.length() / 2) - (middle.length() / 2);
        return text.regionMatches(start,middle,0,middle.length());
    }
    public static boolean isCaptainInMiddle(String text){ //Buch Methode (Bug gefunden)
        return isTextMiddle(text,"CiaoCiao");
    }
}
