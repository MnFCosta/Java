package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas?");
        int num = sc.nextInt();
        double[] arrAlturas = new double[num];
        double sum = 0;

        for (int i = 0; i < num; i++){
            System.out.printf("Adicione a altura da pessoa %d%n", i + 1);
            arrAlturas[i] = sc.nextDouble();
        }

        for (int i = 0; i < num; i++){
            sum += arrAlturas[i];
        }

        System.out.printf("Average height: %.2f", sum/num);



    }
}
