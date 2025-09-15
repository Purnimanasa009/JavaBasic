package Practice.Switch;

import java.util.Scanner;

public class sumOfTwoNumber {
    public static void main(String[] args) {

        int num1, num2;
        int sum;

        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter first number");
            num1 = Integer.parseInt(scanner.next());
            System.out.println("Enter second number");
            num2 = Integer.parseInt(scanner.next());
            sum = num1 + num2;
            System.out.println("Sum of two number:" + sum);

            System.out.println("Do you want perform sum operation again: (Y/N)");
            choice = scanner.next();

        }

        while (choice.equalsIgnoreCase("y"));

        System.out.println("Thank You");

        scanner.close();


    }
}