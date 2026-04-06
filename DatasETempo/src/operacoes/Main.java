package operacoes;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    static void main() {
        LocalDate date01 = LocalDate.parse("2026-03-06");
        LocalDateTime date02 = LocalDateTime.parse("2026-03-06T21:43:26");
        Instant date03 = Instant.parse("2026-03-06T21:43:26Z");


        //Adição e Subtração
        LocalDate pastWeekLocalDate = date01.minusDays(7);
        LocalDate nextWeekLocalDate = date01.plusDays(7);

        LocalDateTime pastWeekLocalDateTime = date02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = date02.plusWeeks(1);

        Instant pastWeekInstant = date03.minus(7 , ChronoUnit.DAYS);
        Instant nextWeekInstant = date03.plus(7 , ChronoUnit.DAYS);

        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);

        System.out.println(pastWeekLocalDateTime);
        System.out.println(nextWeekLocalDateTime);

        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);

        //Duração

        Duration t1 = Duration.between(pastWeekLocalDateTime, date02);
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), date01.atStartOfDay());
        Duration t3 = Duration.between(pastWeekInstant, date03);
        Duration t4 = Duration.between(date03, pastWeekInstant);

        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());
        System.out.println(t4.toDays());
    }
}
