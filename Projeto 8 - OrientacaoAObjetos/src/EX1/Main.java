package EX1;

import EX1.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int control = 0;

        System.out.println("No account detected, please make an account");
        System.out.print("Insert holder name:");
        String holder = sc.nextLine();
        System.out.println("Insert account ID:");
        int id = sc.nextInt();
        Conta account = new Conta(holder, id);

        System.out.println("Would you like to make an initial deposit? (1 - Yes / 0 - No)");

        int option = sc.nextInt();
        if (option == 1) {
            System.out.println("Insert deposit amount");
            account.deposito(sc.nextDouble());
        }

        while (control == 0) {
            System.out.println("WELCOME TO THE BANK SELECT ONE OF THE OPTIONS UNDER");
            System.out.println("1 - Make deposit /n 2 - Make withdrawal 3 - Update holder name 4 - Exit");
            int scontrol = sc.nextInt();
            sc.nextLine();

            switch (scontrol) {
                case 1:
                    System.out.println("Insert deposit amount");
                    account.deposito(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Insert withdrawal amount (R$5.00 will be deduced from account balance upon withdrawal)");
                    account.saque(sc.nextDouble());
                    break;
                case 3:
                    account.atualizarNomeTitular(sc);
                    break;
                case 4:
                    System.out.println("Thank You!");
                    control = 1;
                    break;
                default:
                    System.out.println("Valor inválido selecione uma número válido (1 a 4)");
            }
        }

        sc.close();

    }
}
