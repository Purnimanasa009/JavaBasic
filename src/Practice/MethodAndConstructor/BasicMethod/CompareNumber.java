package Practice.MethodAndConstructor.BasicMethod;

public class CompareNumber {
    int findMax(int a, int b, int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        else if(b>a && b>c)
        {
            return b;
        }
        else
            return c;
    }
    public static void main(String[]args)
    {
        CompareNumber maxnumber = new CompareNumber();
        int max = maxnumber.findMax(7,5,12);
        System.out.println(max +" is the grater then all");
    }


}
