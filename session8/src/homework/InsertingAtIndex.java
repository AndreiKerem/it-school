package homework;

public class InsertingAtIndex {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("value1 is ");
        System.out.println("Before insert : " + sb1);

        sb1.insert(10, true);
        System.out.println("After insert : " + sb1);
    }
}
