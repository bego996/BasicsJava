package JavaInselBuch.Beispiele.StackUndQueue;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<String> games = new Stack<>();
        //Mit Push auf den stack hinzufügen.
        games.push("ForHonor");
        games.push("KillingFloor2");
        games.push("StarWars");

        //.peek() gibt das oberste aus.
        System.out.println(games);
        System.out.println(games.peek());

        //.pop() entfernt das oberste vom Stack.
        String starwars = games.pop();
        System.out.println(games);
        games.push(starwars);
        System.out.println(games);
    }
}
