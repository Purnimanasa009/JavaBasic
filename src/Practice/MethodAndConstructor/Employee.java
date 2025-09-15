package Practice.MethodAndConstructor;

public class Employee {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void displayDetails()
    {
     System.out.println("Emplyee id: "+ id + " Emplyee Name: " +name + " Emplyee Salary: " + salary);
    }

    public static void main(String[]args)
    {
        Employee employee1 = new Employee(01,"Purnima Sharma",150000);
        Employee employee2 = new Employee(02,"Mayank",250000);
        Employee employee3 = new Employee(03,"Purnima Nasa",500000);
        employee1.displayDetails();
        employee2.displayDetails();
        employee3.displayDetails();

    }




}
