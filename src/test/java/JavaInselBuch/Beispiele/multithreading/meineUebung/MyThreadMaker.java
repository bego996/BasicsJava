package JavaInselBuch.Beispiele.multithreading.meineUebung;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyThreadMaker {
    public static void laufenLassen(Runnable runnable,Runnable runnable2,Runnable runnable3){
        File neues = new File("TextFiles/ThreadControlle.txt");
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);
        thread.start();
        thread2.start();
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void imHintergrundLaufen(Runnable runnable){
        Thread thread = new Thread(runnable);
        thread.start();
        try {
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
