
package Practice.MethodAndConstructor.ConstructorOverloading;

public class Book {
    String Title;
    String Author;
    double Price;

    Book()
    {
        Title = "Unknown";
        Author = "Unknown";
        Price = 10.0;
    }
    Book(String Title)
    {
        this(); //call no argument constructor before continuing with the rest of the arguments
        this.Title = Title;


    }
    Book(String Title, String Author)
    {
        this(Title); //Call single argument constructor before continuing with the rest of the arguments
        this.Author = Author;


    }
    Book(String Title, String Author, Double Price)
    {
        this(Title,Author);
        this.Price = Price;
    }

    void display() {
        System.out.println("Title: " + Title + " Author: " + Author + " Price: " + Price);
    }
    public static void main(String[]args)
    {
        Book book1 = new Book();
        book1.display();

        Book book2 = new Book("Atomic Habit");
        book2.display();

        Book book3 = new Book("Ikigai" , "Héctor García");
        book3.display();
        Book book4 = new Book("Eat That Frog" , "Brian Tracy", 300.99);
        book4.display();


    }
}
