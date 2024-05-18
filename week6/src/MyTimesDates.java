import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class MyTimesDates {

    public static void main(String[] args) {
        // keep it simple let's display the current date

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        // I don't like that I would like to see the month day of the week and the year.

        Month currentMonth = LocalDate.now().getMonth();
        System.out.println(currentMonth);

        DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
        System.out.println(currentDay);

        // the year would half to be an integer

        int currentYear = LocalDate.now().getYear();
        System.out.println(currentYear);

        // we would like to know the number of the day - if today is the eigth of the month, display 8.

        int currentdaynumber = LocalDate.now().getDayOfMonth();
        System.out.println(currentdaynumber);

        System.out.println("Today is "+currentDay+ ", "+currentMonth+ " " +currentdaynumber+ "th, " +currentYear+ "!!!" );


    }
}
