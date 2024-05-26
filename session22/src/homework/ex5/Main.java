package homework.ex5;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Alice", "Johnson", 20),
                new Person("Bob", "Smith", 17)
        );

        List<Person> peopleOver18 = people.stream()
                .filter(person -> person.getAge() > 18)
                .toList();

        System.out.println("List of People:");
        people.forEach(System.out::println);

        System.out.println("\nPeople Older Than 18:");
        peopleOver18.forEach(System.out::println);
    }
}

