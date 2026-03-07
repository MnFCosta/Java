package conversao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    static void main() {
        LocalDate date01 = LocalDate.parse("2022-07-20");
        LocalDateTime date02 = LocalDateTime.parse("2022-07-20T01:30:36");
        Instant date03 = Instant.parse("2022-07-20T01:30:36Z");

        LocalDate r1 = LocalDate.ofInstant(date03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(date03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(date03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(date03, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println("D01 day = " + date01.getDayOfMonth());
        System.out.println("D01 month = " + date01.getMonthValue());
        System.out.println("D01 year = " + date01.getYear());

        System.out.println("D02 hour = " + date02.getHour());
        System.out.println("D02 minute = " + date02.getMinute());
        System.out.println("D02 second = " + date02.getSecond());


    }
}
