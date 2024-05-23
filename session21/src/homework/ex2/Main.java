package homework.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("List of fruits before sorting: " + fruits);

        Collections.sort(fruits, (s1 , s2) -> s1.compareTo(s2));

        System.out.println("List of fruits after sorting: " + fruits);
    }
}
