package EX2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.println("Quantos contribuíntes?");
        int n = sc.nextInt();
        sc.nextLine();



        for (int i = 0; i < n; i++) {

            System.out.printf("Dados da pessoa #%d%n", i + 1);
            System.out.println("Pessoa física ou jurídica (f/j) ?");
            String r = sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda Anual: ");
            double rendaA = sc.nextDouble();

            if (r.equals("f")){
                System.out.print("Gastos com saude: ");
                double gcs = sc.nextDouble();
                sc.nextLine();

                list.add(new PessoaFisica(nome, rendaA, gcs));
            }else if(r.equals("j")){
                System.out.print("Número de funcionários: ");
                int numFunc = sc.nextInt();
                sc.nextLine();

                list.add(new PessoaJuridica(nome, rendaA, numFunc));
            }
        }

        double soma = 0;

        System.out.println("Impostos pagos: ");
        for (Pessoa pessoa : list){
            System.out.printf("Valor de imposto pago por %s: $ %.2f%n", pessoa.getNome(), pessoa.calculoImposto());
            soma += pessoa.calculoImposto();
        }

        System.out.printf("\nTotal arrecadado em impostos: $ %.2f", soma);

    }
}
