import java.util.Arrays;
import java.util.Scanner;

public class Funcoes {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre 3 números");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] nums = {a,b,c};

        System.out.printf("Highest = %s", checkHighest(nums));

        sc.close();
    }


    public static int checkHighest(int[] nums){
        int currHighest = 0;

        for (int i = 0; i < nums.length; i++){
            int checkHighest = nums[i];

            if (checkHighest >= currHighest){
                currHighest = checkHighest;
            }
        }

        return currHighest;
    }
}
