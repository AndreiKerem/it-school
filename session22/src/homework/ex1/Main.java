package homework.ex1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);

        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();

        System.out.println("Original List: " + numbers);
        System.out.println("List of Even Numbers: " + evenNumbers);
    }
}
