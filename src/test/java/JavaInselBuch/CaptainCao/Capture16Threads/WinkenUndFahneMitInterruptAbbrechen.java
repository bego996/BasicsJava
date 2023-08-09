package JavaInselBuch.CaptainCao.Capture16Threads;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class WinkenUndFahneMitInterruptAbbrechen {

    static class FahneHeben implements Runnable { //Hier eine statische Klasse um sie später in der Main Methode nutzen zu können. Ist nur als Testzweck statisch um in anderen Klassen damit arbeiten zu können!
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Fahne " + Thread.currentThread());
                try {
                    TimeUnit.MILLISECONDS.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("FahneHeben wurde unterbrochen");
                    return; //return nicht nötig pfalls man wieder in die while schleife rauf will.
                }
            }
        }
    }

    public static void main(String[] args) {

        class Winken implements Runnable { //Hier einmal eine lokale Klasse für die Methode, funktioniert nur innerhalb der Methode, sonst für keine anderen Klassen.
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Winken " + Thread.currentThread());
                    try {
                        TimeUnit.MILLISECONDS.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Winken wurde unterbrochen");
                        return;
                    }
                }
            }
        }


        Thread winken = new Thread(new Winken(), "Linke Hand");
        Thread fahne = new Thread(new FahneHeben(), "Rechte Hand");
        winken.start();
        fahne.start();
        while (winken.isAlive() || fahne.isAlive()) {
            String input = JOptionPane.showInputDialog("Deine Eingabe:");
            if (input == null) {
            } else if (input.equalsIgnoreCase("endw"))
                winken.interrupt();
            else if (input.equalsIgnoreCase("endf"))
                fahne.interrupt();
        }
        System.out.println("Programm beendet");
    }
}
