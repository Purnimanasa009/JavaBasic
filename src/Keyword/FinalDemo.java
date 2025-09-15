package Keyword;

public class FinalDemo {
    final int speed =100;
    void change()
    {
       // speed = 200;
        //If the variable is final we can not reassign it
    }
    public static void main(String[]args)
    {
        FinalDemo ob = new FinalDemo();
        ob.change();
        System.out.println(ob.speed);

    }

}
