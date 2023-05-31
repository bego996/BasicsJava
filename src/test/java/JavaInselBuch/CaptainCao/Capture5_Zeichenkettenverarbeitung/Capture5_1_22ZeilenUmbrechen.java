package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5_1_22ZeilenUmbrechen {
    public static void main(String[] args) {
        System.out.println(wrap("Wegen der kleinsten Problemchen, die teilweise nicht zu ändern sind, müssen diese Menschen immerzu meckern oder sich lautstark darüber aufregen. Passiert das zu oft, wird es anderen schnell zu viel. Auf Dauer fühlen sich die Gesprächspartner:innen meist hilflos und wissen nicht mehr, wie sie reagieren sollen, erklärt die Psychologin. Außerdem zieht die immerzu negative Einstellung der jeweiligen Person sie mit herunter. Sie können oft nicht nachvollziehen, warum jede Kleinigkeit den:die andere zur Weißglut bringt.",25));

    }
    public static String wrap(String str,int widht){
        int widthRequired = findMaxWordLength(str);
        if (str.length() <= widht || widht*2+1 >= str.length())
            return str;
        else if (widthRequired > widht){
            return "Word parts are to long for the width input : Requires Widht >= "+ widthRequired;
        }else{
          final int mainLength = findMainLength(str,widht);
          String buffer = str.substring(0,mainLength);
          int index = mainLength*2+1;
          int lengthRefresh = mainLength+1;
            while (index < str.length()){
                if (str.charAt(index) != 32){
                    index--;
                }else {
                    buffer += "\n"+str.substring(Math.min(lengthRefresh,index),Math.max(index,lengthRefresh));
                    lengthRefresh = index+1;
                    index += index+mainLength+1 < str.length() ? mainLength+1 : index+widht+1 < str.length() ? str.length()-index : index+widht;
                    if (index >= str.length())
                        buffer += "\n"+str.substring(lengthRefresh);
                }
            }
            return buffer;
        }
    }
    public static int findMainLength(String str, int widht){
        int mainLength;
        int i = widht-1;
        while (i < str.length()){
            if (str.charAt(i) != 32){
                i++;
            }else {
                mainLength = i;
                return mainLength;
            }
        }
        return i;
    }
    public static int findMaxWordLength(String txt){
        String[] parts = txt.split(" ");
        int mainPart = parts[0].length();
        for (int i = 1; i < parts.length; i++) {
            mainPart = Math.max(mainPart,parts[i].length());
        }
        return mainPart;
    }
}
