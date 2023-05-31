package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

public class Capture4_YesOrNo {
    public static void main(String[] args) {
        System.out.println(allTrue(true,true));
    }
    public static boolean allTrue(boolean needed,boolean...votes){
        for (boolean vote:votes) {
            if (!vote)
                return false;
        }
        return needed;
    }
}
