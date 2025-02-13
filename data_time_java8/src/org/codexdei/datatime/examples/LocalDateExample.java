package org.codexdei.datatime.examples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateExample {

    public static void main(String[] args) {

        //proporciona la fecha actual
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date:" + currentDate);
        System.out.println("Day:" + currentDate.getDayOfMonth());

        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek.getDisplayName(TextStyle.FULL,new Locale("Es","es")));

        Month month = currentDate.getMonth();
        System.out.println("Month: " + month);
        System.out.println("Month: " + month.getValue());
        //muestra el mes en español, se puede cambiar a otros idiomas
        System.out.println("Month: " + month.getDisplayName(TextStyle.FULL,new Locale("Es","es")));

        System.out.println("Day year:" + currentDate.getDayOfYear());
        System.out.println("Year:" + currentDate.getYear());
        System.out.println("Era:" + currentDate.getEra());

        //asigno una fecha
        currentDate = LocalDate.of(2015,12,02);
        System.out.println("Current Date:" + currentDate);

        //asignando el mes, pero al imprimir queda en formato numero
        currentDate = LocalDate.of(2025, Month.SEPTEMBER,07);
        System.out.println("Current Date mont:" + currentDate);

        //usar una cadena de texto como fecha, debe ser formato año,mes,dia
        currentDate = LocalDate.parse("2015-05-04");
        System.out.println("Format Date:" + currentDate);

        //Agregar un dia a la fecha actual
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("tomorrow = " + tomorrow);

        //Mes(es) anterior mismo dia
        LocalDate previousMonthSameDay = LocalDate.now().minusMonths(1);
        //otra forma
        previousMonthSameDay = LocalDate.now().minus(2, ChronoUnit.MONTHS);
        System.out.println("previous Month Same Day = " + previousMonthSameDay);

        //obtener el dia de la semana de cualquier fecha
        DayOfWeek day = LocalDate.parse("1689-09-12").getDayOfWeek();
        System.out.println("day confession baptist = " + day);
        
        //saber si un año es bisciesto
        boolean leapYear = LocalDate.parse("2023-12-20").isLeapYear();
        System.out.println("leapYear = " + leapYear);
        //sabes si una fecha es antes que otra fecha
        boolean isBeforeDate = LocalDate.parse("2025-02-14").isBefore(LocalDate.parse("2025-02-15"));
        System.out.println("isbeforeDate = " + isBeforeDate);
        //sabes si una fecha es despues que otra fecha
        boolean isAfterDate = LocalDate.of(2025,12,02).isAfter(LocalDate.now());
        System.out.println("isAfterDate = " + isAfterDate);
        //saber si una fecha es antes que otra fecha sumando dias, tambien puede
        isAfterDate = LocalDate.now().isAfter(LocalDate.now().plusDays(2));
        System.out.println("isAfterDate = " + isAfterDate);
    }
}
