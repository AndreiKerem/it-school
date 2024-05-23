package homework;

import java.time.LocalDate;
import java.time.Month;

public class DateDecomposition {

    public static void displayDateComponents(String date) {

        LocalDate currentDate = LocalDate.parse(date);

        int day = currentDate.getDayOfMonth();
        Month month = currentDate.getMonth();
        int year = currentDate.getYear();

        System.out.println("Day : " + day);
        System.out.println("Month : " + month);
        System.out.println("Year : " + year);
    }

    public static void main(String[] args) {
        String date = "2024-03-25";
        displayDateComponents(date);
    }
}
