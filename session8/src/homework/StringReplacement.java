package homework;

import java.util.Scanner;

public class StringReplacement {

   public static String replaceSubstring(String original, String target, String replacement) {
       StringBuilder result = new StringBuilder();
       int startIndex = 0;
       int endIndex;

       while ((endIndex = original.indexOf(target, startIndex)) != -1) {
           result.append(original, startIndex, endIndex);
           result.append(replacement);
           startIndex = endIndex + target.length();
       }

       result.append(original.substring(startIndex));
       return result.toString();

   }
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.println("Enter the target substring to replace: ");
        String targetSubstring = scanner.nextLine();

        System.out.println("Enter the replacement substring: ");
        String replacementSubstring = scanner.nextLine();

        String replacedString = replaceSubstring(originalString, targetSubstring, replacementSubstring);

        System.out.println("Original String: " + originalString);
        System.out.println("Replaced String: " + replacedString);
    }
}
