package Practice.MethodAndConstructor.ConstructorOverloading;

import org.w3c.dom.css.Rect;

import java.util.Random;

public class Rectangle {
    int length;
    int breadth;
    int area;
    Rectangle()
    {
        length =4;
        breadth=6;
        area = length*breadth;
    }
    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
        area = length*breadth;
    }

    public static void main(String[]args)
    {
        Rectangle rectangle = new Rectangle();
        System.out.println("Area of Rectangle by default values: " +rectangle.area);

        Rectangle rectangleWithArgs = new Rectangle(9,4);
        System.out.println("Area of Ractangle with arguments: "+rectangleWithArgs.area);
    }
}
