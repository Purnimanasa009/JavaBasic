package MethodOverloading;
public class OverLoadingDemo {
    int a;
    int b;
    int c;
    int d;
    OverLoadingDemo()
    {
        this.a = 10;
        this.b = 20;
        this.c = 30;
        int d = 40;
    }
    void load(int a, int b)
    {
        int c;
        c= this.a+this.b;
        System.out.println(c);
    }
    void load(int a, int b, int c)
    {
        int d;
        d= a+b+c;
        System.out.println(d);

    }
    void load(int a, int b, int c, int d)
    {
        int e;
        e = this.a +b+c-d;
        System.out.println(e);

 }
    public static void main(String[]args)
    {
    OverLoadingDemo ol = new OverLoadingDemo();
    ol.load(4,4);
    ol.load(8,9,2);
    ol.load(19,19,19,100);
    }
}
