package homework;


import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    int quantity;
    String food;

    public ShoppingList(String food, int quantity) {
        this.quantity = quantity;
        this.food = food;
    }

    public static void main(String[] args) {
        List<ShoppingList> food = new ArrayList<>();
        //"Bacon", "Chicken", "Ham", "Butter", "Cheese", "Eggs"
        ShoppingList b1 = new ShoppingList("Bacon", 3);
        ShoppingList c = new ShoppingList("Chicken", 1);
        ShoppingList h = new ShoppingList("Ham", 1);
        ShoppingList b2 = new ShoppingList("Butter", 2);
        ShoppingList c2 = new ShoppingList("Cheese", 1);
        ShoppingList e = new ShoppingList("Eggs", 6);

        food.add(b1);
        food.add(c);
        food.add(h);
        food.add(b2);
        food.add(c2);
        food.add(e);

        for (ShoppingList s : food) {
            System.out.println(s.food + "      " + s.quantity);
        }
    }
}
