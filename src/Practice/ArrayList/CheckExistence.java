/* Check if "Mango" exists in the list using contains().
Print "Found" or "Not Found".
 */
package Practice.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CheckExistence {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Guava");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Kiwi");
       // fruits.add("Mango");

        if(fruits.contains("Mango"))
            System.out.println("Found");

        else
            System.out.println("Not Found");
    }

}
