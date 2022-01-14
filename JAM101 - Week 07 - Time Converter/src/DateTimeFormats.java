import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormats {
    public static void main(String [] args) throws Exception {
        convertToTime("3:30 PM");
    }

    public static void convertToTime( String pTime) throws ParseException {
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm a", Locale.ENGLISH);
        Date date = parseFormat.parse(pTime);
        System.out.println("INPUT: "+ pTime);
        System.out.println("OUTPUT: " +displayFormat.format(date));
    }
}


