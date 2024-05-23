package ex3;

public class Main {

    public static void main(String[] args) {


        Student student1 = new Student("Alice", 20, "12345", "alice@example.com");
        Student student2 = new Student("Alice", 20, "12345", "alice@example.com");
        Student student3 = new Student("Bob", 25, "67890", "bob@example.com");

        System.out.println("Student1 equals student2: " + student1.equals(student2));
        System.out.println("Student1 equals student3: " + student1.equals(student3));

        System.out.println("Hashcode of student1: " + student1.hashCode());
        System.out.println("Hashcode of student2: " + student2.hashCode());
    }
}
