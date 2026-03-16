package TryCatchFinallyStructure;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Finally {
    static void main() {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("TryCatchFinallyStructure.Finally block executed");
        }
    }
}
