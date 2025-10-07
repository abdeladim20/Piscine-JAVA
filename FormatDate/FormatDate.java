
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        // your code here
        if (dateTime == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
            "'Le 'dd MMMM' de l''an 'yyyy' à 'HH'h'mm'm et 'ss's'",
            Locale.FRENCH
        );
        return dateTime.format(formatter);
    }

    public static String formatSimple(LocalDate date) {
        // your code here
        if (date == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALIAN);
        return date.format(formatter);
    }

    public static String formatIso(LocalTime time) {
        // your code here
        if (time == null) {
            return null;
        }
        return time.toString();
    }

}