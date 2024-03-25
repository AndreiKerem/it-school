package homework;

public class StringReplacement {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("The cat sat on the mat.");
        System.out.println("Original string = " + str.toString());

        StringBuilder str2 = str.replace(4, 7, "dog");
        System.out.println("After replace = " + str2.toString());
    }
}
