
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        // your code here
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        // your code here
        DateTimeFormatter formatter = new java.time.format.DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("EEEE dd MMMM yyyy")
                .toFormatter(Locale.ENGLISH);
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        } 
        String cleanedString = stringDate.replaceAll("[^0-9 ]", "").trim();
        String[] numbers = cleanedString.split("\\s+");

        int hour = Integer.parseInt(numbers[0]);
        int minute = Integer.parseInt(numbers[1]);
        int second = Integer.parseInt(numbers[2]);

        if (stringDate.contains("evening") && hour < 12) {
            hour += 12;
        }
        return LocalTime.of(hour, minute, second);
    }

}
