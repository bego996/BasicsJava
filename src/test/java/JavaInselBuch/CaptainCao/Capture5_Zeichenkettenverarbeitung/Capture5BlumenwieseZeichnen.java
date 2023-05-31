package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5BlumenwieseZeichnen {
    public static void main(String[] args) {
        printFlowers("321");

    }
    public static void printFlowers(String flowerChain){
        String flowers =  "                _\n"
                + "              _(_)_                          wWWWw   _\n"
                + "  @@@@       (_)@(_)   vVVVv     _     @@@@  (___) _(_)_\n"
                + " @@()@@ wWWWw  (_)\\    (___)   _(_)_  @@()@@   Y  (_)@(_)\n"
                + "  @@@@  (___)     `|/    Y    (_)@(_)  @@@@   \\|/   (_)\\\n"
                + "   /      Y       \\|    \\|/    /(_)    \\|      |/      |\n"
                + "\\ |     \\ |/       | / \\ | /  \\|/       |/    \\|      \\|/\n"
                + "\\\\|//   \\\\|//   \\\\\\|//\\\\\\|/// \\|///  \\\\\\|//  \\\\|//  \\\\\\|//\n"
                + "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n";
        String correctNumbs = "12345678";
        String prepared = "";
        if (flowerChain.contains("0") || flowerChain.contains("9") || containLetter(flowerChain)){
            System.out.println(flowerChoice(flowers,1));
        }
        else {
            int [] numbs = new int[flowerChain.length()];
            for (int i = 0; i < numbs.length ; i++) {
                numbs[i] = Character.getNumericValue(flowerChain.charAt(i));
            }
            System.out.println(flowerChoice(flowers,numbs));
        }
    }
    public static String flowerChoice(String text, int... numbs){
        String[] textBlank = completeWhiteSpace(text);
        String output = "";
        int[] ranges = {7,13,22,29,37,44,50,57};
        for (int i = 0; i < textBlank.length ; i++) {
            for (int j = 0; j < numbs.length; j++) {
                switch (numbs[j]) {
                    case 1 -> output += textBlank[i].substring(0,ranges[0]);
                    case 2 -> output += textBlank[i].substring(ranges[0],ranges[1]);
                    case 3 -> output += textBlank[i].substring(ranges[1],ranges[2]);
                    case 4 -> output += textBlank[i].substring(ranges[2],ranges[3]);
                    case 5 -> output += textBlank[i].substring(ranges[3],ranges[4]);
                    case 6 -> output += textBlank[i].substring(ranges[4],ranges[5]);
                    case 7 -> output += textBlank[i].substring(ranges[5],ranges[6]);
                    case 8 -> output += textBlank[i].substring(ranges[6],ranges[7]);
                }
            }
            output += "\n";
        }
        return output;
    }
    public static String[] completeWhiteSpace(String text) {
        String[] toPrepare = text.split("\n");
        int maxLength = 2;
        for (String part : toPrepare) {
            maxLength = Math.max(maxLength, part.length());
        }
        for (int i = 0; i < toPrepare.length; i++) {
            if (toPrepare[i].length() < maxLength) {
                toPrepare[i] += " ".repeat(maxLength - toPrepare[i].length());
            }
        }
        return toPrepare;
        }
    public static boolean containLetter(String text){
        for (int i = 0; i < text.length() ; i++) {
            if ((text.charAt(i) >= 65 && text.charAt(i) <= 90) || text.charAt(i) >= 97 && text.charAt(i) <= 122)
                return true;
        }
        return false;
    }
}


