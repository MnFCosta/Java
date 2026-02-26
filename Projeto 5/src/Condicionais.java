import java.util.Scanner;

public class Condicionais {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();

        if (hora < 12){
            System.out.println("Bom dia");
        }
        else if(hora > 12 && hora < 18){
            System.out.println("Boa Tarde");
        }
        else{
            System.out.println("Boa noite");
        }

        sc.close();

    }

}
