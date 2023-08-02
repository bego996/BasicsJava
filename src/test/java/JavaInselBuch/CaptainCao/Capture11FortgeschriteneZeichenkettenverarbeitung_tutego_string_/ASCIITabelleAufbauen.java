package JavaInselBuch.CaptainCao.Capture11FortgeschriteneZeichenkettenverarbeitung_tutego_string_;


public class ASCIITabelleAufbauen {


    public static void main(String[] args) {
        //String test = String.format("%4$1h %3$1s %2$2s %1$2s", 5, "b", "c", 255);
        int charDelimiter = 32;
        move:
        for (int i = 0; i < 16; i++) {
            for (char j = (char) charDelimiter; j < 128; j += 16) {
                String asciiRow = String.format("%s%d %H %c   ", String.valueOf((int) j).length() == 2 ? " " : "", (int) j, j, j);
                if ((int) j != charDelimiter + 16 * 5) {
                    System.out.print(asciiRow);
                } else {
                    if ((int) j == 127) {
                        asciiRow = String.format("%d %H %s   ", (int) j, j, "DEL");
                        System.out.println(asciiRow);
                        break;
                    }
                    System.out.println(asciiRow);
                    charDelimiter++;
                    continue move;
                }
            }
        }
        System.out.println();
        printList(new String[]{"bego juki", "dani damels", "erker berk", "cher i"}, new boolean[]{true, false, true, true});


    }

    public static void printList(String[] names, boolean[] paid) {
        int counter = 0;    //Zähler ist Optional hinzugefügt, um die nötige Anzahl von Durchläufen prüfen zu können.
        boolean run = true;
        for (int i = 0; i < names.length && run; i++) {
            counter++;
            run = false;
            for (int j = 0; j < names.length - 1; j++) {
                if (names[j].length() < names[j + 1].length()) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                    run = true;
                }
            }
        }
        for (int i = 0; i < names.length; i++) {
            String oneLine = String.format("%s%s%s", names[i]," ".repeat(names[0].length() - names[i].length() +3 ), paid[i] ? "paid" : "not paid");
            System.out.println(oneLine);
        }
    }
}
