package JavaInselBuch.Beispiele.StackUndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<String> downloads = new LinkedList<>();
        downloads.add("CsGo");
        downloads.add("ForHonor");
        downloads.add("KillingFloor");
        downloads.add("StarWars");
        System.out.println(downloads);
        System.out.println(downloads.peek());
        downloads.poll();
        System.out.println(downloads.element());
        //FIFO -> first in first out.
    }
}
