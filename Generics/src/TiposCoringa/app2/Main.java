package TiposCoringa.app2;

import TiposCoringa.model.entities.Circle;
import TiposCoringa.model.entities.Rectangle;
import TiposCoringa.model.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0,2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myShapes));
        System.out.println("Total area: " + totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;

        for(Shape shape : list){
            sum += shape.area();
        }

        return sum;
    }

}
