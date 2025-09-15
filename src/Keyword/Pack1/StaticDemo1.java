package Keyword.Pack1;

import Keyword.Student;

public class StaticDemo1 {
    public static void main(String[]args)
    {
        Student s1 = new Student();
        Student.staticMethod1();
        s1.marks();


    }
}
