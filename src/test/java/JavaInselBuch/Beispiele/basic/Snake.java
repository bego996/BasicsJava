package JavaInselBuch.Beispiele.basic;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        //Position der Figuren initialisieren.
        Random position = new Random();
        Point snake1 = new Point(),snake2 = new Point();
        snake1.x = position.nextInt(59);
        snake1.y = position.nextInt(19);
        snake2.x = position.nextInt(59);
        snake2.y = position.nextInt(19);
        Point player = new Point();
        player.x = position.nextInt(59);
        player.y = position.nextInt(19);
        Point gold1 = new Point(), gold2 = new Point();
        gold1.x = position.nextInt(59);
        gold1.y = position.nextInt(19);
        gold2.x = position.nextInt(59);
        gold2.y = position.nextInt(19);
        Point door = new Point();
        door.x = position.nextInt(59);
        door.y = position.nextInt(19);
        boolean rich1 = false, rich2 = false;
        boolean finallyRich = false;
        boolean firstRound = false;

        while (true){
            //Spielbrett zeichnen
            for (int y = 0; y < 20; y++) {
                for (int x = 0; x < 60 ; x++) {
                    Point p = new Point(x,y);
                    if (player.equals(p))
                        System.out.print('&');
                    else if (snake1.equals(p) || snake2.equals(p))
                        System.out.print('S');
                    else if (gold1.equals(p) || gold2.equals(p))
                        System.out.print('$');
                    else if (door.equals(p))
                        System.out.print('#');
                    else
                        System.out.print('.');
                }
                System.out.println();
            }
            //Status feststellen
        if (finallyRich && player.equals(door)){
            System.out.println("Gewonnen!");
            return;
        }
        if (snake1.equals(player) || snake2.equals(player)){
            System.out.println("Die Schlange hat dich!");
            return;
        }
        if (player.equals(gold1)){
            rich1 = true;
            gold1.setLocation(-1,-1);
        } else if (player.equals(gold2)) {
            rich2 = true;
            gold2.setLocation(-1, -1);
        } else if (rich1 && rich2)
            finallyRich = true;




            //Konsoleneingabe und Spielerposition verändern.
        if (!firstRound){
            switch (new Scanner(System.in).next()) {
                case "t" -> {player.y = Math.min(19, player.y + 5);firstRound = true;}
                case "h" -> {player.y = Math.max(0, player.y - 5);firstRound = true;}
                case "l" -> {player.x = Math.max(0, player.x - 5);firstRound = true;}
                case "r" -> {player.x = Math.min(59, player.x + 5);firstRound = true;}
            }
        }else
            switch (new Scanner(System.in).next()) {
                case "t" -> player.y = Math.min(19,player.y + 1);
                case "h" -> player.y = Math.max(0, player.y - 1);
                case "l" -> player.x = Math.max(0, player.x - 1);
                case "r" -> player.x = Math.min(59,player.x + 1);
            }
        //Schlange 1 & 2 bewegen sich in Richtung Spieler
        if (snake1.x < player.x)
            snake1.x++;
        if (snake2.x < player.x)
                snake2.x++;
            else if (snake1.x > player.x)
                snake1.x--;
            if (snake2.x > player.x)
                snake2.x--;

        if (snake1.y < player.y)
            snake1.y++;
        if (snake2.y < player.y)
                snake2.y++;
            else if (snake1.y > player.y)
                snake1.y--;
            if (snake2.y > player.y)
                snake2.y--;
        }
    }
}


