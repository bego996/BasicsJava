package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5RemoveVowe1 {
    public static void main(String[] args) {
        System.out.println(removeVowel("Ich versehe dich nöcht yet"));
    }
    public static String removeVowel(String text){
        return text.toUpperCase().replaceAll("[AÄEIOÖUÜY]","");
    }
}
