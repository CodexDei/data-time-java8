package org.codexdei.datatime.examples;

import java.time.LocalDate;

public class ChangeDate {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(1989,9,21);

        //cambiar uno o mas dato de la fecha
        //IMPORTANTE, tiene que guardarse el dato si se quiere cambiar
        LocalDate date2 = date1.withYear(2023);

        System.out.println("date2 = " + date2);
    }
}
