package org.codexdei.datatime.examples;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);
        System.out.println("Hour = " + now.getHour());
        System.out.println("Minute = " + now.getMinute());
        System.out.println("Second = " + now.getSecond());
        System.out.println("Nano = " + now.getNano());

        LocalTime sevenThirty = LocalTime.of(19,30);
        sevenThirty = LocalTime.parse("19:30:00.239721500");
        System.out.println("sevenThirty = " + sevenThirty);

        //Aumentar un periodo de tiempo
        sevenThirty = LocalTime.parse("19:30:00.239721500").plus(45, ChronoUnit.MINUTES);
        System.out.println("sevenThirty plus = " + sevenThirty);

        //Disminuir un periodo de tiempo
        sevenThirty = LocalTime.parse("19:30:00.239721500").minus(45, ChronoUnit.MINUTES);
        System.out.println("sevenThirty minus = " + sevenThirty);

        boolean isSevenThirty = LocalTime.parse("07:20:15").isBefore(LocalTime.now());
        System.out.println("isSevenThirty = " + isSevenThirty);

        isSevenThirty = LocalTime.parse("07:20:15").isAfter(LocalTime.now());
        System.out.println("isSevenThirty = " + isSevenThirty);

        //Dar formato a la hora
        //Formato 12 horas
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm a");
        String nowFormatter = now.format(df);
        System.out.println("nowFormatter 12 hours = " + nowFormatter);
        //Formato 24 horas
        df = DateTimeFormatter.ofPattern("HH:mm a");
        nowFormatter = now.format(df);
        System.out.println("nowFormatter 24 hours = " + nowFormatter);
        
        //otra forma
        nowFormatter = df.format(now);
        System.out.println("nowFormatter other = " + nowFormatter);
        
        LocalTime max = LocalTime.MAX;
        System.out.println("max = " + max);
        LocalTime min = LocalTime.MIN;
        System.out.println("min = " + min);
    }
}
