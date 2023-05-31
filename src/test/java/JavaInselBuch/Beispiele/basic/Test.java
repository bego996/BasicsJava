package JavaInselBuch.Beispiele.basic;



public class Test {
    public static void main(String[] args) {
        String s = null;
        System.out.println(isNullOrEmpty(s));
        System.out.println(isNullOrEmpty(" "));
        System.out.println(isNullOrEmpty("hallo"));
    }
    public static boolean isNullOrEmpty(String str){
        return str == null || str.isEmpty();
    }
}
