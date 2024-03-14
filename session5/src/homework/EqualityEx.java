package homework;

public class EqualityEx {
    public static void main(String[] args) {

        Integer firstNumber = 10;
        Integer secondNumber = 20;

        System.out.println( firstNumber == secondNumber);

        String firstString = String.valueOf(firstNumber);
        String secondString = String.valueOf(secondNumber);

        System.out.println( firstString.equals(secondString));

    }
}
