package learnbyexample.java8;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Range;
import com.google.common.collect.Table;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Java8DateTime {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    private static final SimpleDateFormat simpleDateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    private static final LocalDateTime before = LocalDateTime.now();
    private static final LocalDateTime after = LocalDateTime.now().plusDays(5);
    private static final LocalDateTime search = LocalDateTime.now().plusDays(1);

    private static Table<String, Range<Double>, Double> costPerRange = HashBasedTable.create();

    public static void main(String[] args) throws Exception {

        System.out.println("before.getDayOfYear()" + before.getDayOfYear());
        System.out.println("after.getDayOfYear()" + after.getDayOfYear());
        System.out.println("search.getDayOfYear()" + search.getDayOfYear());

        long ttl;
        String ttlCont = "30";
        Object ttlval = "-5";
        String sinBinTtl = ttlval.toString();
        try {
            ttl = Integer.parseInt(sinBinTtl);
        } catch (NumberFormatException ex) {
            System.out.println("error");
            ttl = Integer.parseInt(ttlCont);
        }

        long ttl1 = TimeUnit.MINUTES.toSeconds(ttl);
        Math.signum(ttl);
        System.out.println("ttl1" + ttl1);
        boolean isPositive = Math.signum(ttl) == 1.0f;
        System.out.println("Math.signum(ttl)" + Math.signum(ttl));
        System.out.println("isPositive" + isPositive);


        String date = "20180215";
        LocalDateTime dt = LocalDateTime.now();

        Date sqlDate = new Date(simpleDateFormat.parse(date).getTime());
        System.out.println(date);
        System.out.println(dt);

        System.out.println(Timestamp.valueOf(dt));
        System.out.println(Timestamp.valueOf(sqlDate.toLocalDate().atStartOfDay()));

        Object ssaas = -1;
        long dff = (Integer) ssaas;
        System.out.println(dff);

        System.out.println("sqlDate" + sqlDate.toLocalDate());
        System.out.println("nasir" + LocalDateTime.now());
    }
}
