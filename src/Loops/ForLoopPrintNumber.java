package Loops;

public class ForLoopPrintNumber {
    public static void main(String []args)
    {
        int n;
        for (n=1;n<=30;n++)
           if (n%3==0 && n%5==0)
        System.out.println(n  + " FizzBuzz");
           else if(n%5==0)
               System.out.println(n + " Buzz");
        else if(n%3==0)
            System.out.println(n + " Fizz");
       else
       System.out.println(n);

    }
}
