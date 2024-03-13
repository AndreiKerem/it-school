package homework;

public class TernaryEx {
    public static void main(String[] args) {
        int heightOne = 55, heightTwo = 78, maximumHeight;

        maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;

        System.out.println("Greater height is " + maximumHeight);

    }
}
