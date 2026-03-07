package instanciamento;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T23:46:09");
        Instant d06 = Instant.parse("2022-07-20T23:46:09Z");
        Instant d07 = Instant.parse("2022-07-20T23:46:09-03:00");

        //Instanciando objetos datetime a partir de datetime em um padrão diferente do ISO 8601
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d08 = LocalDate.parse("20/07/2022", formatter);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println(d01);

        System.out.println(d02);

        System.out.println(d03);

        System.out.println(d04);

        System.out.println(d05);

        System.out.println(d06);

        System.out.println(d07);

        System.out.println(d08);

        System.out.println(d09);

        System.out.println(d10);

        System.out.println(d11);

    }
}
