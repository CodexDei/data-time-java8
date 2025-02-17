package org.codexdei.datatime.examples;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class InstantExample {

    public static void main(String[] args) {

        Instant instant1 = Instant.now();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Instant instant2 = Instant.now();

        Duration duration = Duration.between(instant1,instant2);
        System.out.println("duration = " + duration);

    }
}
