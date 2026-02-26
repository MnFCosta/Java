package application;

import java.util.Locale;
import java.util.Scanner;

public class SemOrientacao {

    static void main() {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double[] triangleX = new double[3];
        double[] triangleY = new double[3];

        System.out.println("Insira as medidas do triangulo X");
        for (int i = 0; i < triangleX.length; i++){
            triangleX[i] = sc.nextDouble();
        }

        System.out.println("Insira as medidas do triangulo Y");
        for (int i = 0; i < triangleY.length; i++){
            triangleY[i] = sc.nextDouble();
        }

        compararArea(triangleX, triangleY);


    }

    public static String compararArea(double[] trianguloX, double[] trianguloY){

        double pX = (trianguloX[0] + trianguloX[1] + trianguloX[2]) / 2;
        double pY = (trianguloY[0] + trianguloY[1] + trianguloY[2]) / 2;

        double areaX = Math.sqrt(pX * (pX - trianguloX[0]) * (pX - trianguloX[1]) * (pX - trianguloX[2]));
        double areaY = Math.sqrt(pY * (pY - trianguloY[0]) * (pY - trianguloY[1]) * (pY - trianguloY[2]));

        System.out.println("Triangle X area: " + areaX);
        System.out.println("Triangle Y area: " + areaY);

        if (areaX > areaY){
            return "Larger Area: X";
        }else {
            return "Larger Area: Y";
        }

    }
}
