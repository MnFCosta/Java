package comInterfaces.app;

import comInterfaces.model.entitites.CarRental;
import comInterfaces.model.entitites.Vehicle;
import comInterfaces.model.services.BrazilTaxService;
import comInterfaces.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do aluguel: ");

        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), format);
        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), format);

        CarRental crt = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rsv = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rsv.processInvoice(crt);

        System.out.println("FATURA: ");
        System.out.println("Pagamento básico: " + crt.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + crt.getInvoice().getTax());
        System.out.println("Pagamento Total: " + crt.getInvoice().totalPayment());

        sc.close();
    }
}
