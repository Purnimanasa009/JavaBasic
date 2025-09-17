/*Reverse the order of fruits.
Print the result.
*/

package Practice.ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortTheList {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Guava");
        fruit.add("Pineapple");
        fruit.add("Plum");
        Collections.sort(fruit);
        System.out.println("Alphabetic Order: "+fruit);
        Collections.sort(fruit, Collections.reverseOrder());
        System.out.println("Revers Order: "+fruit);
    }
}
