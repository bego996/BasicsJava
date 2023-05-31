package JavaInselBuch.Beispiele.basic.tryAndCatch;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        ExceptionThrower exceptionThrower = new ExceptionThrower();
        //exceptionThrower.divide();
        try {
            exceptionThrower.divide();
        }catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        }catch (InputMismatchException exception){
            System.out.println("Falscher Wert");
        }catch (Exception exception){
            System.out.println("Ein Fehler ist aufgetreten.");
        }
    }
}
