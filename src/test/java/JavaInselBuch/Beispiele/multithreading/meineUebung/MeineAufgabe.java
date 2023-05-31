package JavaInselBuch.Beispiele.multithreading.meineUebung;


import java.io.IOException;

public class MeineAufgabe {
    public static void main(String[] args) {
        ThreadGeradeZahlen runnable1 = new ThreadGeradeZahlen();
        ThreadUngeradeZahlen runnable2 = new ThreadUngeradeZahlen();
        Thread3Zahl runnable3 = new Thread3Zahl();
        MyThreadMaker.laufenLassen(runnable1,runnable2,runnable3);
        System.out.println("Erledigt :)");

        //ANonyme Klasse für Hintergrund prozess erstellen und mit Lambda abkürzen.
        MyThreadMaker.imHintergrundLaufen(() -> {
            for (int i = 0; i < 10 ; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread4Zahl runnable4 = new Thread4Zahl();
        MyThreadMaker.imHintergrundLaufen(runnable4);
    }
}
