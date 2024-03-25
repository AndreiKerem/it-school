package homework;

import java.util.Scanner;

public class EvenOrOddCheckerEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        //USING TERNARY OPERATOR
        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

        //USING IF...ELSE STATEMENT
        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");

    }
}
