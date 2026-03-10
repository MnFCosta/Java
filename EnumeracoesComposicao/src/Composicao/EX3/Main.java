package Composicao.EX3;

import Composicao.EX3.entities.Client;
import Composicao.EX3.entities.Order;
import Composicao.EX3.entities.OrderItem;
import Composicao.EX3.entities.Product;
import Composicao.EX3.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date: ");
        String birthDate = sc.nextLine();

        Client client = new Client(name, email, LocalDate.parse(birthDate, format));

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        System.out.println("How many items to this order?");
        int n = sc.nextInt();
        Order order = new Order(status, client);
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter item #%d data: %n", i + 1);
            System.out.print("Product name: ");
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            Double price = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer qtd = sc.nextInt();
            sc.nextLine();

            Product product = new Product(pName, price);

            order.addItem(new OrderItem(product, qtd));
        }

        order.orderSummary();

    }
}
