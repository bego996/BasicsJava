package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

import java.util.Scanner;

public class Person {
    //Eigenschaften/Atributte
    private String name;
    private float grösse;
    private String hautFarbe;
    private int gewicht;


    public Person(){
        System.out.println("Person wurde erzeugt");
    }

    public Person(String name, int gewicht, float grösse, String hautFarbe) {
        this.name = name;
        this.gewicht = gewicht;
        this.grösse = grösse;
        this.hautFarbe = hautFarbe;

    //    hunger();
    }

    //Getter und Setter generieren

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrösse() {
        return grösse;
    }

    public void setGrösse(float grösse) {
        this.grösse = grösse;
    }

    public String getHautFarbe() {
        return hautFarbe;
    }

    public void setHautFarbe(String hautFarbe) {
        this.hautFarbe = hautFarbe;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    //Methoden
    public void gehen(int speed) {
        System.out.println(name + " ist am spazieren mit " + speed + "km/h..");
    }
    public void gehen() {
        System.out.println(name + " ist am spazieren...");
    }
    public void hunger() {
        System.out.println(name + " ist am essen..");
        Scanner sc = new Scanner(System.in);
        System.out.print("Hast du auch Hunger?: ");
        String antwort = sc.next();
        if (antwort.equals("Ja")) {
            System.out.println("Bediene dich vom Büffet!");
        }
        else
        if (antwort.equals("Nein")) {
            System.out.println("Dan setze dich hin!");
            }
        else
            System.out.println("Ein Nein oder Ja wir akzeptiert!");
        }
    }
