package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5ShortestName {
    public static void main(String[] args) {
        System.out.println(shortestName("Bego Jukic","Daniel","Jo M","Peda"));

    }
    private static int ErrorIndex = -1;
    public static String shortestName(String... names){
        String result = names[0];
        for (String name:names) {
            int index = name.indexOf(" ");
            if (index == ErrorIndex)
                result = isShortest(result,name);
            else {
                String part1 = name.substring(0,index);
                String part2 = name.substring(index+1);
                result = isShortest(result,isShortest(part1,part2));
            }
        }
        return result;
    }
    public static String isShortest(String a,String b){return a.length() == b.length() ? a : a.length() < b.length() ? a :b;}
}
