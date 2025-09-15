package Practice.MethodAndConstructor.MathodOverloading;/*Write a class MathOperation with overloaded methods add() that works for:
two integers
two doubles
three integers
Call each version and print results.
package Practice.MethodAndConstructor;*/

public class MathOperation {
    public  int add(int a, int b)
    {
        return a+b;
    }

    public double add(double a, double b)
    {

        return a+b;
    }

    public int add(int a, int b, int c)
    {
        return a+b+c;
    }

    public static void main(String[]args)
    {
    MathOperation mathoperation = new MathOperation();
    int result1 = mathoperation.add(4,2);
    System.out.println("Sum of two integers: "+result1);

    double result2 = mathoperation.add(3.55,5.33);
    System.out.println("Sum of two doubles: "+result2);

    int result3 = mathoperation.add(3,64,25);
    System.out.println("Sum of three integers: "+result3);
    }
}
