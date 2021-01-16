import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormats {

            public static void main(String [] args) throws Exception {
                SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
                SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm a", Locale.ENGLISH);
                Date date = parseFormat.parse("10:30 PM");
                System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));
            }
        }


