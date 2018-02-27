package learnbyexample.java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Java8TimeZone {

    private static final String DATE_FORMAT = "yyyy-MM-dd hh:mm:ss a";

    public static void main(String[] args) throws Exception{

        long startTime = System.currentTimeMillis();

        long date = new Date().getTime();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("date " + (int) (System.currentTimeMillis() / (60L * 1000L)));
        System.out.println("localDateTime " + System.currentTimeMillis());
        System.out.println("minute " + localDateTime.get(ChronoField.MINUTE_OF_DAY));
        Thread.sleep(10000);

        localDateTime();

        long endTime = System.currentTimeMillis();
        String timeTaken = "Time Taken for the task " + (endTime - startTime) / 1000;
        String seconds = "Time Taken for the task " + TimeUnit.MILLISECONDS.toSeconds(endTime - startTime);
        String minutes = "Time Taken for the task " + TimeUnit.SECONDS.toMinutes(TimeUnit.MILLISECONDS.toSeconds(endTime - startTime));
        System.out.println(timeTaken);
        System.out.println(seconds);
        System.out.println(minutes);
    }

    public static void localDateTime() {
        LocalDateTime ldt = LocalDateTime.now();

        ZoneId dublinZoneId = ZoneId.of("Europe/Dublin");
        ZoneId australiaZoneId = ZoneId.of("Australia/Sydney");
        australiaZoneId = ZoneId.of("Europe/Tallinn");
        System.out.println("TimeZone dublin : " + dublinZoneId);
        System.out.println("TimeZone australia : " + australiaZoneId);

        ZonedDateTime dublinZonedDateTime = ldt.atZone(dublinZoneId);
        System.out.println("Date (dublin) : " + dublinZonedDateTime);

        System.out.println("Date (Australia) : " + dublinZonedDateTime.withZoneSameInstant(australiaZoneId));

        DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
        System.out.println("\n---DateTimeFormatter---");
        System.out.println("Date (Dublin) : " + ldt);
        System.out.println("Date (Australia) : " + dublinZonedDateTime.withZoneSameInstant(australiaZoneId).toLocalDateTime());
    }
}
