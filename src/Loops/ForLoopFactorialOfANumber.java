package Loops;
//Factorial of 5 is 5*4*3*2*1
public class ForLoopFactorialOfANumber {
    public static void main(String[]args)
    {
        int fact = 1;
        for (int n=5;n>=1;n--)
            fact = fact * n;

        System.out.println("Factorial of = " + fact);

    }
}
