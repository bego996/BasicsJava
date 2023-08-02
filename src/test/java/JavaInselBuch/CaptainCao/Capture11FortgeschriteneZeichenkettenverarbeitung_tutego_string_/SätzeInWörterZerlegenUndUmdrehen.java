package JavaInselBuch.CaptainCao.Capture11FortgeschriteneZeichenkettenverarbeitung_tutego_string_;

public class SätzeInWörterZerlegenUndUmdrehen {
    public static void main(String[] args) {
        String message = "erehW did eht etarip esahcrup sih kooh? tA eht dnah-dnoces pohs!";
        String[] splitedInWords = message.split("[ !?]+");
        for (int i = 0; i < splitedInWords.length ; i++) {
            StringBuilder sb = new StringBuilder(splitedInWords[i]);
            splitedInWords[i] = sb.reverse().toString();
        }
        for (String splitedInWord : splitedInWords) {
            System.out.print(splitedInWord+" ");
        }
    }
}
