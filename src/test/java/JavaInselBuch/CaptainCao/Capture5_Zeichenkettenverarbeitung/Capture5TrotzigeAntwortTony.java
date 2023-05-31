package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

import java.util.Scanner;

public class Capture5TrotzigeAntwortTony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String request = sc.nextLine();
        if (request.equalsIgnoreCase("No Idea?"))
            System.out.println("Aye!");
        else if (request.endsWith("?"))
            System.out.println(request + " No Idea!");
    }
}
