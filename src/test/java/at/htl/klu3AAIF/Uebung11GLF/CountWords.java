package at.htl.klu3AAIF.Uebung11GLF;

public class CountWords {
    public static void main(String[] args) {
        int partAmount = 0;
        String zitat = "So many books so little time";
        String[] zitatSplited = zitat.split(" ");
        for (String part:zitatSplited) {
            if (part.equalsIgnoreCase("so"))
                partAmount++;
        }
        System.out.println("Anzahl: "+partAmount);
    }
}
