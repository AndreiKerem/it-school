package homework;

public class StringReversedEx2 {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println("String is: " + str);

        StringBuilder reverseStr = str.reverse();
        System.out.println("Reverse String is: " +reverseStr);

    }
}
