/*
Problem Statement: Add and Print
Add 5 fruit names to the list.
Print the list.
List<String> → The type of the variable (a list of strings).
fruits → The variable name.
= → Assigns the new object.
new ArrayList<>() → Creates a new empty list object.
 */
package Practice.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AddAndPrint {
    public static void main(String[]args)
    {
        List<String> fruit = new ArrayList<String>();

        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Greps");
        fruit.add("Kiwi");
        fruit.add("Pomegranate");

        System.out.println(fruit);


    }
}
