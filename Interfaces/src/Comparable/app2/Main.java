package Comparable.app2;

import Comparable.model.entitites.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main() {
        List<Person> list = new ArrayList<>();
        String path = "c:\\temp\\listanomesfunc.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String name = line.split(",")[0];
                Double salary = Double.parseDouble(line.split(",")[1]);
                list.add(new Person(name, salary));

                line = br.readLine();
            }

            Collections.sort(list);

            for (Person s : list) {
                System.out.printf("%s, %.2f%n", s.getName(), s.getSalary());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
