package itschool.homework.ex1;

import java.util.Scanner;

public class BinaryArithmeticOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = scan.nextInt();

        int res = num1 + num2;
        System.out.println("Addition Result = " + res);
        res = num1 - num2;
        System.out.println("Subtraction Result = " + res);
        res = num1 * num2;
        System.out.println("Multiplication Result = " + res);
        res = num1 / num2;
        System.out.println("Division Result = " + res);
        res = num1 % num2;
        System.out.println("Modulus Result = " + res);
    }
}