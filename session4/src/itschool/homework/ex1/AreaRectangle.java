package itschool.homework.ex1;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float len, bre, area;

        System.out.println("Enter the Length of Rectangle: ");
        len = scan.nextFloat();
        System.out.println("Enter the Breadth of Rectangle: ");
        bre = scan.nextFloat();

        area = len * bre;
        System.out.println("Area = " + area);
    }
}
