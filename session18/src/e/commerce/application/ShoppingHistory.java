package e.commerce.application;

import java.util.*;

public class ShoppingHistory {

    private Map<String, Integer> itemFrequencyMap;

    public ShoppingHistory() {
        this.itemFrequencyMap = new HashMap<>();
    }

    public void addPurchase(List<String> shoppingCart) {
        for (String item : shoppingCart) {
            itemFrequencyMap.put(item , itemFrequencyMap.getOrDefault(item, 0) + 1);
        }
    }

    public List<String> getMostFrequentlyPurchasedItems(int k) {
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a, b) -> !a.getValue().equals(b.getValue()) ? b.getValue() - a.getValue() : a.getKey().compareTo(b.getKey())
        );
        for (Map.Entry<String, Integer> entry : itemFrequencyMap.entrySet()) {
            pq.offer(entry);
        }

        List<String> result = new ArrayList<>();
        while (k > 0 && !pq.isEmpty()) {
            result.add(pq.poll().getKey());
            k--;
        }

        return result;
    }
}
