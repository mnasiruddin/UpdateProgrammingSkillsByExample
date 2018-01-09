package learnbyexample.java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;

public class Java8TimeZone {

    private static final String DATE_FORMAT = "yyyy-MM-dd hh:mm:ss a";

    public static void main(String[] args) {

        long date = new Date().getTime();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("date " + (int) (System.currentTimeMillis() / (60L * 1000L)));
        System.out.println("localDateTime " + System.currentTimeMillis());
        System.out.println("minute " + localDateTime.get(ChronoField.MINUTE_OF_DAY));

        //localDateTime();
    }

    public static void localDateTime() {
        LocalDateTime ldt = LocalDateTime.now();

        ZoneId dublinZoneId = ZoneId.of("Europe/Dublin");
        ZoneId australiaZoneId = ZoneId.of("Australia/Sydney");
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
