public class Marks {
    public static void main(String[] args) {
        double marks = 78;
        if (marks < 40)


            System.out.println("Fail");

        else if (marks >= 40 && marks < 60)

            System.out.println("Second Division");


        else if (marks >= 60 && marks < 75)

            System.out.println("First Division");

        else if (marks >= 75 && marks <= 100)

            System.out.println("Distinction");

        else

            System.out.println("Invalid input");


    }
}