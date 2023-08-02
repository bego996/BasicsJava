package JavaInselBuch.CaptainCao.Capture11FortgeschriteneZeichenkettenverarbeitung_tutego_string_;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BeliebtheitVonCaptaionCaoErmitteln {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("TextFiles/BeliebtheitVonCaptaionCaoErmitteln.txt");
        Scanner scanner = new Scanner(file);
        int nameCounter = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNext("@CaptainCiaoCiao,|#CaptainCiaoCiao")) {
                nameCounter++;
                scanner.next();
            } else
                scanner.next();
        }
        System.out.println(nameCounter);
    }
}
