import java.util.Scanner;

public class For {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            soma += sc.nextInt();
        }

        System.out.printf("Soma: %d", soma);

        sc.close();

    }

}
