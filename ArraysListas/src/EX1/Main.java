package EX1;

import EX1.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas?");
        int n = sc.nextInt();

        Pessoa[] arrPessoas = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Qual o nome da pessoa %d?%n", i + 1);
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.printf("Qual a idade de %s?%n", nome);
            int idade = sc.nextInt();
            System.out.printf("Qual a altura de %s?%n", nome);
            double altura = sc.nextDouble();
            arrPessoas[i] = new Pessoa(nome, idade, altura);
        }

        double sumA = 0;
        double sumI = 0;

        for (int i = 0; i < n; i++) {
            sumA += arrPessoas[i].getAltura();

            if (arrPessoas[i].getIdade() < 16){
                sumI += 1;
            }
        }

        double pPessoas = (sumI * 100) / n;

        System.out.printf("Média da altura das pessoas = %.2f%n", sumA / n);
        System.out.printf("Porcentagem de pessoas com menos de 16 anos = %.1f%%%n", pPessoas);

        System.out.println("Pessoas com menos de 16 anos: ");
        for (int i = 0; i < n; i++) {
            if (arrPessoas[i].getIdade() < 16){
                System.out.printf("%s tem %d anos%n", arrPessoas[i].getNome(), arrPessoas[i].getIdade());
            }
        }

        sc.close();
    }
}
