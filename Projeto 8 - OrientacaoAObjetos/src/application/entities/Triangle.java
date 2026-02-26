package application.entities;

import java.util.Scanner;

public class Triangle {
    public double a;
    public double b;
    public double c;
    private double p = 0;
    public double area = 0;

    public void calcularArea(){
        p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void preencherTriangulo(Scanner sc){
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
    }
}



