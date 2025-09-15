package Keyword;

public class Student {
    int rollNo;
    String sub;
   public static double marks;

    public static void staticMethod1()
    {
        System.out.println("I am static method");
        //System.out.println("Roll number: " +rollNo); //not static not allowed
        //System.out.println("Subject: "+ sub); //not static not allowed
        System.out.println("Marks: "+marks);

    }
    static void staticMethod2()
    {
        System.out.println("I am static method 2");
        Student.staticMethod1();
      //  Student.nonStaticMethod1(); //not static not allowed
    }
    void nonStaticMethod1()
    {
        System.out.println("I am static method"); //Static and non static both are allowed
        System.out.println("Roll number: " +rollNo);
        System.out.println("Subject: "+ sub);
        System.out.println("Marks: "+marks);
        Student.staticMethod1();
        Student.staticMethod2();


    }
    public static void main(String[]args)
    {
        Student s1 = new Student();
        s1.nonStaticMethod1();
        s1.staticMethod1();
        s1.staticMethod2(); //call by object

        Student.staticMethod1();
        Student.staticMethod2(); // call by class, Static method can be call by class
       // Student.nonstaticMethod1(); // not static method can not be call by class
    }

    public void marks() {

    }
}

