package homework;

public class CountingNegativeNumbersEx {

    public static void main(String[] args) {

        int i = 0, count = 0;
        int[] count_NegNum = {-40, 15, -4, 11, -8, -13, 22, 16, -11, -99, 55, 18, -60};

        while (i < count_NegNum.length) {
            if (count_NegNum[i] < 0) {
                count++;
            }
            i++;
        }
        System.out.println("The total of negative numbers are: " + count);
    }
}