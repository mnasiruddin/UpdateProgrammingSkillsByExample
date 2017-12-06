package learnbyexample;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Java8TimeZone {

    private static final String DATE_FORMAT = "yyyy-MM-dd hh:mm:ss a";
    public static void main(String[] args) {
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
