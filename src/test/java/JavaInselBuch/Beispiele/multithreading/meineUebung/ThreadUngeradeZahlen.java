package JavaInselBuch.Beispiele.multithreading.meineUebung;

import java.io.File;


public class ThreadUngeradeZahlen implements Runnable {
    File neues = new File("TextFiles/ThreadControlle.txt");

    @Override
    public void run() {
        for (int i = 1; i < 29; i += 3) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
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
