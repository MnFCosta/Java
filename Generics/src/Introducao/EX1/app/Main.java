package Introducao.EX1.app;

import Introducao.EX1.model.services.PrintService;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService();

        System.out.print("How many values?: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            ps.addValue(sc.nextInt());
        }

        ps.print();
        System.out.println("First: " + ps.first());


        sc.close();
    }
}
