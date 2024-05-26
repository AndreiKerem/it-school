package homework.ex4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four");

        String concatenatedString = strings.stream()
                .collect(Collectors.joining(", "));

        System.out.println("List of Strings: " + strings);
        System.out.println("Concatenated String: " + concatenatedString);
    }
}
