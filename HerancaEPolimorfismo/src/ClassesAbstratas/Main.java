package ClassesAbstratas;

import ClassesAbstratas.entities.Account;
import ClassesAbstratas.entities.BusinessAccount;
import ClassesAbstratas.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Manoel", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Jorge", 1000.0, 400.0));
        list.add(new SavingsAccount(1003, "Alex", 300.0, 0.01));
        list.add(new BusinessAccount(1004, "Maria", 500.0, 500.0));

        double sum = 0.0;

        for (Account acc : list){
            sum += acc.getBalance();
        }

        System.out.println(sum);

        for (Account acc : list){
            acc.deposit(10.0);
        }

        for (Account acc : list){
            System.out.println(acc.getBalance());
        }
    }
}
