package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

public class CaptainComand {
    public static void main(String[] args) {
        System.out.print("Are you for?");
        String input = new java.util.Scanner(System.in).next();
        switch (input) {
            case "Ay", "Ay, ay", "yes", "ja", "Ein Ei" -> System.out.println("Keep it up!");
            default -> System.out.println("Dont you dare!");
        }
    }
}
