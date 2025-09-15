package Practice.MethodAndConstructor.BasicMethod;

public class EvenOdd {
    boolean isEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
            return false;

    }
    public static void main(String[]args)
    {
        EvenOdd ed = new EvenOdd();
        boolean result = ed.isEven(191);
        System.out.println(result);
    }
}
