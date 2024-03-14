package itschool.homework.ex1;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the Length of Rectangle: ");
        float len = scan.nextFloat();
        System.out.println("Enter the Breadth of Rectangle: ");
        float bre = scan.nextFloat();

        float area = len * bre;
        System.out.println("Area = " + area);
    }
}
