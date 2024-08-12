package ParseDate;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    // Parses a date in ISO format (e.g., 2022-04-25T20:51:28.709039322)
    public static LocalDateTime parseIsoFormat(String stringDate) {
        return LocalDateTime.parse(stringDate);
    }

    // Parses a date in full text format (e.g., lundi 25 avril 2022)
    public static LocalDate parseFullTextFormat(String stringDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRENCH);
        return LocalDate.parse(stringDate, formatter);
    }

    // Parses a time in text format (e.g., 09 heures du soir, 07 minutes et 23 secondes)
    public static LocalTime parseTimeFormat(String stringDate) {
        // Replace text for evening ("du soir") with "PM" to facilitate parsing
        stringDate = stringDate.replace("heures du soir", "PM")
                .replace("heures", "hours")
                .replace("minutes", "minutes")
                .replace("et", "")
                .replace("secondes", "seconds")
                .replace("du matin", "AM");  // Handle AM as well if necessary

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh a, mm minutes ss seconds", Locale.ENGLISH);
        return LocalTime.parse(stringDate, formatter);
    }
}
