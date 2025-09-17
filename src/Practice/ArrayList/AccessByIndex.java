/* Get the first and last fruit from the list using get(index).
Print them.
 */
package Practice.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AccessByIndex {
    public static void main(String[]args)
    {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Grapes");
        fruits.add("Guava");
        System.out.println(fruits.getFirst());
        System.out.println(fruits.getLast());
    }
}
