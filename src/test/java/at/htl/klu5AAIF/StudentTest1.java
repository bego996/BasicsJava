package at.htl.klu5AAIF;

import java.time.LocalDate;

public class StudentTest1 {
    public static void main(String[] args) {
        //First Task
        Student student1_0 = new Student("Jukic","Bego",'m',"5AAIF");
        Student student2_0 = new Student("Jukic","Bego",'m',76.5,177,"5AAIF");
        Student student3_0 = new Student("Jukic","Bego",'m',LocalDate.of(1996, 1, 4),76.5,177,"5AAIF");
        student1_0.setHeight(178);
        System.out.println(student1_0); // To String Methode aufrufen.

        System.out.println(student2_0.getWeight());
        student2_0.setWeight(76);
        System.out.println(student2_0.getWeight());
        System.out.println();

        student3_0.setClassName("BeGo3");
        System.out.println(student3_0);
        System.out.println();

        //Third Task
        System.out.println(getBMI(student2_0));
        System.out.println();

        //Fourth Task
        System.out.println(toString(student2_0));

        //Fifth Task
        System.out.println(equals(student1_0,student2_0));
        System.out.println();

        //Sixth Task
        Student aClone = clone(student1_0);
        System.out.println(aClone);
        System.out.println();

        //Seventh Task
        swap();
        System.out.println();

        //Eighte Task
        Student[] students = getArray();
        //Ninth Task
        print(students);
        System.out.println();
        //Tenth Task
        print("2BHBG",students);


    }
    public static double getBMI(Student student){
        String heightToString = String.valueOf(student.getHeight());
        double resultBMI = 0;
        switch (heightToString.length()){
            case 2 -> resultBMI = student.getWeight() / Math.pow(Double.parseDouble("0."+ heightToString),2);
            case 3 -> resultBMI = student.getWeight() / Math.pow(Double.parseDouble("1."+heightToString.substring(1)),2);
        }
        return resultBMI;
    }
    public static String toString(Student student){
        return String.format("%s| %s| %s| %s|%.2f",student.getClassName(),student.getSurname(),student.getFirstname(), student.getSex(),getBMI(student));
    }

    public static boolean equals(Student student1, Student student2) {
        return student1.getSurname().equals(student2.getSurname()) &&
                student1.getFirstname().equals(student2.getFirstname()) &&
                student1.getSex() == student2.getSex();
    }

    public static Student clone(Student original) {
        return new Student(original.getSurname(), original.getFirstname(), original.getSex(), original.getDateOfBirth(), original.getWeight(), original.getHeight(), original.getClassName());
    }

    public static void swap() {
        Student student1 = new Student("Muster", "Max", 'm', "3AHBG");
        Student student2 = new Student("Musterfrau", "Maria", 'w', "3BHBG");

        System.out.println("Vor Tausch:");
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);

        Student temp = clone(student1);
        student1 = clone(student2);
        student2 = temp;

        System.out.println("\nNach Tausch:");
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
    }

    public static Student[] getArray() {
        Student[] students = new Student[10];
        students[0] = new Student("Jukic", "Bego", 'm', "2AHBG");
        students[1] = new Student("Muster", "Karlota", 'w', "2AHBG");
        students[2] = new Student("Muster", "Peter", 'm', "2AHBG");
        students[3] = new Student("Muster", "Fritza", 'w', "2AHBG");
        students[4] = new Student("Muster", "Charlie", 'd', "2AHBG");
        students[5] = new Student("Muster", "Paul", 'd', "2BHBG");
        students[6] = new Student("Muster", "Lukas", 'd', "2BHBG");
        students[7] = new Student("Muster", "Mario", 'd', "2BHBG");
        students[8] = new Student("Muster", "Heinza", 'w', "2BHBG");
        students[9] = new Student("Muster", "Juergen", 'm', "2BHBG");
        return students;
    }

    public static void print(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void print(String className, Student[] students) {
        System.out.println("Schulklasse: " + className);
        for (Student student : students) {
            if (student.getClassName().equals(className)) {
                System.out.println(student);
            }
        }
    }
}
