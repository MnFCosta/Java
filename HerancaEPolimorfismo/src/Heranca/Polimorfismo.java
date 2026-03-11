package Heranca;

import Heranca.entities.Account;
import Heranca.entities.SavingsAccount;

public class Polimorfismo {
    static void main() {
        Account x = new Account(1001, "Manoel", 1000.0);
        Account y = new SavingsAccount(1002, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
