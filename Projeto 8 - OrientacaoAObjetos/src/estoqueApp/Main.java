package estoqueApp;

import estoqueApp.entitites.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.printf(product.toString());

        System.out.println("Enter the number of products to be added in stock");
        product.addProduts(sc.nextInt());

        System.out.printf(product.toString());

        System.out.println("Enter the number of products to be removed in stock");
        product.removeProducts(sc.nextInt());

        System.out.printf(product.toString());

        sc.close();

    }
}
