package application;

import application.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class comOrientacao {

    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle triangleX = new Triangle();
        Triangle triangleY = new Triangle();

        System.out.println("Enter the measures of the triangle X");
        triangleX.preencherTriangulo(sc);

        System.out.println("Enter the measures of the triangle Y");
        triangleY.preencherTriangulo(sc);

        compararArea(triangleX, triangleY);

        sc.close();
    }

    public static void compararArea(Triangle trianguloX, Triangle trianguloY) {
        trianguloX.calcularArea();
        trianguloY.calcularArea();

        System.out.println("Triangle X area: " + trianguloX.area);
        System.out.println("Triangle Y area: " + trianguloY.area);

        if (trianguloX.area > trianguloY.area) {
            System.out.println("Larger Area: X");
        } else {
            System.out.println("Larger Area: Y");
        }

    }
}
