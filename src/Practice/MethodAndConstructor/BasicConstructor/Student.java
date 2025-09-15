/*Create a class Student with attributes name and age.
 Write a no-arg constructor that initializes default values and print them. */

package Practice.MethodAndConstructor.BasicConstructor;

public class Student {
    String name;
    int age;

    Student()
    {
        name = "Purnima";
        age = 29;

    }
    public static void main(String[]args)
    {
        Student student = new Student();
        String studentName = student.name;
       int studentAge = student.age;
    System.out.println("Student name: "+studentName);
    System.out.println("Student age: "+studentAge);
    }
}
