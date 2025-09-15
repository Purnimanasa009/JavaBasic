//Create a class name it as student
//Data members . rno, name , marks
//Member function : display()
//Create 2 objects → assign them some values → print using display() method
package ClassNConstructors;

public class Student
{

    int rno;
    String name;
    Double marks;

    void display()
    {
        System.out.println("Roll number: "+ rno);
        System.out.println("Name: " +name);
        System.out.println("Marks: "+marks);
    }

    public static  void main(String[] args)
    {
        Student s = new Student();
        s.rno = 10;
        s.name = "Purnima";
        s.marks = 96.5;
        s.display();

        Student s1 = new Student();
        s1.rno = 13;
        s1.name = "Meenu";
        s1.marks = 95.00;
        s1.display();
    }

}
