package EX1.app;

import EX1.model.entities.Contract;
import EX1.model.entities.Installment;
import EX1.model.services.ContractService;
import EX1.model.services.PaypalPaymentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");

        System.out.print("Número: ");
        int contractNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(sc.nextLine(), format);

        System.out.print("Valor do contrato: ");
        double totalContractValue = sc.nextDouble();

        Contract contract = new Contract(contractNumber, contractDate, totalContractValue);

        System.out.print("Entre com o número de parcelas: ");
        int installments = sc.nextInt();

        ContractService csv = new ContractService(new PaypalPaymentService());

        csv.addInstallment(contract, installments);

        System.out.println("\nParcelas: ");

        for (Installment installment : contract.getInstallments()){
            System.out.printf("%s - %.2f%n", installment.getPaymentDate().format(format), installment.getValue());
        }
    }
}
