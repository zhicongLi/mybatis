import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeTest {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String s = "2022-10-03";
        Date date1 = simpleDateFormat.parse(s);
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.add(Calendar.MONTH, + 1);
        System.out.println(simpleDateFormat.format(c.getTime()));
    }
}
