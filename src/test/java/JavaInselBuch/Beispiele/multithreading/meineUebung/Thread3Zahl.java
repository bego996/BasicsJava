package JavaInselBuch.Beispiele.multithreading.meineUebung;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Thread3Zahl implements Runnable {

    File neues = new File("TextFiles/ThreadControlle.txt");

    @Override
    public void run() {
        for (int i = 2; i < 30; i += 3) {
            try {
                Thread.sleep(3);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

