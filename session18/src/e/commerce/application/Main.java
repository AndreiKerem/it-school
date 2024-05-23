package e.commerce.application;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ShoppingHistory shoppingHistory = new ShoppingHistory();

        shoppingHistory.addPurchase(Arrays.asList("A", "B", "C"));
        shoppingHistory.addPurchase(Arrays.asList("A", "B", "D"));
        shoppingHistory.addPurchase(Arrays.asList("A", "B", "C"));
        shoppingHistory.addPurchase(Arrays.asList("A", "E", "C"));

        List<String> mostFrequentItems = shoppingHistory.getMostFrequentlyPurchasedItems(2);
        System.out.println("Most frequently purchased items: " + mostFrequentItems);
    }
}
