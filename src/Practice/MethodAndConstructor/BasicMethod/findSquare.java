package Practice.MethodAndConstructor.BasicMethod;

public class findSquare {

    public int sqr(int num)
    {

        return num*num;
    }

    public static void main(String[]args)
    {
        findSquare findsquare = new findSquare();
        int fs = findsquare.sqr(3);
        System.out.println(fs);

    }
}
