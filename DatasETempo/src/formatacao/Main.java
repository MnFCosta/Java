package formatacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {
        LocalDate date01 = LocalDate.parse("2022-07-20");
        LocalDateTime date02 = LocalDateTime.parse("2022-07-20T01:30:36");
        Instant date03 = Instant.parse("2022-07-20T01:30:36Z");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter formatter4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter formatter5 = DateTimeFormatter.ISO_INSTANT;

        //Ambos os métodos funcionam
        System.out.printf("D01 = %s%n", formatter.format(date01));
        System.out.printf("D01 = %s%n", date01.format(DateTimeFormatter.ofPattern("dd/yyyy/MM")));

        //Formatação para DateTime
        System.out.printf("D02 = %s%n", date02.format(formatter2));
        System.out.printf("D02 = %s%n", formatter4.format(date02));

        //Formatação para Instant
        System.out.printf("D03 = %s%n", formatter3.format(date03));
        System.out.printf("D03 = %s%n", formatter5.format(date03));
        System.out.printf("D03 = %s%n", date03); //Função toString da classe usa formato ISO






    }
}
