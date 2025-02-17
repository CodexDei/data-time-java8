package org.codexdei.datatime.examples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        LocalDateTime nowLocal = LocalDateTime.parse("2027/09/21 12:45", formatter);
        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime newYorkZone = ZonedDateTime.of(nowLocal, newYork);

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime madridZone = newYorkZone.withZoneSameInstant(madrid).plusHours(8);

        // Aplicando formato al imprimir
        System.out.println("Departure time from New York = " + newYorkZone.format(formatter));
        System.out.println("Arrival time to Madrid = " + madridZone.format(formatter));

        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
