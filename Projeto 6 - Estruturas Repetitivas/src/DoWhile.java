import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int control = 1;

        do{
            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double F = ((celsius * 9)/5) + 32;
            System.out.printf("Equivalente em Fahrenheit = %.1f\n", F);
            System.out.println("Deseja Repetir? (1 = Sim, 0 = Não)");

            control = sc.nextInt();

        }while(control == 1);

        sc.close();

    }
}
