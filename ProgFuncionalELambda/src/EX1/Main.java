package EX1;

import EX1.model.entities.Prod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        String path = "c:\\temp\\products.csv";
        List<Prod> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] split = line.split(",");
                list.add(new Prod(split[0], Double.parseDouble(split[1])));
                line = br.readLine();
            }

            double averagePrice = list.stream()
                    .map(x -> x.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / list.size();

            System.out.printf("Average price: %.2f%n", averagePrice);

            list.stream()
                    .filter(x -> x.getPrice() < averagePrice)
                    .map(Prod::getName)
                    .sorted()
                    .toList()
                    .forEach(System.out::println);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
