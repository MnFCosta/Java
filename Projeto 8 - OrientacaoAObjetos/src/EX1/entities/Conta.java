package EX1.entities;

import java.util.Scanner;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private double saldo = 0;

    public Conta (String nomeTitular, int numeroConta){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public Conta (String nomeTitular, int numeroConta, double depositoInicial){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        deposito(depositoInicial);
    }

    public void deposito(double valor){
        this.saldo += valor;
        System.out.println(this);
    }

    public void saque(double valor){
        this.saldo -= valor + 5.00;
        System.out.println(this);
    }

    public void atualizarNomeTitular(Scanner sc){
        System.out.print("Insert new holder name: ");
        this.nomeTitular = sc.nextLine();
        System.out.println(this);

    }

    public String toString(){
        return String.format("Holder: %s%n Account ID: %d%n Current balance: R$%.2f%n ", nomeTitular, numeroConta, saldo);
    }


}
