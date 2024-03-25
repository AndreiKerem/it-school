package homework;

public class ConcatenateMultipleStrings {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        str.append("Hello");
        str.append("-");
        str.append("World");

        System.out.println(str.toString());
    }
}
