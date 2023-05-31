package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5YundZvertauschen {
    public static void main(String[] args) {
    printSwapedYZ_("Yepelzn");
    }
    public static void printSwapedYZ(String text) {
        char[] chain = text.toCharArray();
        for (int i = 0; i < chain.length; i++) {
            chain[i] = chain[i] == 90 ? 89   : chain[i] == 89 ? 90   :
                       chain[i] == 122 ? 121 : chain[i] == 121 ? 122 : chain[i];
        }
        for (char letter:chain) {
            System.out.print(letter);
        }
    }
    public static void printSwapedYZ_(String text){
        char[] chain = text.toCharArray();
        for (int i = 0; i < chain.length ; i++) {
            switch (chain[i]){
                case 'Z' -> chain[i] = 'Y';
                case 'z' -> chain[i] = 'y';
                case 'Y' -> chain[i] = 'Z';
                case 'y' -> chain[i] = 'z';
            }
        }
        for (char letter:chain) {
            System.out.print(letter);
        }
    }
}
