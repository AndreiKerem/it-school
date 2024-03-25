package homework;

import java.util.Locale;

public class DuplicateCharacterRemover {

    public static void main(String[] args) {
        String str = "balloon";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (sb.indexOf(String.valueOf(str.charAt(i))) == -1) {
                sb.append(str.charAt(i));
            }
        }

        System.out.println("Original string : " + str);
        System.out.println("After removing the duplicates : " + sb.toString());
    }
}
