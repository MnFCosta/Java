package EX1;

import EX1.entities.Employee;
import EX1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.printf("\nEmployee #%d data:%n", i+1);

            System.out.print("Outsourced (y/n)?: ");
            String yn = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double vph = sc.nextDouble();
            sc.nextLine();

            if (yn.equals("y")){
                System.out.print("Additional charge: ");
                Double addC = sc.nextDouble();
                sc.nextLine();

                employees.add(new OutsourcedEmployee(name, hours, vph, addC));

            } else if (yn.equals("n")){
                employees.add(new Employee(name, hours, vph));
            }
        }

        System.out.println("\nPAYMENTS: ");
        for (Employee employee: employees){
            System.out.printf("%s - $ %.2f%n", employee.getName(), employee.payment());
        }

        sc.close();
    }
}
