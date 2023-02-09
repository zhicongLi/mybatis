package test;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MonthTest {

    public static void main(String[] args) {
        int x = 0;
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        if (day < 30) {
            calendar.add(Calendar.MONTH, 1);
        } else {
            calendar.add(Calendar.MONTH, 2);
        }
        calendar.getTime();
        SimpleDateFormat simpleDateFormats = new SimpleDateFormat("yyyy-MM-dd");
        String date = simpleDateFormats.format(calendar.getTime());
        System.out.println("时间为：" +  date);

        System.out.println(1>2?1:2);
    }
}
