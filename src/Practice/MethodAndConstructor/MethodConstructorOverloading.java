package Practice.MethodAndConstructor;

public class MethodConstructorOverloading {

    int a;
    int b;
    int result;

    int add(int a, int b)
    {
        result = a+b;
        return result;
    }
    int add(int a, int b, int c)
    {
        result = a+b+c;
        return result;
    }
    MethodConstructorOverloading()
    {
        this.a = 0;
        this.b = 0;
        result = 50;
    }
    MethodConstructorOverloading(int a, int b)
    {
        this.a = a;
        this.b = b;
        result = a+b;

    }
    void display(){
        System.out.println(result);
    }
    public static void main(String[]ars)
    {
        MethodConstructorOverloading obj2 = new MethodConstructorOverloading();
        obj2.display();
        obj2.add(5,5,8);
        obj2.display();

        MethodConstructorOverloading obj1 = new MethodConstructorOverloading(4,2);
        obj1.display();

        obj1.add(3,9);
        obj1.display();

    }
}
