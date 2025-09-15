package Practice.MethodAndConstructor.ConstructorOverloading;


public class Book1 {
    String title;
    String author;
    String book;
    Book1()
    {
        book = "unknown";
    }
    Book1(String title, String author)
    {
       this.title = title;
        this.author = author;
    }

    public static void main(String[]args)
    {
      Book1 bookdescription = new Book1("Atomic Habit","James Clear"); //object of arg constructor
     String Title = bookdescription.title;
     String Author = bookdescription.author; //saved in variable
     System.out.println(Title);
     System.out.println(Author);

      System.out.println(bookdescription.title); // without saving in variable
      System.out.println(bookdescription.author);

      Book1 newbook = new Book1();  //object of no-arg constructor
      System.out.println(newbook.book);



    }
}
