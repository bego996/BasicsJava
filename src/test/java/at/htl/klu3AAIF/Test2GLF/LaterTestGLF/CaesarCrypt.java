package at.htl.klu3AAIF.Test2GLF.LaterTestGLF;

public class CaesarCrypt {
    public static void main(String[] args) {
        System.out.println(caesarCrypt("vyAI",-20));
    }
    public static String caesarCrypt(String txt,int key){
        String lowerL = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String buffer = "";
        if (key < 0){
            for (int i = 0; i < txt.length() ; i++) {
                char ch = txt.charAt(i);
                buffer += lowerL.charAt((lowerL.indexOf(ch) + key) < 0 ? (lowerL.indexOf(ch)+key) + 52 : lowerL.indexOf(ch) + key);
            }
        }else {
            for (int i = 0; i < txt.length(); i++) {
                buffer += lowerL.charAt((lowerL.indexOf(txt.charAt(i)) + key) % 52);
            }
        }
            return buffer;
    }
}
