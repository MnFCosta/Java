package MetodosAbstratos.entities;

import MetodosAbstratos.entities.enums.Color;

public class Circle extends Shape{
    private double radius;

    public Circle (Color color, double radius){
        super(color);
        this.radius = radius;
    }

    public Double area(){
        return Math.PI * radius * radius;
    }
}
