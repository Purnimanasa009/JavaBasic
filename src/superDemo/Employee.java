package superDemo;

public class Employee {
    int salary = 60000;
    int bonus = 25000;

    void empWork()
    {
        System.out.println("EmpWork");

    }

}
class Programer extends Employee{
    int salary = 100000;
    int bonus = 50000;

    void programerWork()
    {
        System.out.println("Programer Work");

    }

    void display()
    {
    System.out.println("Salary: " +super.salary );//By adding super keyword with data member it will call the data member of parant class
    System.out.println("Bonus: "+bonus);// it is calling the data mamber of child class

    }
    public static void main(String[]args)
    {
        Programer p = new Programer();
        p.display();
    }
}
