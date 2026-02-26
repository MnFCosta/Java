import java.util.Scanner;

public class While {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int control = sc.nextInt();
        int soma = 0;

        while (control != 0) {
            soma += control;
            control = sc.nextInt();
        }

        System.out.printf("A soma é: %d", soma);
        sc.close();
    }

}
