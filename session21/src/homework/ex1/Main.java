package homework.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        List<Integer> evenNumbers = filterNumbers(numbers, n -> n % 2 == 0);

        System.out.println("Even numbers in the list: " + evenNumbers);
    }

    public static List<Integer> filterNumbers(List<Integer> numbers, NumberFilter filter) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (filter.filter(number)) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;
    }
}
