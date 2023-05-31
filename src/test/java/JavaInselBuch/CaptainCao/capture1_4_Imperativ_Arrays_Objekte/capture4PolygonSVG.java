package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

public class capture4PolygonSVG {
    public static void main(String[] args) {
        System.out.println(polygonAVG(210,20,50,60,70,80));
    }
    public static String polygonAVG(int... cordinates){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cordinates.length ; i+=2) {
            if (cordinates.length%2 == 1 ) {
                sb.append("Eine Koordinate fehlt!");
                break;
            }
            else
                sb.append(i==0 ? "<polygon points= \"": "").append(cordinates[i]).append(",").append(cordinates[i + 1]).append(i==cordinates.length-2 ? "\" />":" ");
        }
        return sb.toString();
    }
}
