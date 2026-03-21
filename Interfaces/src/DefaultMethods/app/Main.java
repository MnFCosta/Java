package DefaultMethods.app;


import DefaultMethods.app.model.services.BrazilInterestService;
import DefaultMethods.app.model.services.InterestService;
import DefaultMethods.app.model.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService bis = new BrazilInterestService(2);
        InterestService uis = new UsaInterestService(1);

        System.out.printf("Payment after 3 months (Brazil): %.2f %n", bis.payment(amount, months));
        System.out.printf("Payment after 3 months (USA): %.2f %n", uis.payment(amount, months));

        sc.close();
    }
}
