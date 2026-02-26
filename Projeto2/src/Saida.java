import java.sql.SQLOutput;
import java.util.Locale;

public class Saida {

    static void main() {
        Locale.setDefault(Locale.US);

        //Quebra de linha
        System.out.println("Teste");
        System.out.println("Teste");

        //Sem quebra de linha
        System.out.print("Teste2");
        System.out.print("Teste2");

        //int

        int y = 32;

        System.out.println(y);

        //double

        double x = 2.678454233423;

        System.out.println(x);

        //Print formatado
        System.out.printf("%.4f\n", x);

        //Concatenando

        System.out.println("Teste " + x + " 123");

        System.out.printf("TESTE %.2f\n", x);

        String nome = "Manoel";
        int idade = 23;
        double salario = 3200.0;

        System.out.printf("%s tem %d anos e recebe %.2f", nome, idade, salario);


    }

}
