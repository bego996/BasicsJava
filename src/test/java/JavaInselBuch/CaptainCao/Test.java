package JavaInselBuch.CaptainCao;


import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("TextFiles/teile.txt");
        FileReader fileReader = new FileReader(file);
        System.out.println(file.isFile());
        System.out.println(fileReader.ready());
        List<String> namen = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        String[] liste = scanner.nextLine().split(" ");
        for (int i = 0; i < liste.length; i++) {
            if (liste[i].regionMatches(0,"Boden",0,5)) {
                System.out.println(liste[i]);
            }
        }
        scanner.close();
        fileReader.close();
        System.out.println();

        File file1 = new File("C:/Users/bego/Desktop/KillingFloorMapNeededHoE.txt");
        System.out.println(file1.isFile());
        FileReader fileReader1 = new FileReader(file);
        FileWriter fileWriter = new FileWriter("C:/Users/bego/Desktop/KillinFloorHoeOverworked");
        Scanner scanner1 = new Scanner(file1);
        List<String> killingFloor = new ArrayList<>();
        while (scanner1.hasNextLine()){
            killingFloor.add(scanner1.nextLine());
        }
        Collections.sort(killingFloor);
        killingFloor.forEach(System.out::println);
        for (String str:killingFloor) {
            fileWriter.write(str + System.lineSeparator());
        }
        fileWriter.close();
    }
}


