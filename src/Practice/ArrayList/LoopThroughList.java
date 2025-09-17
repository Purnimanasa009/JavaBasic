/*Use a for loop to print each fruit on a new line.
*/
package Practice.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class LoopThroughList {
    public static void main(String[]args)
    {
        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Guava");
        fruit.add("Pineapple");
        fruit.add("Plum");

        for(int i=0;i< fruit.size();i++)
        {
            System.out.println(fruit.get(i));
        }
    }
}
