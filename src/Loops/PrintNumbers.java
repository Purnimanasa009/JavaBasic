package Loops;

import java.util.Scanner;

// Print Numbers from 1 to 5
public class PrintNumbers {
    public static void main(String []args)
    {   
        int i = 0;
        int a;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter first number");
            a = sc.nextInt();
            System.out.println(a);
            i++;
        }
        while (i<=5);
        System.out.println("Five numbers of the series is already printed");
    }
}
