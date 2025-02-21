package org.codexdei.datatime.examples;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        LocalDateTime date1 = LocalDateTime.of(2025, Month.DECEMBER,31,23,59,59);
        System.out.println("date1.of = " + date1);
        
        date1 = LocalDateTime.parse("2025-09-21T23:59:59");
        System.out.println("date1.parse = " + date1);
        System.out.println("date1 day week = " + date1.getDayOfWeek());
        System.out.println("date1 day week = " + date1.getMonth().getDisplayName(TextStyle.FULL,new Locale("Es","es")).toUpperCase());
        System.out.println("date1 day year   = " + date1.getDayOfYear());

        LocalDateTime date2 = date1.plus(7, ChronoUnit.WEEKS);
        System.out.println("date2 = " + date2);
        LocalDateTime date3 = date1.plusDays(1).plusWeeks(2).plusMonths(3);
        System.out.println("date3 = " + date3);

        String format = date1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("format = " + format);
        //Aplicando formato: domingo 2025/septiembre/21 11:59:59 p.m
        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE     yyyy/MMMM/dd hh:mm:ss a");
        String format2 = date1.format(df);
        System.out.println("format2 = " + format2);
        //Otra forma de aplicar el formato
        String format3 = df.format(date1);
        System.out.println("format3 = " + format3);



    }
}
