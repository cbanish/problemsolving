package hackerrank;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FindCalendarDay {
    public static String findDay(int month, int day, int year) {
        LocalDate localDate=LocalDate.of(year,month,day);
        DayOfWeek dayOfWeek= localDate.getDayOfWeek();
        return dayOfWeek.name();
    }

    public static void main(String[] args) {
       System.out.println("Day of week: "+findDay(5,13,2024));
    }
}
