import java.util.Locale;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String x = sc.next();
        System.out.printf("Você digitou %s\n\n", x);

        System.out.println("Digite dois números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        System.out.printf("A soma dos números %d e %d é: %d", num1, num2, soma);

        double num3 = sc.nextDouble();
        System.out.printf("\n\nNúmero decimal %.2f", num3);

        sc.close();
    }
}
