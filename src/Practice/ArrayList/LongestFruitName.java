//Find and print the fruit with the longest name.
package Practice.ArrayList;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class LongestFruitName {
    public static void main(String[]args) {
        String longestFruit = "";

        List<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Kiwi");

        for (String fruit : fruits)
            {
                if (fruit.length() > longestFruit.length()) {
                    longestFruit = fruit;
                }


        }
        System.out.println("Fruit with the longest name: " + longestFruit);
    }}
