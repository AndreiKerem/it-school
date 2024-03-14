package homework;

public class TernaryEx {
    public static void main(String[] args) {
        int heightOne = 55;
        int heightTwo = 78;

        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;

        System.out.println("Greater height is " + maximumHeight);

    }
}
