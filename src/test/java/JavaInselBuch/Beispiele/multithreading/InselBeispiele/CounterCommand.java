package JavaInselBuch.Beispiele.multithreading.InselBeispiele;

import java.util.stream.IntStream;

public class CounterCommand implements Runnable{
    @Override
    public void run() {
        IntStream.range(0,20).forEach(System.out::println);
    }
}
