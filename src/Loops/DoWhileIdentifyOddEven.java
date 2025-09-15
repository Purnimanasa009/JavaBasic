package Loops;
import java.util.Scanner;

public class DoWhileIdentifyOddEven {
    public static void main(String[] args) {
        int number;
        String choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println("It is a prime number");
            } else
                System.out.println("It is an even number");
            System.out.println("Do you want to verify another number(Y/N)");
            choice = sc.next();
        }
        while (choice.equalsIgnoreCase("y"));
        System.out.println("Thank you for coming");


    }
}