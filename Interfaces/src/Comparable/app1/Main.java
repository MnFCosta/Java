package Comparable.app1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main() {
        List<String> list = new ArrayList<>();
        String path = "c:\\temp\\listanomes.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                list.add(line);
                line = br.readLine();
            }

            Collections.sort(list);

            for (String s : list) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
