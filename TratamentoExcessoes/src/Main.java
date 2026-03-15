import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {
        method1();
        System.out.println("End");


    }

    public static void method1(){
        System.out.println("***Method 1 Start***");

        method2();

        System.out.println("***Method 1 End***");
    }

    public static void method2(){
        System.out.println("***Method 2 Start***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
        }catch (InputMismatchException e){
            System.out.println("Input Error!");
        }

        sc.close();
        System.out.println("***Method 2 End***");
    }
}
