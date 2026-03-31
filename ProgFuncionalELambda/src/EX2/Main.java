package EX2;

import EX2.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String path = "c:\\temp\\employees.csv";
        List<Employee> list = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                String[] split = line.split(",");
                list.add(new Employee(split[0], split[1], Double.parseDouble(split[2])));
                line = br.readLine();
            }

            System.out.printf("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.printf("Email of people whose salary is more than %.2f:%n", salary);

            list.stream()
                    .filter(x -> x.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted()
                    .toList()
                    .forEach(System.out::println);

            System.out.print("Sum of salary of people whose name starts with 'M': ");

            double mSalary = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x,y) -> x + y);

            System.out.printf("%.2f", mSalary);


        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
