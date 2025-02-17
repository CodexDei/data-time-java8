package org.codexdei.datatime.examples;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExample {

    public static void main(String[] args) {

        LocalDateTime periodTime1 = LocalDateTime.now();
        LocalDateTime periodTime2 = LocalDateTime.now().plusDays(1).plusWeeks(2).plusHours(2).plusMinutes(25).plusSeconds(90);

        Duration duration = Duration.between(periodTime1,periodTime2);
        System.out.println("duration = " + duration);
        System.out.println("Days = " + duration.toDays());
        System.out.println("Minutes = " + duration.toMinutes());
    }
}
