package JavaInselBuch.Beispiele.kapitel6EigeneKlassen;

public class PersonKaskadierteAusgabeOhneKonstruktor {

    private String name;
    private int age;

    public PersonKaskadierteAusgabeOhneKonstruktor setName(String name) {
        this.name = name;
        return this;
    }

    public PersonKaskadierteAusgabeOhneKonstruktor setAge(int age) {
        this.age = age;
        return this;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        PersonKaskadierteAusgabeOhneKonstruktor person = new PersonKaskadierteAusgabeOhneKonstruktor().setName("John Doe").setAge(30);
        person.displayInfo();
    }
}

