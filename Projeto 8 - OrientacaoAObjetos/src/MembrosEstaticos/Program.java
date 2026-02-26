package MembrosEstaticos;

import MembrosEstaticos.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double radius = sc.nextDouble();

        System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f%n",Calculator.volume(radius));
        System.out.printf("PI: %.2f", Calculator.PI);

    }

}
