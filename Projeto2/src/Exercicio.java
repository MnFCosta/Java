import java.util.Locale;

public class Exercicio {

    static void main() {

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double price3 = 52.234567;

        System.out.println("Produts:");
        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);

        System.out.print("Record: ");
        System.out.printf("%d years old, code %d and gender: %s\n\n", age, code, gender);

        System.out.printf("Measure with eight decimal places %.8f\n", price3);
        System.out.printf("Measure with eight decimal places %.3f\n", price3);
        Locale.setDefault(Locale.US);
        System.out.printf("Measure with eight decimal places %.3f", price3);



    }
}
