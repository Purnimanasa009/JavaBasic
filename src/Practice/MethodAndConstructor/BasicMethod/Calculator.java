package Practice.MethodAndConstructor.BasicMethod;

public class Calculator {

   public int add(int a, int b)
   {
       return a+b;
   }
   public int subtract(int a, int b)
   {
       return a-b;
   }
   public int multiply(int a, int b)
   {
    return a*b;
   }
    public int divide(int a, int b)
    {
        return a/b;
    }



    public static void main(String[]args)
    {
     Calculator cal = new Calculator();

     int sum=cal.add(5,2);
     System.out.println(sum);

     int sub=cal.subtract(9,3);
     System.out.println(sub);

    int mult = cal.multiply(8,4);
    System.out.println(mult);

    int div = cal.divide(81, 3);
    System.out.println(div);
    }
}
