package homework.ex2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        String longestString = strings.stream()
                .max((s1, s2) -> s1.length() - s2.length())
                .orElse(null);

        System.out.println("List of Strings: " + strings);
        System.out.println("Longest String: " + longestString);
    }
}
