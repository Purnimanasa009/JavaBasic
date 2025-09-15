//Start with 0 and 1, then just keep adding the last two numbers to get the next one.
public class FibonacciSeries {
    public static void main(String[]args)
    {
        int f0 = 0;
        int f1 = 1;
        int series;
        int i;
        System.out.println("Fibonacci Series ");
        System.out.println(+f0);
        System.out.println(+f1);
        for(i=1;i<=20; i++)
        {
            series = f0+f1;
             f0 = f1;
            f1= series;
            System.out.println(+series);
        }

    }
}
