package EXList1;

import EXList1.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarioList = new ArrayList<>();

        System.out.println("Quantos funcionários?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Qual é o nome do funcionário?");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Qual é o salário do funcionário?");
            Double salario = sc.nextDouble();
            funcionarioList.add(new Funcionario(funcionarioList.size() + 1, nome,salario));
        }

        System.out.print("Entre a ID do funcionário que terá um aumento: ");
        int id = sc.nextInt();
        List<Funcionario> findId = funcionarioList.stream().filter(funcionario -> funcionario.getId() == id).toList();
        if (findId.isEmpty()){
            System.out.println("ID não encontrada!");
            return;
        }
        System.out.print("Entre a porcentagem do aumento: ");
        int percent = sc.nextInt();

        Funcionario funcionarioAumento = funcionarioList.stream().filter(funcionario -> funcionario.getId() == id).findFirst().orElse(null);
        funcionarioAumento.aumentoSalario(percent);

        System.out.println("\nLista de funcionários:");

        for(Funcionario funcionario: funcionarioList){
            System.out.println(funcionario.toString());
        }
        sc.close();
    }
}
