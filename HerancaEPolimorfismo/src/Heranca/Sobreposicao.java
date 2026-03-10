package Heranca;

import Heranca.entities.Account;
import Heranca.entities.BusinessAccount;
import Heranca.entities.SavingsAccount;

public class Sobreposicao {
    static void main() {
        Account acc1 = new Account(1001, "Manoel", 1000.0);

        acc1.withdraw(200.0);

        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Alex", 1000.0, 0.01);

        acc2.withdraw(200.0);

        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Jorge  ", 1000.0, 400.0);

        acc3.withdraw(200.0);

        System.out.println(acc3.getBalance());
    }
}
