package Composicao.EX1;

import Composicao.EX1.entities.Department;
import Composicao.EX1.entities.HourContract;
import Composicao.EX1.entities.Worker;
import Composicao.EX1.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter department's name: ");
        String department = sc.nextLine();

        Department dep = new Department(department);

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
        System.out.print("Base salary: ");
        Double salary = sc.nextDouble();

        Worker worker = new Worker(name,level,salary, dep);

        System.out.println("How many contracts to this worker?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter contract #%d data:%n", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            String date = sc.nextLine();
            System.out.print("Value per hour: ");
            Double vph = sc.nextDouble();
            System.out.print("Duration (hours): ");
            Integer duration = sc.nextInt();

            worker.addContract(new HourContract(LocalDate.parse(date, formatter), vph, duration));
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");

        sc.nextLine();
        String tp = sc.nextLine();

        System.out.printf("Name: %s%n", worker.getName());
        System.out.printf("Department: %s%n", worker.getDepartment());
        System.out.printf("Income data for %s: %.2f", tp, worker.income(Integer.parseInt(tp.split("/")[0]), Integer.parseInt(tp.split("/")[1])));

    }
}
