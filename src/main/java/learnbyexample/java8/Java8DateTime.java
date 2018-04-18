package learnbyexample.java8;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Java8DateTime {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    private static final SimpleDateFormat simpleDateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    public static void main(String[] args) throws Exception {
        String date = "20180215";
        LocalDateTime dt = LocalDateTime.now();
        Date sqlDate = new Date(simpleDateFormat.parse(date).getTime());
        System.out.println(date);
        System.out.println(dt);

        System.out.println(Timestamp.valueOf(dt));
        System.out.println(sqlDate.toLocalDate());

        System.out.println(Timestamp.valueOf(sqlDate.toLocalDate().atStartOfDay()));

        Object ssaas = -1;
        long dff = (Integer) ssaas;
        System.out.println(dff);

    }
}
