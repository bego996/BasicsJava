package JavaInselBuch.Beispiele.basic;


import java.util.Arrays;

public class arrayOgObjects {
    public static void main(String[] args) {
        Object[] a2 = new Object[5];
        a2[0] = 15;
        a2[1] = 'w';
        a2[2] = "Dora";
        System.out.println(Arrays.toString(a2));

        int testInt = 15;
        char testChar = 'a';
        String testStr = "test";
        Object[] test = new Object[]{testInt,testChar,testStr};
        System.out.println(Arrays.toString(test));
        System.out.println((int)(test[0])*10);

        Object[] a1 = new Object[]{10,'a',"Horst"};
        System.out.println(Arrays.toString(a1));

        Employer[] apartment = new Employer[5];
        Employer[] apartment2  = new Employer[2];
        apartment2[0] = new Employer(20,'M',"Torben");
        apartment2[1] = new Employer(25,'W',"Dora");
        apartment[0] = new Employer(15,'M',"Daniel");
        apartment[1] = new Employer(20,'M',"Herbert");
        apartment[2] = new Employer(30,'M',"Karl");
        apartment[3] = new Employer(50,'M',"Werner");
        apartment[4] = new Employer(55,'W',"Doris");
        System.out.println("Employer in frist object:");
        apartment[0].display();
        System.out.println(apartment.length);
        for (Employer b:apartment) {
            b.display();
        }
        System.out.println(apartment2.length);
        for (Employer a: apartment2) {
            a.display();
        }
    }
}
class Employer {
    int age;
    String employeName;
    char gender;

    Employer(int a, char g, String name){
        age = a;
        employeName = name;
        gender = g;
    }
    public void display(){
        System.out.println("Name: "+employeName+","+"Age: "+age+","+"Gender: "+gender);
    }
}