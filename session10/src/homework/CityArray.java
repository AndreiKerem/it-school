package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class CityArray {

    public static void main(String[] args) {

        ArrayList<String> cityNames = new ArrayList<>();

        cityNames.add("New York");
        cityNames.add("London");
        cityNames.add("Paris");
        cityNames.add("Tokyo");
        cityNames.add("Sydney");

        System.out.println("Initial City Names: " + cityNames);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a city name to add: ");
        String newCity = scanner.nextLine();

        if (cityNames.contains(newCity)) {
            System.out.println(newCity + "is already in the list.");
        } else {
            cityNames.add(newCity);
            System.out.println(newCity + "has been added to the list.");
        }

        System.out.println("Updated City Names: " + cityNames);
    }
}
