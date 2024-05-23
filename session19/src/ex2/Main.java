package ex2;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Alice", 30, "alice@example.com");
        Person person2 = new Person("Alice", 30, "alice@example.com");
        Person person3 = new Person("Bob", 25, "bob@example.com");

        System.out.println("Person1 equals person2: " + person1.equals(person2));
        System.out.println("Person1 equals person3: " + person1.equals(person3));

        System.out.println("Hashcode of person1: " + person1.hashCode());
        System.out.println("Hashcode of person2: " + person2.hashCode());
    }
}
