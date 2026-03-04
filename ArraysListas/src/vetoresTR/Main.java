package vetoresTR;

import vetoresTR.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de produtos:");
        int n = sc.nextInt();
        Produto[] arrProd = new Produto[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Nome do produto %d:%n", i + 1);
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Preço do produto: ");
            double preco = sc.nextDouble();
            arrProd[i] = new Produto(nome,preco);
        }

        for (int i = 0; i < n; i++) {
            sum += arrProd[i].getPreco();
        }

        System.out.printf("Preço médio: %.2f", sum/n);

        sc.close();
    }
}
