package Construtores;

import Construtores.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.printf(product.toString());

        System.out.println("Enter the number of products to be added in stock");
        product.addProduts(sc.nextInt());

        System.out.printf(product.toString());

        System.out.println("Enter the number of products to be removed in stock");
        product.removeProducts(sc.nextInt());

        product.setName("Batata");
        System.out.println(product.getPrice());

        System.out.printf(product.toString());

        sc.close();

    }
}
