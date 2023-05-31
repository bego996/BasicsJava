package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5TexteEntspalten {
    public static void main(String[] args) {
        String text =   "I’m dishonest, and a    never predict when\n" +
                        "dishonest man you       they’re going to do\n" +
                        "can always trust to     something incredibly\n" +
                        "be dishonest.           stupid.\n" +
                        "Honestly, it’s the\n" +
                        "honest ones you want\n" +
                        "to watch out for,\n" +
                        "because you can";
        deluminize(text);
        }
        public static void deluminize(String text) {
            String[] unsorted = completeWhiteSpace(text);
            if (unsorted.length < 2){
                System.out.println(text);
                return;
            }
            int MiddleIndex = 1;
            marker:
            for (int i = 0; i < unsorted.length;) {
                for (int j = MiddleIndex; j < unsorted[i].length() ; ) {
                    if (isWhiteSpace(unsorted[i],j) != IndexNotFound){
                        MiddleIndex = isWhiteSpace(unsorted[i],j);
                        i++;
                        continue marker;
                    } else if (isWhiteSpace(unsorted[i],j) == IndexNotFound && j == unsorted[i].length()-1) {
                        MiddleIndex++;
                        break marker;
                    } else {
                        i -= i;
                        j++;
                    }
                }
            }
            String upperText = "";
            String lowerText = "";
            for (String part:unsorted) {
                upperText += !part.substring(0,MiddleIndex).isBlank() ? part.substring(0,MiddleIndex+1).trim() + "\n" : "";
                lowerText += !part.substring(MiddleIndex).isBlank() ? part.substring(MiddleIndex+1).trim() + "\n" : "";
            }
            System.out.printf("%s",upperText+lowerText);
    }
        final private static int IndexNotFound = -1;
        public static int isWhiteSpace(String text,int index){
            if (Character.isWhitespace(text.charAt(index))){
                return index;
            }
            return IndexNotFound;
        }
        public static String[] completeWhiteSpace(String text){
            String[] toPrepare = text.split("\n");
            if (toPrepare.length >= 2) {
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
            return toPrepare;
        }
}




