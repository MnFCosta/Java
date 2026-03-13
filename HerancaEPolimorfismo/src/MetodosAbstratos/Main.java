package MetodosAbstratos;

import MetodosAbstratos.entities.Circle;
import MetodosAbstratos.entities.Rectangle;
import MetodosAbstratos.entities.Shape;
import MetodosAbstratos.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Shape #%d data:%n", i+1);
            System.out.print("Rectangle or circle (r/c)? ");
            String rc = sc.nextLine();

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());

            if (rc.equals("c")){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                sc.nextLine();

                list.add(new Circle(color, radius));

            }else if (rc.equals("r")){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                sc.nextLine();

                list.add(new Rectangle(color, width, height));
            }
        }

        System.out.println("SHAPE AREAS:");
        for (Shape shape : list){
            System.out.printf("Area: %.2f", shape.area());
        }

        sc.close();
    }
}
