package JavaInselBuch.Beispiele.anonymeKlassenPackage;

public class TestKlasseFuerEigeneImplementierungen {
    public static void main(String[] args) {

        printNow(new PrintableEigenImplement() {
            @Override
            public void printNow() {
                System.out.println("Geschaft");
            }
        });

    }
    public static void printNow(PrintableEigenImplement printable){
        printable.printNow();
    }
}
