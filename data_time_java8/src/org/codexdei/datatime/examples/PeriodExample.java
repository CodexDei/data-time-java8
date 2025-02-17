package org.codexdei.datatime.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodExample {

    public static void main(String[] args) {

        LocalDate jBirthday = LocalDate.of(1989,9,21);
        LocalDate mBirthday = LocalDate.of(1998,1,24);
        LocalDate sBirthday = LocalDate.of(2023,12,20);

        Period period1 = Period.between(jBirthday,mBirthday);
        Period period2 = Period.between(sBirthday,mBirthday);
        Period period3 = Period.between(sBirthday,jBirthday);

        System.out.printf("period between George and Marye is: %d años %d meses %d dias  ",
                period1.getYears(),period1.getMonths(),period1.getDays());
        System.out.println();
        System.out.println("period S and M = " + period2);
        System.out.println("period S and J = " + period3);
    }
}
