package at.htl.klu3AAIF.Uebung5Arrays;

public class Task7 {
    public static void main(String[] args) {
        String names = "Peter;Susi; Franz;Maria ;Charly;Sabsi";
        String [] splitedNames = names.split("[; ]+");


        for (String a : splitedNames)
            System.out.println(a);
    }
}
