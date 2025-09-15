/*Create overloaded methods area() to calculate area of:
Circle (area(double radius))
Rectangle (area(double length, double width))
Square (area(int side)) */

package Practice.MethodAndConstructor.MathodOverloading;

public class CalculateArea {
    public double area(double radius)
    {
        return 3.14*radius*radius;
    }

    public double area (double length, double width)
    {
        return length*width;
    }

    public int area(int side)
    {
        return side*side;
    }

    public static void main(String[]args)
    {
        CalculateArea calarea = new CalculateArea();
        double circleArea = calarea.area(5.3);
        System.out.println("Area of a Circle: " +circleArea);

        double rectangleArea = calarea.area(4.3,6.3);
        System.out.println("Area of a Rectangle: "+rectangleArea);

        int squareArea = calarea.area(5);
        System.out.println("Area of a Square: "+squareArea);
        }

    }


