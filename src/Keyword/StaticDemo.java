package Keyword;

public class StaticDemo {
    int rollNo;
    String name;
   static String collage = "ITS";

    void display()
    {
        System.out.println("Rol Num: " +rollNo);
        System.out.println("Name: " + name);
        System.out.println("collage: " +collage);
    }

    public static void main(String[]args)
    {
        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();
        StaticDemo s3 = new StaticDemo();

        s1.rollNo= 1;
        s1.name = "Purnima";
        s1.collage = "Hasraj";


        s2.rollNo= 3;
        s2.name = "Meera";
        s2.collage = "JDM";


        s3.rollNo= 13;
        s3.name = "Leena";
        s3.collage = "ITC";
        StaticDemo.collage = "Delhi College";

        s1.display();
        s2.display();
        s3.display();

    }

}
