package JavaInselBuch.Beispiele.basic.tryAndCatch;

import java.util.Scanner;

public class ExceptionThrower {
    public void divide(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie eine Zahl ein:");
        int number = scanner.nextInt();
        if (number == 0){
            throw new ArithmeticException("Nicht durch null teilen!");
        }if (number == 1){
            throw new ArithmeticException("Nicht durch 1 teilen!");
        }
    }
}
