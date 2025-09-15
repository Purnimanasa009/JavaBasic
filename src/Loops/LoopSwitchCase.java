package Loops;

import java.util.Scanner;

public class LoopSwitchCase {
public static void main(String[] args) {
    double a;
    double b;
    double result;
    String choice;
    String operation;
    do {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number ");
        a = sc.nextDouble();

        System.out.println("Enter second number ");
        b = sc.nextDouble();

        System.out.println("Enter Operation");
        operation = sc.next();
        switch (operation) {
            case "add":
                result = a + b;
                System.out.println("Addition result = " + result);
                break;
            case "sub":
                result = a - b;
                System.out.println("Subtraction result = " + result);
                break;
            case "mult":
                result = a * b;
                System.out.println("Multiplication result = " + result);
                break;
            case "div":
                result = a / b;
                System.out.println("Division result = " + result);
                break;
            case "mod":
                result = a % b;
                System.out.println("Mod result = " + result);
                break;
            default:
                System.out.println("Operation is not valid");
        }
        System.out.println("Do you want to continue(Y/N)");
        choice = sc.next();
    }
        while (choice.equalsIgnoreCase("Y")) ;
    }


}
