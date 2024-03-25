package homework;

import java.time.LocalDate;

public class DisplayingTodaysDate {

    public static void main(String[] args) {
        LocalDate displayTodaysDate = LocalDate.now();
        System.out.println("Current date : " + displayTodaysDate);
    }
}
