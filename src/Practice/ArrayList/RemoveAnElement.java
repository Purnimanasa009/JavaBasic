/*Remove "Apple" from the list.
Print the updated list.*/

package Practice.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveAnElement {
    public static void main(String[]args)
    {
        List<String> fruit = new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Guava");
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Pineapple");

        System.out.println("Original list: " + fruit);
       // fruit.remove("Apple");
        fruit.removeIf(f->f.equals("Apple"));
        System.out.print("Updated List: " +fruit);
    }
}
