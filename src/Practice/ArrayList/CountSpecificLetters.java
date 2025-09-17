//Count how many fruits start with the letter 'A'.
package Practice.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CountSpecificLetters {
    static int count = 0;

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apricot");
        fruits.add("Pineapple");
        fruits.add("Muskmelon");
        fruits.add("Walnut");
        fruits.add("Watermelon");

        for (String fruit : fruits) {
            if (fruit.startsWith("A"))
                count++;

        }

            System.out.println("Number of Fruits started with A: " +count);
        }

}
