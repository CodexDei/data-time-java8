package org.codexdei.datatime.exercises;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculate {

    public static void main(String[] args) {

        //Para esta tarea se pide ingresar una fecha de nacimiento en formato string,
        // convertirla a una fecha del tipo LocalDate y calcular la edad de la persona
        // de acuerdo a la fecha actual.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter to date of birth with the format 2025-09-21");
        System.out.print("The date is:");
        String age = sc.nextLine();

        LocalDate nowDate = LocalDate.now();
        LocalDate ageDate = LocalDate.parse(age);

        Period period = Period.between(ageDate,nowDate);

        System.out.printf("your are: %d day %d months and %d years", period.getDays(),period.getMonths(),period.getYears());
    }
}
