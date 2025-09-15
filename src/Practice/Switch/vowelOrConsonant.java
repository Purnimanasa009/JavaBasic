package Practice.Switch;

import java.util.Scanner;
import java.lang.String;

public class vowelOrConsonant {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter an alphabet a-z of A-Z");
            String alpha = scanner.next();

            switch (alpha.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println(alpha + " is a VOWEL");
                    break;

                default:
                    System.out.println(alpha + " is a CONSONANT");
            }
            System.out.println("Are you want to continue? Y/N");
            choice = scanner.next();
        }
        while(choice.equalsIgnoreCase("y"));
               System.out.println(" Thank You");
           scanner.close();

       }
}
