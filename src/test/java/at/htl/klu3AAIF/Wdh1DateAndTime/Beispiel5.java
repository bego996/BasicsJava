package at.htl.klu3AAIF.Wdh1DateAndTime;

public class Beispiel5 {
    public static void main(String[] args) {
        String wort = "HtlMössinger";
        StringBuilder rg = new StringBuilder(), re = new StringBuilder();
        for (int i = 0, j = wort.length() - 1; i < wort.length(); i++, j--) {
            rg.append("(").append(i).append(")");
            rg.append(wort.charAt(i));
            re.append("(").append(j).append(")");
            re.append(wort.charAt(j));
        }
        System.out.println();
        System.out.println(rg);
        System.out.println(re);
        System.out.println();
    }
}
