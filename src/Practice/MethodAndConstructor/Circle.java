package Practice.MethodAndConstructor;

public class Circle {
    double radius;
    double result;
    Circle(double radius)
    {
        this.radius = radius;

    }
    double calculateArea()
    {
        result = 3.14*radius*radius;
        return result;

    }
    double calculatePerimeter()
    {
        result = 2*3.14*radius;
        return result;
    }


    public static void main(String[]args)
    {
        Circle circle1 = new Circle(4.3);
        System.out.println("Area of a Circle 1: " +circle1.calculateArea());
        System.out.println("Paramitter of a Circle 1: " +circle1.calculatePerimeter());

        Circle circle2 = new Circle(8.0);
        System.out.println("Area of a Circle 2: " +circle2.calculateArea());
        System.out.println("Paramitter of a Circle 2: " +circle2.calculatePerimeter());

    }
}
