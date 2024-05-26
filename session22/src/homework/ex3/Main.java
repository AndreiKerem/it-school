package homework.ex3;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        IntStream.rangeClosed(2, 100)
                .filter(Main::isPrime)
                .forEach(System.out::println);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
