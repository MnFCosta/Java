package EX1;

import EX1.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.println("Write file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        boolean success = (new File(path.getParent() + "\\out")).mkdir();

        System.out.println(success);

        String out = String.format("%s\\out\\summary.csv", path.getParent());

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                list.add(new Product(line.split(",")[0], Double.parseDouble(line.split(",")[1]), Integer.parseInt(line.split(",")[2])));
                line = br.readLine();
            }

        }catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(out))){
            for (Product product : list){
                bw.write(String.format("%s, %.2f", product.getName(), product.totalValue()));
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
