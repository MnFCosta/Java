package Heranca;

import Heranca.entities.Account;
import Heranca.entities.BusinessAccount;
import Heranca.entities.SavingsAccount;

public class UpcastingDowncasting {
    static void main() {
        Account acc = new Account(1001, "Manoel", 0.0);
        BusinessAccount bAcc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        Account acc1 = bAcc;
        Account acc2 = new BusinessAccount(1003, "Jorge", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Lucas", 0.0, 0.01);


        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //Código compila, porém causa uma excessão na execução, pois o compilador não consegue detectar que acc3 é na verdade um Savings Account
        //um tipo que não pode ser Casted como BusinessAccount
        //BusinessAccount acc5 = (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Empréstimo realizado");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
