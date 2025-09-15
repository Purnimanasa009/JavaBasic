/*Create a parameterized constructor for Student that takes name and age as arguments
and initializes them. Print details.*/
package Practice.MethodAndConstructor.BasicConstructor;

public class StudentWithParameter {
    String name;
    int age;

    StudentWithParameter(String n, int a)
    {
        name = n;
        age = a;

    }

    public static void main(String[]args)
    {
        StudentWithParameter student = new StudentWithParameter("Purnima", 29);
        System.out.println("Name "+student.name + " "+ "Age " + student.age );

    }

}
