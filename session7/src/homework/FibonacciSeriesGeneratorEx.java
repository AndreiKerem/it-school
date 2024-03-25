package homework;

import java.util.Scanner;

public class FibonacciSeriesGeneratorEx {

    public static void main(String[] args) {

        int n;
        int a = 0;
        int b = 0;
        int c = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        n = scanner.nextInt();

        System.out.println("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + "");
        }
    }
}
