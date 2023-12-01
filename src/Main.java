import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String inputString = "2023-03-01T13:00:00Z";

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);

        int year = offsetDateTime.getYear();
        int month = offsetDateTime.getMonthValue();
        int day = offsetDateTime.getDayOfMonth();

        String dayOfWeek = offsetDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());

        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + dayOfWeek);
    }
}

