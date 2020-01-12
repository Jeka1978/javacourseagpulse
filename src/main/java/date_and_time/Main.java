package date_and_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(2000, 1, 1);
        System.out.println("now = " + now);

        LocalDate yesterday = now.minusDays(1);
        System.out.println(yesterday.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, Locale.FRANCE));
        System.out.println(yesterday.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.JAPAN));
        System.out.println(yesterday.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, Locale.JAPAN));


        LocalDate localDate = now.withYear(2000);
        System.out.println("localDate = " + localDate.getDayOfWeek());


        LocalDate alexander = LocalDate.of(1985, 9, 3);
        LocalDate jeka = LocalDate.of(1978, 10, 3);



        long between = ChronoUnit.YEARS.between(jeka, alexander);
        System.out.println("between = " + between);


//        Duration


    }
}
