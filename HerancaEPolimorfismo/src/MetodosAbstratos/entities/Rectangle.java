package MetodosAbstratos.entities;

import MetodosAbstratos.entities.enums.Color;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle (Color color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double area(){
        return height * width;
    }

}
