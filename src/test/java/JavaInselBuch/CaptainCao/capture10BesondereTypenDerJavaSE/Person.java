package JavaInselBuch.CaptainCao.capture10BesondereTypenDerJavaSE;

import java.util.Objects;

public class Person {
    public long id;
    public int age;
    public double income;
    public boolean isDrugLord;
    public String name;

    public Person(long id, int age, double income, boolean isDrugLord, String name) {
        this.id = id;
        this.age = age;
        this.income = income;
        this.isDrugLord = isDrugLord;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (id != person.id) return false;
        if (age != person.age) return false;
        if (Double.compare(person.income, income) != 0) return false;
        if (isDrugLord != person.isDrugLord) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + age;
        temp = Double.doubleToLongBits(income);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isDrugLord ? 1 : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Person person = new Person(5000L,50,3500,true,"Parapas");
        Person person2 = new Person(5000L,50,3500,true,"Parapass");
        System.out.println(person.getClass());
        System.out.println(person2.getClass());
        System.out.println(person.equals(person2));
        System.out.println(person.name.hashCode());
        System.out.println(person.hashCode());
    }
}


