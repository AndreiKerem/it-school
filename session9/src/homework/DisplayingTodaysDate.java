package homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DisplayingTodaysDate {

    public static void displayTodayDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Today's date: " + formattedDate);
    }

    public static void main(String[] args) {
        displayTodayDate();
    }
}
