package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5GroesereManschaft {
    public static void main(String[] args) {
        System.out.println(shipDistribution(""));
    }
    public static String shipDistribution(String crypts){
        if (crypts == null || crypts.length() == 0)
            return "";
        String part1 = crypts.substring(0,crypts.indexOf("-"));
        String part2 = crypts.substring(crypts.indexOf("-")+1);
        int difference = Math.max(part1.length(),part2.length()) - Math.min(part1.length(),part2.length());
        if (part1.length() > part2.length())
            return "Pirate ship had a larger Crew, difference "+ difference;
        else if (part1.length() < part2.length()) {
            return "Raided ship had a larger Crew, difference "+ difference;}
        else
            return "Ship had the same Crew size!";
    }
}
