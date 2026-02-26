import java.util.Scanner;

public class OperadoresBitwise {
    static void main() {
        //Utilizado em porgrmação de baixo nível

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mask = 0b00100000;

        if((n & mask) != 0){
            System.out.println("6th bit is true!");
        }else{
            System.out.println("6th bit is false!");
        }


        sc.close();


    }
}
