package org.codexdei.datatime.examples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime nowLocal = LocalDateTime.now();
        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime newYorkZone = ZonedDateTime.now(newYork);
        System.out.println("Departure time from New York = " + newYorkZone);
        ZoneId madrid = ZoneId.of("Europe/Madrid");
        //se coloca plus para que teniendo en cuenta lo que demora el vuelo se genere la hora de llegada
        ZonedDateTime madridZone = newYorkZone.withZoneSameInstant(madrid).plusHours(8);
        System.out.println("Arrival time to Madrid = " + madridZone);
    }
}
